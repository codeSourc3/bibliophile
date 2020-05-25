package com.bibliophile.cataloging.domain.model.resources;

public class Title {
	private String title;
	
	Title(String title) {
		if (title.isBlank()) {
			throw new IllegalArgumentException("Title cannot be blank");
		}
		this.title = title.strip();
	}
	
	public String getTitle() {
		return title;
	}
}
