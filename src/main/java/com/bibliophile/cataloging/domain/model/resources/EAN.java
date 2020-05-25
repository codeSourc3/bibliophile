package com.bibliophile.cataloging.domain.model.resources;

public class EAN extends Identifier {
	private static final String EAN_PATTERN = "(?<=\\s)\\d{13}(?=\\s)";
	public EAN(String value) {
		super(EAN_PATTERN, value);
	}
}
