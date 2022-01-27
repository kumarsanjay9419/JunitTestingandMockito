package com.sk.dao;

import java.util.List;

public interface ContactDao {

	public String findNameById(Integer id);
	
	List<String> findNames();
}
