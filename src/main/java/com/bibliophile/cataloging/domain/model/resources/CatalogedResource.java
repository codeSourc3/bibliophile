package com.bibliophile.cataloging.domain.model.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.bibliophile.cataloging.domain.model.holdings.CallNumber;
import com.bibliophile.common.AggregateRoot;

/**
 * The second to last result of the cataloging process. Will be turned into catalog entries.
 * @author enzoj
 *
 */
public class CatalogedResource extends AggregateRoot<ResourceId> {
	private final Title title;
	private List<Subject> subjects;
	 // might be better as a map
	private List<ContributorId> contributors;
	
	private PublishingInformation publishing;
	private List<CatalogedInstance> items;
	
	public CatalogedResource(String title, PublishingInformation info) {
		this(new Title(Objects.requireNonNull(title)),
				new ArrayList<Subject>(),
				new ArrayList<ContributorId>(),
				info);
	}
	
	private CatalogedResource(Title title, List<Subject> subjects, List<ContributorId> contributors, PublishingInformation info) {
		super(ResourceId.createRandomUnique());
		this.title = title;
		this.subjects = subjects;
		
		this.contributors = contributors;
		this.publishing = info;
	}
	
	public CatalogedResource(String title, ResourceDescription description) {
		this(new Title(Objects.requireNonNull(title)), description.getSubjects(), 
				description.getContributors().keySet().stream().collect(Collectors.toList()), description.getInfo());
	}
	
	
	
	
	
	
	public static class Builder {
		
		private Title title;
		private List<Subject> subjects;
		private List<ContributorId> contributors;
		private PublishingInformation publishingInfo;
		
		public Builder() {
			this.subjects = new ArrayList<Subject>();
			this.contributors = new ArrayList<ContributorId>();
		}
		
		
		
		public Builder withTitle(String title) {
			this.title = new Title(title);
			return this;
		}
		
		public Builder withPublishingInformation(PublishingInformation info) {
			this.publishingInfo = info;
			return this;
		}
		
		public Builder withSubject(Subject subject) {
			this.subjects.add(subject);
			return this;
		}
		
		public Builder withSubjects(Subject...subjects) {
			this.subjects.addAll(Arrays.asList(subjects));
			return this;
		}
		
		public Builder withSubjects(List<Subject> subjects) {
			this.subjects.addAll(subjects);
			return this;
		}
		
		public Builder withContributor(Contributor contributor) {
			this.contributors.add(contributor.getId());
			return this;
		}
		
		public Builder withContributors(Contributor...contributors) {
			this.contributors.addAll(Arrays.asList(contributors).stream()
					.map(Contributor::getId).collect(Collectors.toList()));
			return this;
		}
		
		public Builder withContributors(List<Contributor> contributors) {
			this.contributors.addAll(contributors.stream()
					.map(Contributor::getId).collect(Collectors.toList()));
			return this;
		}
		
		public CatalogedResource build() {
			return new CatalogedResource(title, subjects, contributors, publishingInfo);
		}
	}
}
