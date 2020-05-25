package com.bibliophile.cataloging.domain.model.resources;

public enum ContributorRole {
	AUTHOR("Author",true, true, false), 
	EDITOR("Editor",true, true, true), 
	ACTOR("Actor", false, false, true), 
	ADVISOR("Advisor", true, true, true), 
	ADVISOR_CHAIR("Advisor Chair", true, true, true), 
	ADVISOR_DEPT_CHAIR("Department Chair Advisor", true, true, true), 
	ARTIST("Artist", true, true, true), 
	DESIGNER("Designer", true, true, true), 
	DIRECTOR("Director", false, false, true),
	EDITOR_ART("Art Editor", false, false, true), 
	EDITOR_CAMPUS("Campus Editor", false, true, false), 
	EDITOR_COPY("Copy Editor", false, true, false), 
	EDITOR_DEPUTY_MAN("Deputy Manager Editor", false, true, false), 
	EDITOR_EXECUTIVE("Executive Editor", false, true, true), 
	EDITOR_FEATURE("Feature Editor", false, true, false), 
	EDITOR_GRAPHIC_ART("Graphic Art Editor", true, true, true),
	EDITOR_MANAGING("Managing Editor", false, true, true), 
	EDITOR_NEWS("News Editor", false, true, false), 
	EDITOR_PHOTO("Photo Editor", true, true, true), 
	EDITOR_PHOTO_ASST("Assistant Photo Editor", true, true, true), 
	EDITOR_SPORTS("Sports Editor", false, true, false), 
	MANAGER_ADVERTISE("Advertising Manager", false, true, true), 
	MANAGER_BUSINESS("Business Manager", true, true, true),
	MANAGER_PHOTO("Photo Manager", false, true, false), 
	ORGANIZATION("Organization", true, true, true), 
	OTHER("Other Role", false, false, false), 
	PHOTOGRAPHER("Photographer", false, true, true), 
	PRODUCER("Producer", false, true, true), 
	REPORTER("Reporter", false, true, false);

	private final String name;
	private final boolean isForMonographs;
	private final boolean isForPeriodicals;
	private final boolean isForMovies;

	ContributorRole(String name,boolean isMono, boolean isPer, boolean isMov) {
		this.name = name;
		this.isForMonographs = isMono;
		this.isForPeriodicals = isPer;
		this.isForMovies = isMov;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean isForMonographs() {
		return this.isForMonographs;
	}
	
	public boolean isForPeriodicals() {
		return this.isForPeriodicals;
	}
	
	public boolean isForMovies() {
		return this.isForMovies;
	}
}
