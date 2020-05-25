package com.bibliophile.cataloging.domain.model.resources;

import java.util.regex.Pattern;

public class DOI extends Identifier {
	private final static Pattern PATTERN = Pattern.compile("^(?:urn:)?(?:doi:)?"
		    + "(10(?:\\.[0-9]+)+)"
		    + "/(.+)$", Pattern.CASE_INSENSITIVE);
	
	public DOI(String value) {
		super(PATTERN, value);
	}
}
