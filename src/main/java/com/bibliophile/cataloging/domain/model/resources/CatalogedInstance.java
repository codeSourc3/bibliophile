package com.bibliophile.cataloging.domain.model.resources;
import java.util.ArrayList;
import java.util.List;

import com.bibliophile.cataloging.domain.model.holdings.HoldingId;
public abstract class CatalogedInstance {
	private Long id;
	private Format format;
	private CatalogedResource resource;
	private List<HoldingId> holdings;
	CatalogedInstance(Long id,CatalogedResource resource, Format format) {
		this.format = format;
		this.resource = resource;
		this.id = id;
		this.holdings = new ArrayList<HoldingId>();
	}
	
	public void addHolding(HoldingId id) {
		this.holdings.add(id);
	}
	
	public boolean isFormat(Format format) {
		return this.format.equals(format);
	}
	
	public abstract Format getFormat();
}
