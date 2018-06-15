package com.yy.service.impl;

import java.util.List;  

import javax.annotation.Resource;  
  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  
  
import com.yy.mapper.GtypeMapper;
import com.yy.model.Gtype;
import com.yy.service.GtypeService;  
 
@Service  
@Transactional  
// 此处不再进行创建SqlSession和提交事务，都已交由spring去管理了。

public class GtypeServiceImpl implements GtypeService{
	@Resource  
    private GtypeMapper mapper;  
  
    /**  
     * 根据  typeid  删除 数据  
     */  
    public boolean delete(int typeid) {  
        return mapper.delete(typeid);  
    }  
    /**  
     * 查询type的全部数据  
     */  
    public List<Gtype> findAll() {  
        List<Gtype> findAllList = mapper.findAll();  
        return findAllList;  
    }  
    /**  
     * 根据 id 查询 对应数据  
     */  
    public Gtype findByTypeid(int typeid) {  
        Gtype gtype = mapper.findByTypeid(typeid);  
        return gtype;  
    }  
    /**  
     * 新增数据  
     */  
    public void save(Gtype gtype) {  
        mapper.save(gtype);  
    }  
    /**  
     * 根据 id 修改对应数据  
     */  
    public boolean update(Gtype gtype) {  
        return mapper.update(gtype);  
    }

}
