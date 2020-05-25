package com.bibliophile.cataloging.domain.model.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResourceDescription {
	private List<Subject> subjects;
	private List<Identifier> identifiers;
	private Map<ContributorId, String> contributors;
	private PublishingInformation information;
	
	public ResourceDescription(PublishingInformation info) {
		this.subjects = new ArrayList<Subject>();
		this.identifiers = new ArrayList<Identifier>();
		this.contributors = new HashMap<ContributorId, String>();
		this.information = info;
	}
	
	// add subjects
	
	// add different types of identifiers
	
	// add contributors
	
	public void addSubject(String subject) {
		this.subjects.add(new Subject(subject));
	}
	
	public void addISBN10(String isbn10) {
		this.identifiers.add(new ISBN10(isbn10));
	}
	
	public void addISBN13(String isbn13) {
		this.identifiers.add(new ISBN13(isbn13));
	}
	
	public void addDOI(String doi) {
		this.identifiers.add(new DOI(doi));
	}
	
	public void addEAN(String ean) {
		this.identifiers.add(new EAN(ean));
	}
	
	public void addISSN(String issn) {
		this.identifiers.add(new ISSN(issn));
	}
	
	public void addContributor(Contributor contributor) {
		this.contributors.put(contributor.getId(), contributor.getName());
	}
	
	public List<Subject> getSubjects() {
		return Collections.unmodifiableList(this.subjects);
	}
	
	public List<Identifier> getIdentifiers() {
		return Collections.unmodifiableList(this.identifiers);
	}
	
	public Map<ContributorId, String> getContributors() {
		return Collections.unmodifiableMap(this.contributors);
	}
	
	PublishingInformation getInfo() {
		return this.information;
	}
}
