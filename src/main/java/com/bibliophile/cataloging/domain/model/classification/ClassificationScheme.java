package com.bibliophile.cataloging.domain.model.classification;


import com.bibliophile.cataloging.domain.model.resources.ResourceId;

public interface ClassificationScheme {
	CallNumber classify(ResourceId id); // should probably be AcquisitionId
}
