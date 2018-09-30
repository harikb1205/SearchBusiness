package com.company.searchBusiness.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the PREFERENCES database table.
 * 
 */
@Entity
@Table(name="PREFERENCES")
@NamedQuery(name="Preference.findAll", query="SELECT p FROM Preference p")
public class Preference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="preference_id")
	private int preferenceId;

	@Column(name="created_by")
	private String createdBy;

	@Temporal(TemporalType.DATE)
	@Column(name="created_on")
	private Date createdOn;

	@Column(name="modified_by")
	private String modifiedBy;

	@Temporal(TemporalType.DATE)
	@Column(name="modified_on")
	private Date modifiedOn;

	@Column(name="prefered_vendor1")
	private String preferedVendor1;

	@Column(name="prefered_vendor2")
	private String preferedVendor2;

	@Column(name="prefered_vendor3")
	private String preferedVendor3;

	@Column(name="prefered_vendor4")
	private String preferedVendor4;

	@Column(name="prefered_vendor5")
	private String preferedVendor5;

	@Column(name="prefered_vendor6")
	private String preferedVendor6;

	@Column(name="prefered_vendor7")
	private String preferedVendor7;

	@Column(name="prefered_vendor8")
	private String preferedVendor8;

	private String preferences;

	//bi-directional many-to-one association to Business
	@ManyToOne
	@JoinColumn(name="business_id")
	private Business business;

	public Preference() {
	}

	public int getPreferenceId() {
		return this.preferenceId;
	}

	public void setPreferenceId(int preferenceId) {
		this.preferenceId = preferenceId;
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

	public String getPreferedVendor1() {
		return this.preferedVendor1;
	}

	public void setPreferedVendor1(String preferedVendor1) {
		this.preferedVendor1 = preferedVendor1;
	}

	public String getPreferedVendor2() {
		return this.preferedVendor2;
	}

	public void setPreferedVendor2(String preferedVendor2) {
		this.preferedVendor2 = preferedVendor2;
	}

	public String getPreferedVendor3() {
		return this.preferedVendor3;
	}

	public void setPreferedVendor3(String preferedVendor3) {
		this.preferedVendor3 = preferedVendor3;
	}

	public String getPreferedVendor4() {
		return this.preferedVendor4;
	}

	public void setPreferedVendor4(String preferedVendor4) {
		this.preferedVendor4 = preferedVendor4;
	}

	public String getPreferedVendor5() {
		return this.preferedVendor5;
	}

	public void setPreferedVendor5(String preferedVendor5) {
		this.preferedVendor5 = preferedVendor5;
	}

	public String getPreferedVendor6() {
		return this.preferedVendor6;
	}

	public void setPreferedVendor6(String preferedVendor6) {
		this.preferedVendor6 = preferedVendor6;
	}

	public String getPreferedVendor7() {
		return this.preferedVendor7;
	}

	public void setPreferedVendor7(String preferedVendor7) {
		this.preferedVendor7 = preferedVendor7;
	}

	public String getPreferedVendor8() {
		return this.preferedVendor8;
	}

	public void setPreferedVendor8(String preferedVendor8) {
		this.preferedVendor8 = preferedVendor8;
	}

	public String getPreferences() {
		return this.preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public Business getBusiness() {
		return this.business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

}