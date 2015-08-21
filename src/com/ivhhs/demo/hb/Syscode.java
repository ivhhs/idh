package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_syscode")
@Inheritance(strategy = InheritanceType.JOINED)
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Syscode {
	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@Column(name = "seq", length = 32)
	private String seq;
	@Column(name = "sysCode", length = 10)
	private String sysCode;
	@Column(name = "sysName", length = 30)
	private String sysName;
	@Column(name = "sysType", length = 10)
	private String sysType;

	public String getSeq() {
		return seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getSysCode() {
		return sysCode;
	}

	public void setSysCode(String sysCode) {
		this.sysCode = sysCode;
	}

	public String getSysName() {
		return sysName;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName;
	}

	public String getSysType() {
		return sysType;
	}

	public void setSysType(String sysType) {
		this.sysType = sysType;
	}

}