package com.company.searchBusiness.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the POSTER database table.
 * 
 */
@Entity
@NamedQuery(name="Poster.findAll", query="SELECT p FROM Poster p")
public class Poster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="POSTER_ID")
	private int posterId;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_ON")
	private Date createdOn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DISPLAY_END_DATE")
	private Date displayEndDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DISPLAY_START_DATE")
	private Date displayStartDate;

	private String location;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_ON")
	private Date modifiedOn;

	//bi-directional many-to-one association to Business
	@ManyToOne
	@JoinColumn(name="BUSINESS_POSTER_ID")
	private Business business;

	public Poster() {
	}

	public int getPosterId() {
		return this.posterId;
	}

	public void setPosterId(int posterId) {
		this.posterId = posterId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getDisplayEndDate() {
		return this.displayEndDate;
	}

	public void setDisplayEndDate(Date displayEndDate) {
		this.displayEndDate = displayEndDate;
	}

	public Date getDisplayStartDate() {
		return this.displayStartDate;
	}

	public void setDisplayStartDate(Date displayStartDate) {
		this.displayStartDate = displayStartDate;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedOn() {
		return this.modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Business getBusiness() {
		return this.business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

}