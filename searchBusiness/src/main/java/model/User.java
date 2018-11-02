package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the USERS database table.
 * 
 */
@Entity
@Table(name="USERS")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	private int userId;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	private String password;

	@Column(name="user_login_id")
	private String userLoginId;

	private String usertype;

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="user1")
	private List<Address> addresses1;

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="user2")
	private List<Address> addresses2;

	//bi-directional many-to-one association to Business
	@OneToMany(mappedBy="user1")
	private List<Business> businesses1;

	//bi-directional many-to-one association to Business
	@OneToMany(mappedBy="user2")
	private List<Business> businesses2;

	//bi-directional many-to-one association to BusinessAddress
	@OneToMany(mappedBy="user1")
	private List<BusinessAddress> businessAddresses1;

	//bi-directional many-to-one association to BusinessAddress
	@OneToMany(mappedBy="user2")
	private List<BusinessAddress> businessAddresses2;

	//bi-directional many-to-one association to BusinessCategory
	@OneToMany(mappedBy="user1")
	private List<BusinessCategory> businessCategories1;

	//bi-directional many-to-one association to BusinessCategory
	@OneToMany(mappedBy="user2")
	private List<BusinessCategory> businessCategories2;

	//bi-directional many-to-one association to LinkedBusiness
	@OneToMany(mappedBy="user1")
	private List<LinkedBusiness> linkedBusinesses1;

	//bi-directional many-to-one association to LinkedBusiness
	@OneToMany(mappedBy="user2")
	private List<LinkedBusiness> linkedBusinesses2;

	//bi-directional many-to-one association to Photo
	@OneToMany(mappedBy="user1")
	private List<Photo> photos1;

	//bi-directional many-to-one association to Photo
	@OneToMany(mappedBy="user2")
	private List<Photo> photos2;

	//bi-directional many-to-one association to Preference
	@OneToMany(mappedBy="user1")
	private List<Preference> preferences1;

	//bi-directional many-to-one association to Preference
	@OneToMany(mappedBy="user2")
	private List<Preference> preferences2;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserLoginId() {
		return this.userLoginId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public List<Address> getAddresses1() {
		return this.addresses1;
	}

	public void setAddresses1(List<Address> addresses1) {
		this.addresses1 = addresses1;
	}

	public Address addAddresses1(Address addresses1) {
		getAddresses1().add(addresses1);
		addresses1.setUser1(this);

		return addresses1;
	}

	public Address removeAddresses1(Address addresses1) {
		getAddresses1().remove(addresses1);
		addresses1.setUser1(null);

		return addresses1;
	}

	public List<Address> getAddresses2() {
		return this.addresses2;
	}

	public void setAddresses2(List<Address> addresses2) {
		this.addresses2 = addresses2;
	}

	public Address addAddresses2(Address addresses2) {
		getAddresses2().add(addresses2);
		addresses2.setUser2(this);

		return addresses2;
	}

	public Address removeAddresses2(Address addresses2) {
		getAddresses2().remove(addresses2);
		addresses2.setUser2(null);

		return addresses2;
	}

	public List<Business> getBusinesses1() {
		return this.businesses1;
	}

	public void setBusinesses1(List<Business> businesses1) {
		this.businesses1 = businesses1;
	}

	public Business addBusinesses1(Business businesses1) {
		getBusinesses1().add(businesses1);
		businesses1.setUser1(this);

		return businesses1;
	}

	public Business removeBusinesses1(Business businesses1) {
		getBusinesses1().remove(businesses1);
		businesses1.setUser1(null);

		return businesses1;
	}

	public List<Business> getBusinesses2() {
		return this.businesses2;
	}

	public void setBusinesses2(List<Business> businesses2) {
		this.businesses2 = businesses2;
	}

	public Business addBusinesses2(Business businesses2) {
		getBusinesses2().add(businesses2);
		businesses2.setUser2(this);

		return businesses2;
	}

	public Business removeBusinesses2(Business businesses2) {
		getBusinesses2().remove(businesses2);
		businesses2.setUser2(null);

		return businesses2;
	}

	public List<BusinessAddress> getBusinessAddresses1() {
		return this.businessAddresses1;
	}

	public void setBusinessAddresses1(List<BusinessAddress> businessAddresses1) {
		this.businessAddresses1 = businessAddresses1;
	}

	public BusinessAddress addBusinessAddresses1(BusinessAddress businessAddresses1) {
		getBusinessAddresses1().add(businessAddresses1);
		businessAddresses1.setUser1(this);

		return businessAddresses1;
	}

	public BusinessAddress removeBusinessAddresses1(BusinessAddress businessAddresses1) {
		getBusinessAddresses1().remove(businessAddresses1);
		businessAddresses1.setUser1(null);

		return businessAddresses1;
	}

	public List<BusinessAddress> getBusinessAddresses2() {
		return this.businessAddresses2;
	}

	public void setBusinessAddresses2(List<BusinessAddress> businessAddresses2) {
		this.businessAddresses2 = businessAddresses2;
	}

	public BusinessAddress addBusinessAddresses2(BusinessAddress businessAddresses2) {
		getBusinessAddresses2().add(businessAddresses2);
		businessAddresses2.setUser2(this);

		return businessAddresses2;
	}

	public BusinessAddress removeBusinessAddresses2(BusinessAddress businessAddresses2) {
		getBusinessAddresses2().remove(businessAddresses2);
		businessAddresses2.setUser2(null);

		return businessAddresses2;
	}

	public List<BusinessCategory> getBusinessCategories1() {
		return this.businessCategories1;
	}

	public void setBusinessCategories1(List<BusinessCategory> businessCategories1) {
		this.businessCategories1 = businessCategories1;
	}

	public BusinessCategory addBusinessCategories1(BusinessCategory businessCategories1) {
		getBusinessCategories1().add(businessCategories1);
		businessCategories1.setUser1(this);

		return businessCategories1;
	}

	public BusinessCategory removeBusinessCategories1(BusinessCategory businessCategories1) {
		getBusinessCategories1().remove(businessCategories1);
		businessCategories1.setUser1(null);

		return businessCategories1;
	}

	public List<BusinessCategory> getBusinessCategories2() {
		return this.businessCategories2;
	}

	public void setBusinessCategories2(List<BusinessCategory> businessCategories2) {
		this.businessCategories2 = businessCategories2;
	}

	public BusinessCategory addBusinessCategories2(BusinessCategory businessCategories2) {
		getBusinessCategories2().add(businessCategories2);
		businessCategories2.setUser2(this);

		return businessCategories2;
	}

	public BusinessCategory removeBusinessCategories2(BusinessCategory businessCategories2) {
		getBusinessCategories2().remove(businessCategories2);
		businessCategories2.setUser2(null);

		return businessCategories2;
	}

	public List<LinkedBusiness> getLinkedBusinesses1() {
		return this.linkedBusinesses1;
	}

	public void setLinkedBusinesses1(List<LinkedBusiness> linkedBusinesses1) {
		this.linkedBusinesses1 = linkedBusinesses1;
	}

	public LinkedBusiness addLinkedBusinesses1(LinkedBusiness linkedBusinesses1) {
		getLinkedBusinesses1().add(linkedBusinesses1);
		linkedBusinesses1.setUser1(this);

		return linkedBusinesses1;
	}

	public LinkedBusiness removeLinkedBusinesses1(LinkedBusiness linkedBusinesses1) {
		getLinkedBusinesses1().remove(linkedBusinesses1);
		linkedBusinesses1.setUser1(null);

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
		linkedBusinesses2.setUser2(this);

		return linkedBusinesses2;
	}

	public LinkedBusiness removeLinkedBusinesses2(LinkedBusiness linkedBusinesses2) {
		getLinkedBusinesses2().remove(linkedBusinesses2);
		linkedBusinesses2.setUser2(null);

		return linkedBusinesses2;
	}

	public List<Photo> getPhotos1() {
		return this.photos1;
	}

	public void setPhotos1(List<Photo> photos1) {
		this.photos1 = photos1;
	}

	public Photo addPhotos1(Photo photos1) {
		getPhotos1().add(photos1);
		photos1.setUser1(this);

		return photos1;
	}

	public Photo removePhotos1(Photo photos1) {
		getPhotos1().remove(photos1);
		photos1.setUser1(null);

		return photos1;
	}

	public List<Photo> getPhotos2() {
		return this.photos2;
	}

	public void setPhotos2(List<Photo> photos2) {
		this.photos2 = photos2;
	}

	public Photo addPhotos2(Photo photos2) {
		getPhotos2().add(photos2);
		photos2.setUser2(this);

		return photos2;
	}

	public Photo removePhotos2(Photo photos2) {
		getPhotos2().remove(photos2);
		photos2.setUser2(null);

		return photos2;
	}

	public List<Preference> getPreferences1() {
		return this.preferences1;
	}

	public void setPreferences1(List<Preference> preferences1) {
		this.preferences1 = preferences1;
	}

	public Preference addPreferences1(Preference preferences1) {
		getPreferences1().add(preferences1);
		preferences1.setUser1(this);

		return preferences1;
	}

	public Preference removePreferences1(Preference preferences1) {
		getPreferences1().remove(preferences1);
		preferences1.setUser1(null);

		return preferences1;
	}

	public List<Preference> getPreferences2() {
		return this.preferences2;
	}

	public void setPreferences2(List<Preference> preferences2) {
		this.preferences2 = preferences2;
	}

	public Preference addPreferences2(Preference preferences2) {
		getPreferences2().add(preferences2);
		preferences2.setUser2(this);

		return preferences2;
	}

	public Preference removePreferences2(Preference preferences2) {
		getPreferences2().remove(preferences2);
		preferences2.setUser2(null);

		return preferences2;
	}

}