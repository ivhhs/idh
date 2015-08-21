package com.ivhhs.demo.hb;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 查询数据
 * 
 * @author ivhhs
 *
 */
public class HBGetTest {
	public static void main(String args[]) {

		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		List<MemberPO> members = session.createCriteria(MemberPO.class).list();
		List<OrderPO> orders = session.createCriteria(OrderPO.class).list();

	}
}
