package com.bibliophile.cataloging.domain.model;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represents the entire process of cataloging.
 * Keeps track of who is/was involved, what they're cataloging, and when.
 * @author Enzo Mayo
 * @version 0.0.1
 */
public class CatalogingActivity {
	private ZonedDateTime startDate;
	private ZonedDateTime endDate;
	private List<CatalogingStep> steps;
	
	public CatalogingActivity(List<CatalogingStep> steps) {
		this.steps = steps;
	}
	
	public CatalogingActivity(CatalogingStep...catalogingSteps) {
		this.steps = Arrays.asList(catalogingSteps);
	}
	
	public CatalogingActivity() {
		this.steps = new ArrayList<CatalogingStep>();
	}
	
	public void startCatalogingActivity() {
		this.startDate = ZonedDateTime.now();
	}
	
	public void stopCatalogingActivity() {
		this.endDate = ZonedDateTime.now();
	}
}
