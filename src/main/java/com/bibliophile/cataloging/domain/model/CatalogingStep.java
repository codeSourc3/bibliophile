package com.bibliophile.cataloging.domain.model;

import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

public abstract class CatalogingStep {
	private ZonedDateTime startTime;
	private ZonedDateTime endTime;
	
	public abstract boolean isCompleted();
	
	public void start() {
		this.startTime = ZonedDateTime.now();
	}
	
	public void start(ZoneId id) {
		this.startTime = ZonedDateTime.now(id);
	}
	
	public void startAt(Instant time, ZoneId zone) {
		this.startTime = ZonedDateTime.ofInstant(time, zone);
	}
	
	public void stop() {
		this.endTime = ZonedDateTime.now();
	}
	
	public void stopAt(Instant stopTime, ZoneId zone) {
		this.endTime = ZonedDateTime.ofInstant(stopTime, zone);
	}
	
	public Period getTimeTaken() {
		Objects.requireNonNull(startTime);
		Objects.requireNonNull(endTime);
		return Period.between(this.startTime.toLocalDate(), this.endTime.toLocalDate());
	}
}
