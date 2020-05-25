package com.bibliophile.cataloging.domain.model.holdings;

import java.util.Objects;

import com.bibliophile.cataloging.domain.model.resources.ClassificationScheme;

public class CallNumber {
	private String prefix;
	private String suffix;
	private String middle;
	private ClassificationScheme scheme;
	
	CallNumber(ClassificationScheme scheme, String pre, String mid, String suff) {
		this.prefix = Objects.requireNonNull(pre);
		this.middle = Objects.requireNonNull(mid);
		this.suffix = Objects.requireNonNull(suff);
		this.scheme = Objects.requireNonNull(scheme);
	}
	
	String getPrefix() {
		return prefix;
	}
	
	String getSuffix() {
		return suffix;
	}
	
	String getMiddle() {
		return middle;
	}
	
	ClassificationScheme getScheme() {
		return scheme;
	}
}
