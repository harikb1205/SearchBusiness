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