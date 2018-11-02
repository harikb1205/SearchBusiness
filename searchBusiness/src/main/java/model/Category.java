package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the CATEGORY database table.
 * 
 */
@Entity
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="category_id")
	private int categoryId;

	@Column(name="category_code")
	private String categoryCode;

	@Column(name="category_name")
	private String categoryName;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	//bi-directional many-to-one association to BusinessCategory
	@OneToMany(mappedBy="category1")
	private List<BusinessCategory> businessCategories1;

	//bi-directional many-to-one association to BusinessCategory
	@OneToMany(mappedBy="category2")
	private List<BusinessCategory> businessCategories2;

	//bi-directional many-to-one association to SubCategory
	@OneToMany(mappedBy="category")
	private List<SubCategory> subCategories;

	public Category() {
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public List<BusinessCategory> getBusinessCategories1() {
		return this.businessCategories1;
	}

	public void setBusinessCategories1(List<BusinessCategory> businessCategories1) {
		this.businessCategories1 = businessCategories1;
	}

	public BusinessCategory addBusinessCategories1(BusinessCategory businessCategories1) {
		getBusinessCategories1().add(businessCategories1);
		businessCategories1.setCategory1(this);

		return businessCategories1;
	}

	public BusinessCategory removeBusinessCategories1(BusinessCategory businessCategories1) {
		getBusinessCategories1().remove(businessCategories1);
		businessCategories1.setCategory1(null);

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
		businessCategories2.setCategory2(this);

		return businessCategories2;
	}

	public BusinessCategory removeBusinessCategories2(BusinessCategory businessCategories2) {
		getBusinessCategories2().remove(businessCategories2);
		businessCategories2.setCategory2(null);

		return businessCategories2;
	}

	public List<SubCategory> getSubCategories() {
		return this.subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}

	public SubCategory addSubCategory(SubCategory subCategory) {
		getSubCategories().add(subCategory);
		subCategory.setCategory(this);

		return subCategory;
	}

	public SubCategory removeSubCategory(SubCategory subCategory) {
		getSubCategories().remove(subCategory);
		subCategory.setCategory(null);

		return subCategory;
	}

}