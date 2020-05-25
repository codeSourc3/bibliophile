package com.bibliophile.cataloging.domain.model.resources;

import java.time.LocalDate;
import java.util.Locale;

/**
 * The publishing information associated with a resource.
 * @author enzoj
 *
 */
public class PublishingInformation {
	private LocalDate dateOfPublication;
	private StreetAddress streetAddress;
	private Contributor publisher;
	
	public PublishingInformation(LocalDate date, StreetAddress address, Contributor publisher) {
		this.dateOfPublication = date;
		this.streetAddress = address;
		this.publisher = publisher;
	}
	
	public PublishingInformation(LocalDate date, String streetAddress, PostalCode code, String city, Locale country, Contributor publisher) {
		this(date, new StreetAddress(streetAddress,code,city,country), publisher);
	}
	
	public StreetAddress getAddress() {
		return streetAddress;

	}
	
	public boolean publishedBetween(LocalDate firstDate, LocalDate secondDate) {
		return this.dateOfPublication.isAfter(firstDate) && this.dateOfPublication.isBefore(secondDate);
	}
	
	public boolean publishedIn(Locale country) {
		return this.streetAddress.getCountry().equals(country);
	}
	
	public boolean publishedBy(Contributor publisher) {
		return this.publisher.equals(publisher);
	}
}
