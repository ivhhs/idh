package com.ivhhs.demo.hb;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * 会员
 * 
 * @author ivhhs
 * 
 */
//
// @Id 标识是实体类的唯一识别的值
// (1) name 可选,列名(默认值是属性名)
// (2) unique 可选,是否在该列上设置唯一约束(默认值false)
// (3) nullable 可选,是否设置该列的值可以为空(默认值false)
// (4) insertable 可选,该列是否作为生成的insert语句中的一个列(默认值true)
// (5) updatable 可选,该列是否作为生成的update语句中的一个列(默认值true)
// (6) columnDefinition 可选: 为这个特定列覆盖SQL DDL片段 (这可能导致无法在不同数据库间移植)
// (7) table 可选,定义对应的表(默认为主表)
// (8) length 可选,列长度(默认值255)
// (9) precision 可选,列十进制精度(decimal precision)(默认值0)
// (10) scale 可选,如果列十进制数值范围(decimal scale)可用,在此设置(默认值0)

@Entity
@Table(name = "ivhhs_demo_member")
public class MemberPO {

	@Id
	@Column(name = "member_id", length = 32)
	@GenericGenerator(name = "uuidGtr", strategy = "com.ivhhs.demo.hb.id.UUIDGenerator")
	@GeneratedValue(generator = "uuidGtr")
	private String uuid;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@Column(name = "member_name", length = 128)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(mappedBy = "member")
	@OrderBy(value = "name desc")
	private List<OrderPO> orders;

	public List<OrderPO> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderPO> orders) {
		this.orders = orders;
	}
}
