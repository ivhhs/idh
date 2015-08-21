package com.ivhhs.demo.hb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**   
 * @Title: MarketingBasicInfo.java 
 * @Package com.ivhhs.demo.hb 
 * @Description: TODO
 * @author 王立立   
 * @date 2015年8月20日 
 * @version V1.0   
 */
@Entity
@Table(name="bt_static_info ")
public class MarketingBasicInfo {
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
	@Column(name = "shop_name", length = 64)
	private String shopName;
	
	@Column(name = "shop_logo", length = 128)
	private String shopLogo;
	
	@Column(name = "discountcodeOrNot", length = 1)
	private String discountcode_or_not;
	
	@Column(name = "create_time", length = 20)
	private String createTime;
	
	@Column(name = "integral_deduction", length = 20)
	private String integralDeduction;
	
	@Column(name = "deduction_cash", length =20)
	private String deductionCash;
	
	@Column(name = "improve_info", length = 100)
	private String improveInfo;
	
	@Column(name = "improve_reward", length = 10)
	private String improveReward;
	
	@Column(name = "consumption_amount ", length =100)
	private String consumptionAmount;
	
	@Column(name = "exchange_integral", length = 100)
	private String exchangeIntegral;

}

