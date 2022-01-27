package com.sk.service;

import java.util.List;

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


	public List<String> getNames() {
		
		return null;
	}

}
