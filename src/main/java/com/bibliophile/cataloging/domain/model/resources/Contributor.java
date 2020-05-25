package com.bibliophile.cataloging.domain.model.resources;

public class Contributor {
	private final Name name; // Can still change the first and last name
	private final ContributorRole role;
	private final ContributorId id;
	
	public Contributor(String firstName, String lastName, ContributorRole role) {
		this.name = new Name(firstName, lastName);
		this.role = role;
		this.id = ContributorId.createRandomUnique();
	}
	
	
	public ContributorId getId() {
		return id;
	}
	
	public String getName() {
		return this.name.getFullName();
	}
	
	
	public ContributorRole getRole() {
		return this.role;
	}
	
	public String getRoleName() {
		return this.role.getName();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("First: %s\nRole: %s", this.name, this.getRoleName());
	}
	
	
	
	class Name {
		private String name;
		private boolean isIndividual;
		Name(String first, String last) {
			this.name = first + " " + last;
			this.isIndividual = true;
		}
		
		Name(String name) {
			this.name = name;
		}
		
		
		public String getFullName() {
			return this.name;
		}
		
		public boolean isPerson() {
			return this.isIndividual;
		}
		
		
		
	}
	
	
}
