package com.bibliophile.cataloging.domain.model.resources;

public class ISBN10 extends Identifier {
	private static final String PATTERN = "^(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";
	
	public ISBN10(String value) {
		super(PATTERN, value);
	}
}
