package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the BUSINESS_CATEGORY database table.
 * 
 */
@Entity
@Table(name="BUSINESS_CATEGORY")
@NamedQuery(name="BusinessCategory.findAll", query="SELECT b FROM BusinessCategory b")
public class BusinessCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BusinessCategoryPK id;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	//bi-directional many-to-one association to Business
	@ManyToOne
	@JoinColumn(name="business_id")
	private Business business;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category1;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category2;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="created_by")
	private User user1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="modified_by")
	private User user2;

	public BusinessCategory() {
	}

	public BusinessCategoryPK getId() {
		return this.id;
	}

	public void setId(BusinessCategoryPK id) {
		this.id = id;
	}

	public Timestamp getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Business getBusiness() {
		return this.business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	public Category getCategory1() {
		return this.category1;
	}

	public void setCategory1(Category category1) {
		this.category1 = category1;
	}

	public Category getCategory2() {
		return this.category2;
	}

	public void setCategory2(Category category2) {
		this.category2 = category2;
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

}