package com.company.searchBusiness.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the USER_BUSINESS_ACCESS database table.
 * 
 */
@Entity
@Table(name="USER_BUSINESS_ACCESS")
@NamedQuery(name="UserBusinessAccess.findAll", query="SELECT u FROM UserBusinessAccess u")
public class UserBusinessAccess implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="access_id")
	private int accessId;

	@Column(name="access_level")
	private String accessLevel;

	@Column(name="business_id")
	private int businessId;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="created_date")
	private Date createdDate;

	@Column(name="modified_by")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="modified_date")
	private Date modifiedDate;

	@Column(name="user_id")
	private String userId;

	public UserBusinessAccess() {
	}

	public int getAccessId() {
		return this.accessId;
	}

	public void setAccessId(int accessId) {
		this.accessId = accessId;
	}

	public String getAccessLevel() {
		return this.accessLevel;
	}

	public void setAccessLevel(String accessLevel) {
		this.accessLevel = accessLevel;
	}

	public int getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}