package com.company.searchBusiness.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the business database table.
 * 
 */
@Entity
@NamedQuery(name="Business.findAll", query="SELECT b FROM Business b")
public class Business implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="BUSINESS_ID")
	private int businessId;

	@Column(name="BUSINESS_NAME")
	private String businessName;

	private int capacity;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATED_ON")
	private Date createdOn;

	private String description;

	@Column(name="EMAIL_ID")
	private String emailId;

	private String hours;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="MODIFIED_ON")
	private Date modifiedOn;

	@Column(name="PREFERRED_CONTACT_TYPE")
	private String preferredContactType;

	@Column(name="SCHEDULER_ACTIVE")
	private String schedulerActive;

	@Column(name="SERVICES_OFFERED")
	private String servicesOffered;

	private String website;

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="business")
	private List<Address> addresses;

	//bi-directional many-to-one association to BusinessSchedular
	@OneToMany(mappedBy="business")
	private List<BusinessSchedular> businessSchedulars;

	//bi-directional many-to-one association to Photo
	@OneToMany(mappedBy="business")
	private List<Photo> photos;

	//bi-directional many-to-one association to Poster
	@OneToMany(mappedBy="business")
	private List<Poster> posters;

	//bi-directional many-to-one association to Preference
	@OneToMany(mappedBy="business")
	private List<Preference> preferences;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID")
	private Category category;

	public Business() {
	}

	public int getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getHours() {
		return this.hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
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

	public String getPreferredContactType() {
		return this.preferredContactType;
	}

	public void setPreferredContactType(String preferredContactType) {
		this.preferredContactType = preferredContactType;
	}

	public String getSchedulerActive() {
		return this.schedulerActive;
	}

	public void setSchedulerActive(String schedulerActive) {
		this.schedulerActive = schedulerActive;
	}

	public String getServicesOffered() {
		return this.servicesOffered;
	}

	public void setServicesOffered(String servicesOffered) {
		this.servicesOffered = servicesOffered;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Address addAddress(Address address) {
		getAddresses().add(address);
		address.setBusiness(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddresses().remove(address);
		address.setBusiness(null);

		return address;
	}

	public List<BusinessSchedular> getBusinessSchedulars() {
		return this.businessSchedulars;
	}

	public void setBusinessSchedulars(List<BusinessSchedular> businessSchedulars) {
		this.businessSchedulars = businessSchedulars;
	}

	public BusinessSchedular addBusinessSchedular(BusinessSchedular businessSchedular) {
		getBusinessSchedulars().add(businessSchedular);
		businessSchedular.setBusiness(this);

		return businessSchedular;
	}

	public BusinessSchedular removeBusinessSchedular(BusinessSchedular businessSchedular) {
		getBusinessSchedulars().remove(businessSchedular);
		businessSchedular.setBusiness(null);

		return businessSchedular;
	}

	public List<Photo> getPhotos() {
		return this.photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public Photo addPhoto(Photo photo) {
		getPhotos().add(photo);
		photo.setBusiness(this);

		return photo;
	}

	public Photo removePhoto(Photo photo) {
		getPhotos().remove(photo);
		photo.setBusiness(null);

		return photo;
	}

	public List<Poster> getPosters() {
		return this.posters;
	}

	public void setPosters(List<Poster> posters) {
		this.posters = posters;
	}

	public Poster addPoster(Poster poster) {
		getPosters().add(poster);
		poster.setBusiness(this);

		return poster;
	}

	public Poster removePoster(Poster poster) {
		getPosters().remove(poster);
		poster.setBusiness(null);

		return poster;
	}

	public List<Preference> getPreferences() {
		return this.preferences;
	}

	public void setPreferences(List<Preference> preferences) {
		this.preferences = preferences;
	}

	public Preference addPreference(Preference preference) {
		getPreferences().add(preference);
		preference.setBusiness(this);

		return preference;
	}

	public Preference removePreference(Preference preference) {
		getPreferences().remove(preference);
		preference.setBusiness(null);

		return preference;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}