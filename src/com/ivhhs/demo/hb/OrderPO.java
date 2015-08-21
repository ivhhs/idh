package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.sun.istack.internal.NotNull;

@Entity
@Table(name = "ivhhs_demo_order")
public class OrderPO {

	@Id
	@Column(name = "order_id", length = 32)
	@GenericGenerator(name = "uuidGtr", strategy = "com.ivhhs.demo.hb.id.UUIDGenerator")
	@GeneratedValue(generator = "uuidGtr")
	private String uuid;

	@ManyToOne
	@JoinColumn(name = "member_id", referencedColumnName = "", foreignKey = @ForeignKey(name = "fk_member_id"))
	private MemberPO member;

	@Column(name = "order_name", length = 128)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public MemberPO getMember() {
		return member;
	}

	public void setMember(MemberPO member) {
		this.member = member;
	}

}
