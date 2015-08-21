package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: CouponDayStatistics.java 
 * @Package com.ivhhs.demo.hb 
 * @Description: TODO
 * @author 王立立   
 * @date 2015年8月20日 
 * @version V1.0   
 */
@Entity
@Table(name="bt_coupon_day")
public class CMDayStatistics {

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
	
	@Column(name = "statistics_time", length = 20)
	private String statisticsTime;
	
	@Column(name = "receive_count", length = 64)
	private String receiveCount;
	
	@Column(name = "receive_person_count", length = 64)
	private String receivePersonCount;
	
	@Column(name = "use_count", length = 64)
	private String useCount;
	
	@Column(name = "use_person_count", length = 64)
	private String usePersonCount;

	public String getStatisticsTime() {
		return statisticsTime;
	}

	public void setStatisticsTime(String statisticsTime) {
		this.statisticsTime = statisticsTime;
	}

	public String getReceiveCount() {
		return receiveCount;
	}

	public void setReceiveCount(String receiveCount) {
		this.receiveCount = receiveCount;
	}

	public String getReceivePersonCount() {
		return receivePersonCount;
	}

	public void setReceivePersonCount(String receivePersonCount) {
		this.receivePersonCount = receivePersonCount;
	}

	public String getUseCount() {
		return useCount;
	}

	public void setUseCount(String useCount) {
		this.useCount = useCount;
	}

	public String getUsePersonCount() {
		return usePersonCount;
	}

	public void setUsePersonCount(String usePersonCount) {
		this.usePersonCount = usePersonCount;
	}
	
	

}

