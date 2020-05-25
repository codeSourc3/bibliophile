package com.bibliophile.cataloging.domain.model.resources;

import java.util.regex.Pattern;

public abstract class Identifier {
	private final Pattern pattern;
	private final String id;
	
	protected Identifier(String pattern, String id) {
		this.pattern = Pattern.compile(pattern);
		if (!isValid(pattern, id)) {
			throw new IllegalArgumentException("Id parameter doesn't match the pattern");
		}
		this.id = id;
	}
	
	protected Identifier(Pattern pattern, String id) {
		this.pattern = pattern;
		if (!this.pattern.matcher(id).matches()) {
			throw new IllegalArgumentException("Id parameter doesn't match the pattern");
		}
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == null) return false;
		if (obj instanceof Identifier) {
			if (this.pattern.pattern().equals(((Identifier) obj).getPattern())) {
				return ((Identifier) obj).getId().equals(this.id);
			}
		}
		return false;
	}
	
	public boolean isSameIdType(Identifier id) {
		return id.getPattern().equals(this.getPattern());
	}
	
	String getPattern() {
		return this.pattern.pattern();
	}
	
	String getId() {
		return this.id;
	}
	
	private boolean isValid(String pattern, String value) {
		return Pattern.matches(pattern, value);
	}
}
