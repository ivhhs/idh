package com.ivhhs.demo.hb;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 初始化数据
 * 
 * @author ivhhs
 *
 */
public class HBCreateTest {
	public static void main(String args[]) {

		MemberPO ivhhs = new MemberPO();
		ivhhs.setName("ivhhs");
		MemberPO kity = new MemberPO();
		kity.setName("kity");

		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(ivhhs);
		session.save(kity);

		List<MemberPO> members = session.createCriteria(MemberPO.class).list();
		for (MemberPO m : members) {
			for (int i = 6; i <= 8; i++) {
				OrderPO orderPO = new OrderPO();
				orderPO.setName(m.getName() + "-ihpone " + i);
				orderPO.setMember(m);

				session.save(orderPO);
			}
		}
		session.getTransaction().commit();
		session.close();
		sf.close();

	}
}
