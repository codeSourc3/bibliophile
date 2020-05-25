package com.bibliophile.cataloging.domain.model.resources;

import java.util.UUID;

public class ResourceId {
	private UUID resId;
	
	private ResourceId() {
		this.resId = UUID.randomUUID();
	}
	
	public static ResourceId createRandomUnique() {
		return new ResourceId();
	}
	@Override
	public boolean equals(Object other) {
		if (other == null) return false;
		if (other instanceof ResourceId) {
			return ((ResourceId) other).resId.equals(this.resId);
		}
		return false;
	}
}
