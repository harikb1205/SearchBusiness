package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the BUSINESS database table.
 * 
 */
@Entity
@NamedQuery(name="Business.findAll", query="SELECT b FROM Business b")
public class Business implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="business_id")
	private int businessId;

	@Column(name="bunsiness_name")
	private String bunsinessName;

	@Column(name="created_date")
	private Timestamp createdDate;

	private String description;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	@Column(name="schedular_active")
	private byte schedularActive;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="created_by")
	private User user1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="modified_by")
	private User user2;

	//bi-directional many-to-one association to BusinessAddress
	@OneToMany(mappedBy="business")
	private List<BusinessAddress> businessAddresses;

	//bi-directional many-to-one association to BusinessCategory
	@OneToMany(mappedBy="business")
	private List<BusinessCategory> businessCategories;

	//bi-directional many-to-one association to LinkedBusiness
	@OneToMany(mappedBy="business1")
	private List<LinkedBusiness> linkedBusinesses1;

	//bi-directional many-to-one association to LinkedBusiness
	@OneToMany(mappedBy="business2")
	private List<LinkedBusiness> linkedBusinesses2;

	//bi-directional many-to-one association to Photo
	@OneToMany(mappedBy="business")
	private List<Photo> photos;

	//bi-directional many-to-one association to Preference
	@OneToMany(mappedBy="business")
	private List<Preference> preferences;

	public Business() {
	}

	public int getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}

	public String getBunsinessName() {
		return this.bunsinessName;
	}

	public void setBunsinessName(String bunsinessName) {
		this.bunsinessName = bunsinessName;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public byte getSchedularActive() {
		return this.schedularActive;
	}

	public void setSchedularActive(byte schedularActive) {
		this.schedularActive = schedularActive;
	}

	public User getUser1() {
		return this.user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public User getUser2() {
		return this.user2;
	}

	public void setUser2(User user2) {
		this.user2 = user2;
	}

	public List<BusinessAddress> getBusinessAddresses() {
		return this.businessAddresses;
	}

	public void setBusinessAddresses(List<BusinessAddress> businessAddresses) {
		this.businessAddresses = businessAddresses;
	}

	public BusinessAddress addBusinessAddress(BusinessAddress businessAddress) {
		getBusinessAddresses().add(businessAddress);
		businessAddress.setBusiness(this);

		return businessAddress;
	}

	public BusinessAddress removeBusinessAddress(BusinessAddress businessAddress) {
		getBusinessAddresses().remove(businessAddress);
		businessAddress.setBusiness(null);

		return businessAddress;
	}

	public List<BusinessCategory> getBusinessCategories() {
		return this.businessCategories;
	}

	public void setBusinessCategories(List<BusinessCategory> businessCategories) {
		this.businessCategories = businessCategories;
	}

	public BusinessCategory addBusinessCategory(BusinessCategory businessCategory) {
		getBusinessCategories().add(businessCategory);
		businessCategory.setBusiness(this);

		return businessCategory;
	}

	public BusinessCategory removeBusinessCategory(BusinessCategory businessCategory) {
		getBusinessCategories().remove(businessCategory);
		businessCategory.setBusiness(null);

		return businessCategory;
	}

	public List<LinkedBusiness> getLinkedBusinesses1() {
		return this.linkedBusinesses1;
	}

	public void setLinkedBusinesses1(List<LinkedBusiness> linkedBusinesses1) {
		this.linkedBusinesses1 = linkedBusinesses1;
	}

	public LinkedBusiness addLinkedBusinesses1(LinkedBusiness linkedBusinesses1) {
		getLinkedBusinesses1().add(linkedBusinesses1);
		linkedBusinesses1.setBusiness1(this);

		return linkedBusinesses1;
	}

	public LinkedBusiness removeLinkedBusinesses1(LinkedBusiness linkedBusinesses1) {
		getLinkedBusinesses1().remove(linkedBusinesses1);
		linkedBusinesses1.setBusiness1(null);

		return linkedBusinesses1;
	}

	public List<LinkedBusiness> getLinkedBusinesses2() {
		return this.linkedBusinesses2;
	}

	public void setLinkedBusinesses2(List<LinkedBusiness> linkedBusinesses2) {
		this.linkedBusinesses2 = linkedBusinesses2;
	}

	public LinkedBusiness addLinkedBusinesses2(LinkedBusiness linkedBusinesses2) {
		getLinkedBusinesses2().add(linkedBusinesses2);
		linkedBusinesses2.setBusiness2(this);

		return linkedBusinesses2;
	}

	public LinkedBusiness removeLinkedBusinesses2(LinkedBusiness linkedBusinesses2) {
		getLinkedBusinesses2().remove(linkedBusinesses2);
		linkedBusinesses2.setBusiness2(null);

		return linkedBusinesses2;
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

}