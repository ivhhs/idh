package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: SMActivitiesRecord.java 
 * @Package com.ivhhs.demo.hb 
 * @Description: TODO
 * @author 王立立   
 * @date 2015年8月20日 
 * @version V1.0   
 */
@Entity
@Table(name="bt_activities_records")
public class SMActivitiesRecord {
	private String uuid;
	@Id
	@Column(name = "uuid", unique = true, nullable = false, length = 32)
	@GenericGenerator(name = "uuidGenerator", strategy = "uuid")
	@GeneratedValue(generator = "uuidGenerator")
	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	private SendactivitiesManager activitiesId;
	
	
	private MemberMaster deliveryManid;
	
	@OneToOne
	@JoinColumn(name = "order_id", referencedColumnName = "", foreignKey = @ForeignKey(name = "fk_activities_id"))
	private TradeOrder orderId;

	@OneToOne
	@JoinColumn(name = "activities_id", referencedColumnName = "", foreignKey = @ForeignKey(name = "fk_activities_id"))
	public SendactivitiesManager getActivitiesId() {
		return activitiesId;
	}

	public void setActivitiesId(SendactivitiesManager activitiesId) {
		this.activitiesId = activitiesId;
	}

	@OneToOne
	@JoinColumn(name = "delivery_manid", referencedColumnName = "", foreignKey = @ForeignKey(name = "fk_activities_id"))
	public MemberMaster getDeliveryManid() {
		return deliveryManid;
	}

	public void setDeliveryManid(MemberMaster deliveryManid) {
		this.deliveryManid = deliveryManid;
	}

	public TradeOrder getOrderId() {
		return orderId;
	}

	public void setOrderId(TradeOrder orderId) {
		this.orderId = orderId;
	}

	

}

