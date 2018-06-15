package com.yy.mapper;

import java.util.List;

import com.yy.model.Gtype;


public interface GtypeMapper {
	void save(Gtype gtype);    
    boolean update(Gtype gtype); 
    boolean delete(int typeid);
    Gtype findByTypeid(int typeid);    
    List<Gtype> findAll();

}
