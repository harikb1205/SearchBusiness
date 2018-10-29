package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the SUB_CATEGORIES database table.
 * 
 */
@Entity
@Table(name="SUB_CATEGORIES")
@NamedQuery(name="SubCategory.findAll", query="SELECT s FROM SubCategory s")
public class SubCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="sub_category_id")
	private int subCategoryId;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	@Column(name="sub_category_name")
	private String subCategoryName;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;

	public SubCategory() {
	}

	public int getSubCategoryId() {
		return this.subCategoryId;
	}

	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
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

	public String getSubCategoryName() {
		return this.subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}