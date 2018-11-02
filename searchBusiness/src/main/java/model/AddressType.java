package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the ADDRESS_TYPE database table.
 * 
 */
@Entity
@Table(name="ADDRESS_TYPE")
@NamedQuery(name="AddressType.findAll", query="SELECT a FROM AddressType a")
public class AddressType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="address_type_id")
	private int addressTypeId;

	@Column(name="address_type")
	private String addressType;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	//bi-directional many-to-one association to BusinessAddress
	@OneToMany(mappedBy="addressType")
	private List<BusinessAddress> businessAddresses;

	public AddressType() {
	}

	public int getAddressTypeId() {
		return this.addressTypeId;
	}

	public void setAddressTypeId(int addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
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

	public List<BusinessAddress> getBusinessAddresses() {
		return this.businessAddresses;
	}

	public void setBusinessAddresses(List<BusinessAddress> businessAddresses) {
		this.businessAddresses = businessAddresses;
	}

	public BusinessAddress addBusinessAddress(BusinessAddress businessAddress) {
		getBusinessAddresses().add(businessAddress);
		businessAddress.setAddressType(this);

		return businessAddress;
	}

	public BusinessAddress removeBusinessAddress(BusinessAddress businessAddress) {
		getBusinessAddresses().remove(businessAddress);
		businessAddress.setAddressType(null);

		return businessAddress;
	}

}