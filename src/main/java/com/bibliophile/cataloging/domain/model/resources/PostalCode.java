package com.bibliophile.cataloging.domain.model.resources;

import java.util.Objects;

public class PostalCode {
	private String code;
	
	public PostalCode(String code) {
		this.code = Objects.requireNonNull(code);
	}
	
	public String getCode() {
		return this.code;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj instanceof PostalCode) {
			PostalCode code = (PostalCode) obj;
			if (code.code.equals(this.code)) {
				return true;
			}
		}
		return false;
	}
}
