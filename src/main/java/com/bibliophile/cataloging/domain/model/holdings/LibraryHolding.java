package com.bibliophile.cataloging.domain.model.holdings;

import com.bibliophile.common.AggregateRoot;

public class LibraryHolding extends AggregateRoot<HoldingId> {
	
	private Barcode barcode;
	private CallNumber callNumber;
	private Availability availability;
	private final String title;
	
	public enum Availability {
		AVAILABLE, UNAVAILABLE
	}
	
	private LibraryHolding(String title, Availability availability) {
		super(HoldingId.createRandomUnique());
		this.title = title;
		this.availability = availability;
	}
	
	public static LibraryHolding newUncatalogedHolding(String title) {
		return new LibraryHolding(title, Availability.UNAVAILABLE);
	}
	
	public void checkOut() {
		
		this.availability = Availability.UNAVAILABLE;
	}
	
	public void checkIn() {
		this.availability = Availability.AVAILABLE;
	}
	
}
