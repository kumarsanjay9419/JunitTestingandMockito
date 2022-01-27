package com.sk.service;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.sk.dao.ContactDao;

public class ContactTestService {
	//unit testing annotation
	@Test
	public void getTestNameById_01() {
		
		//creating Proxy
		ContactDao daoProxy	= EasyMock.createMock(ContactDao.class);
		
		//setting Proxy
		EasyMock.expect(daoProxy.findNameById(101))
		.andReturn("Sanjay");
		
		EasyMock.expect(daoProxy.findNameById(102))
		.andReturn("Kumar");
		
		EasyMock.replay(daoProxy);
		
		ContactServiceImpl service=new ContactServiceImpl();
		
		service.setContactDao(daoProxy);
		
		String name = service.getNameById(101);
		assertNotNull(name);
		
	}
}
