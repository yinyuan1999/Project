package com.yy.service;

import java.util.List;

import com.yy.model.Ginfo;

public interface GinfoService {
	void save(Ginfo ginfo);  
    boolean update(Ginfo ginfo);  
    boolean delete(int id);  
    Ginfo findById(int id);  
    List<Ginfo> findAll();

}
