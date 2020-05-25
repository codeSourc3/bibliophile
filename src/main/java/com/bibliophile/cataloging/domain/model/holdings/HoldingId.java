package com.bibliophile.cataloging.domain.model.holdings;

import java.util.UUID;

public class HoldingId {
	private UUID holdingId;
	
	private HoldingId() {
		this.holdingId = UUID.randomUUID();
	}
	
	public static HoldingId createRandomUnique() {
		return new HoldingId();
	}
}
