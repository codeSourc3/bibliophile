package com.bibliophile.cataloging.domain.model.resources;

public class ISBN13 extends Identifier {
	private final static String PATTERN = "^(?:ISBN(?:-13)?:? )?(?=[0-9]{13}$|"
+ "(?=(?:[0-9]+[- ]){4})[- 0-9]{17}$)97[89][- ]?[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9]$";
	
	public ISBN13(String value) {
		super(PATTERN, value);
	}
}
