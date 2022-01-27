package com.sk.service;

import com.sk.dao.ContactDao;

public class ContactServiceImpl implements IContactService {

	private ContactDao contactDao;
	
	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}


	public String getNameById(Integer id) {
		
		String name = contactDao.findNameById(id);
		
		//logic
		String formattedName = name.toUpperCase();
		return formattedName;
	}

}
