package com.yy.mapper;

import java.util.List;

import com.yy.model.Ginfo;

public interface GinfoMapper {
	void save(Ginfo ginfo);    
    boolean update(Ginfo ginfo); 
    boolean delete(int id);
    Ginfo findById(int id);    
    List<Ginfo> findAll();

}
