package com.bibliophile.cataloging.domain.model.resources;

public class Subject {
	private final String subjectName;
	
	public Subject(String name) {
		this.subjectName = name;
	}
	
	public String getSubject() {
		return subjectName;
	}
	
	public boolean equals(Object other) {
		if (other == null) return false;
		if (other instanceof Subject) {
			return ((Subject) other).getSubject().equals(subjectName);
		} else {
			return false;
		}
		
	}
}
