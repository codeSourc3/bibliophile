package com.bibliophile.cataloging.domain.model.resources;

public class ISSN extends Identifier {
	private final static String PATTERN = "\\d{4}-\\d{3}(\\d|x|X)";
	
	public ISSN(String value) {
		super(PATTERN, value);
	}
}
