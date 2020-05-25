package com.bibliophile.cataloging.domain.model.classification;

public abstract class CallNumber {
	private String prefix;
	private String middle;
	private String suffix;
	
	private CallNumber(String prefix, String middle, String suffix) {
		this.prefix = prefix;
		this.middle = middle;
		this.suffix = suffix;
	}
	
	
}
