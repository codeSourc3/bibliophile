package com.bibliophile.common;

public abstract class AggregateRoot<ID> {
	private ID id;
	
	public AggregateRoot(ID id) {
		this.id = id;
	}
	
	public ID getId() {
		return id;
	}
}
