package com.bibliophile.cataloging.domain.model.resources;

import java.io.Serializable;
import java.util.Locale;

public final class StreetAddress implements Serializable, Comparable<StreetAddress>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String streetAddress;
	private final PostalCode postalCode;
	private final String city;
	private final Locale country;
	
	public StreetAddress(String streetAddress, PostalCode postalCode, String city, Locale country) {
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.city = city;
		this.country = country;
	}


	public int compareTo(StreetAddress o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public String getStreetAddress() {
		return streetAddress;
	}


	public PostalCode getPostalCode() {
		return postalCode;
	}


	public String getCity() {
		return city;
	}


	public Locale getCountry() {
		return country;
	}
	
	public static class Builder {
		private String streetAddress;
		private PostalCode postalCode;
		private String city;
		private Locale country;
		
		public Builder() {
			
		}
		
		public Builder(StreetAddress original) {
			streetAddress = original.streetAddress;
			postalCode = original.postalCode;
			city = original.city;
			country = original.country;
		}
		
		public Builder withStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
			return this;
		}
		
		public Builder withPostalCode(PostalCode postalCode) {
			this.postalCode = postalCode;
			return this;
		}
		
		public Builder withCity(String city) {
			this.city = city;
			return this;
		}
		
		public Builder withCountry(Locale country) {
			this.country = country;
			return this;
		}
		
		public StreetAddress build() {
			return new StreetAddress(streetAddress, postalCode, city, country);
		}
	}
}