package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import org.hibernate.annotations.GenericGenerator;

@Entity(name = "bt_member_credit")
@Inheritance(strategy = InheritanceType.JOINED)
// @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MemberCredit {
	
	@Id
	@Column(name = "credit_id", length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	private String credit_id;
	
	@Column(name = "member_id", length = 32)
	private String member_id;
	
	@Column(name = "detail", length = 32)
	private String detail;
	
	@Column(name = "change_credit", length = 32)
	private String change_credit;
	
	@Column(name = "current_credit", length = 32)
	private String current_credit;
	
	@Column(name = "update_user", length = 32)
	private String update_user;
	
	@Column(name = "update_date", length = 20)
	private String update_date;

	public String getCredit_id() {
		return credit_id;
	}

	public void setCredit_id(String credit_id) {
		this.credit_id = credit_id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getChange_credit() {
		return change_credit;
	}

	public void setChange_credit(String change_credit) {
		this.change_credit = change_credit;
	}

	public String getCurrent_credit() {
		return current_credit;
	}

	public void setCurrent_credit(String current_credit) {
		this.current_credit = current_credit;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public String getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}

}