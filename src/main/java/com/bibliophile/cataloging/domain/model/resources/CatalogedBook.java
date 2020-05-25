package com.bibliophile.cataloging.domain.model.resources;
import java.util.Optional;
public class CatalogedBook extends CatalogedInstance {
	private final ISBN10 isbn10;
	private final ISBN13 isbn13;
	
	public CatalogedBook(Long id, CatalogedResource resource, ISBN10 isbn10, ISBN13 isbn13) {
		super(id, resource, Format.BOOK);
		this.isbn10 = isbn10;
		this.isbn13 = isbn13;
	}

	public String getISBN10OrISBN13() {
		return Optional.ofNullable(this.isbn10.getId()).orElse(this.isbn13.getId());
	}
	
	@Override
	public Format getFormat() {
		return Format.BOOK;
	}
}
