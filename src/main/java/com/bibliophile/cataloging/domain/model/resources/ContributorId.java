package com.bibliophile.cataloging.domain.model.resources;

import java.util.UUID;

public class ContributorId {
	private UUID contributorId;
	
	private ContributorId() {
		this.contributorId = UUID.randomUUID();
	}
	
	public static ContributorId createRandomUnique() {
		return new ContributorId();
	}
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (obj instanceof ContributorId) {
			ContributorId id = (ContributorId) obj;
			if (id.contributorId.equals(this.contributorId)) {
				return true;
			}
		}
		return false;
	}
}
