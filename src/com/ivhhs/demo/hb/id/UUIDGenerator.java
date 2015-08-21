package com.ivhhs.demo.hb.id;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.UUIDHexGenerator;

public class UUIDGenerator implements IdentifierGenerator {

	@Override
	public Serializable generate(SessionImplementor session, Object obj) throws HibernateException {
		UUIDHexGenerator generator = new UUIDHexGenerator();
		return generator.generate(session, obj);
	}

}
