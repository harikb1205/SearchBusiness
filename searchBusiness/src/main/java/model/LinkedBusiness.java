package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the LINKED_BUSINESS database table.
 * 
 */
@Entity
@Table(name="LINKED_BUSINESS")
@NamedQuery(name="LinkedBusiness.findAll", query="SELECT l FROM LinkedBusiness l")
public class LinkedBusiness implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="linked_id")
	private int linkedId;

	@Column(name="created_date")
	private Timestamp createdDate;

	@Column(name="modified_date")
	private Timestamp modifiedDate;

	//bi-directional many-to-one association to Business
	@ManyToOne
	@JoinColumn(name="linked_business_id")
	private Business business1;

	//bi-directional many-to-one association to Business
	@ManyToOne
	@JoinColumn(name="primary_business_id")
	private Business business2;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="created_by")
	private User user1;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="modified_by")
	private User user2;

	public LinkedBusiness() {
	}

	public int getLinkedId() {
		return this.linkedId;
	}

	public void setLinkedId(int linkedId) {
		this.linkedId = linkedId;
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

	public Business getBusiness1() {
		return this.business1;
	}

	public void setBusiness1(Business business1) {
		this.business1 = business1;
	}

	public Business getBusiness2() {
		return this.business2;
	}

	public void setBusiness2(Business business2) {
		this.business2 = business2;
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