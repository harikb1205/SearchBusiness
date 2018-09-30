package com.company.searchBusiness.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the BUSINESS_SCHEDULAR database table.
 * 
 */
@Entity
@Table(name="BUSINESS_SCHEDULAR")
@NamedQuery(name="BusinessSchedular.findAll", query="SELECT b FROM BusinessSchedular b")
public class BusinessSchedular implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SCHEDULAR_ID")
	private int schedularId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ACTIVATION_DATE")
	private Date activationDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CANCELLATION_DATE")
	private Date cancellationDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="EXP_DATE")
	private Date expDate;

	//bi-directional many-to-one association to Business
	@ManyToOne
	@JoinColumn(name="BUSINESS_SCHED_ID")
	private Business business;

	public BusinessSchedular() {
	}

	public int getSchedularId() {
		return this.schedularId;
	}

	public void setSchedularId(int schedularId) {
		this.schedularId = schedularId;
	}

	public Date getActivationDate() {
		return this.activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	public Date getCancellationDate() {
		return this.cancellationDate;
	}

	public void setCancellationDate(Date cancellationDate) {
		this.cancellationDate = cancellationDate;
	}

	public Date getExpDate() {
		return this.expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Business getBusiness() {
		return this.business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

}