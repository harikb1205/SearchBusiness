package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the BUSINESS_CATEGORY database table.
 * 
 */
@Embeddable
public class BusinessCategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="business_id", insertable=false, updatable=false)
	private int businessId;

	@Column(name="category_id", insertable=false, updatable=false)
	private int categoryId;

	public BusinessCategoryPK() {
	}
	public int getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public int getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BusinessCategoryPK)) {
			return false;
		}
		BusinessCategoryPK castOther = (BusinessCategoryPK)other;
		return 
			(this.businessId == castOther.businessId)
			&& (this.categoryId == castOther.categoryId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.businessId;
		hash = hash * prime + this.categoryId;
		
		return hash;
	}
}