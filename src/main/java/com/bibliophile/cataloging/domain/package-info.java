/**
 * The cataloging domain.
 * <ol>
 * <li>A new item is acquired from the acquisition department</li>
 * <li>That item is added into holdings with its availability set to unavailable</li>
 * <li>That item is descriptively cataloged and given a Title, Format, any Identifiers.</li>
 * <li>Item is linked to an existing resource if its title and identifers match (as a CatalogedInstance and/or 
 * CatalogedResource).</li>
 * </ol>
 */
package com.bibliophile.cataloging.domain;