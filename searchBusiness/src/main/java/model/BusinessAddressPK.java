package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the BUSINESS_ADDRESS database table.
 * 
 */
@Embeddable
public class BusinessAddressPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="business_id", insertable=false, updatable=false)
	private int businessId;

	@Column(name="address_id", insertable=false, updatable=false)
	private int addressId;

	@Column(name="address_type_id", insertable=false, updatable=false)
	private int addressTypeId;

	public BusinessAddressPK() {
	}
	public int getBusinessId() {
		return this.businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public int getAddressId() {
		return this.addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public int getAddressTypeId() {
		return this.addressTypeId;
	}
	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BusinessAddressPK)) {
			return false;
		}
		BusinessAddressPK castOther = (BusinessAddressPK)other;
		return 
			(this.businessId == castOther.businessId)
			&& (this.addressId == castOther.addressId)
			&& (this.addressTypeId == castOther.addressTypeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.businessId;
		hash = hash * prime + this.addressId;
		hash = hash * prime + this.addressTypeId;
		
		return hash;
	}
}