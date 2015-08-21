package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;



@Entity(name = "mt_distributor_leader")
@Inheritance(strategy = InheritanceType.JOINED)
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class DistributorLeader {
	
	//private Distributor distributor;
	
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "DistributorId", length = 32)
	private String distributorId;
	
	//@Id
	//@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "LeaderId", length = 32)
	//@ManyToOne
	@JoinColumn(name = "LeaderId")
	private String leaderId;

	public String getDistributorId() {
		return distributorId;
	}

	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
	}

	public String getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(String leaderId) {
		this.leaderId = leaderId;
	}
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "distributorId")
//	public Distributor getDistributor() {
//		return distributor;
//	}
//
//	public void setDistributor(Distributor distributor) {
//		this.distributor = distributor;
//	}
//	

}