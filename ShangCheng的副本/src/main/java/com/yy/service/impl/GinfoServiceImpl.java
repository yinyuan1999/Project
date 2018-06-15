package com.yy.service.impl;

import java.util.List;  

import javax.annotation.Resource;  

  
import com.yy.mapper.GinfoMapper;  
import com.yy.model.Ginfo;  
import com.yy.service.GinfoService;

public class GinfoServiceImpl implements GinfoService{
	@Resource  
    private GinfoMapper mapper;  
  
    /**  
     * 根据  id  删除 数据  
     */  
    public boolean delete(int id) {  
        return mapper.delete(id);  
    }  
    /**  
     * 查询User的全部数据  
     */  
    public List<Ginfo> findAll() {  
        List<Ginfo> findAllList = mapper.findAll();  
        return findAllList;  
    }  
    /**  
     * 根据 id 查询 对应数据  
     */  
    public Ginfo findById(int id) {  
    	Ginfo ginfo = mapper.findById(id);  
        return ginfo;  
    }  
    /**  
     * 新增数据  
     */  
    public void save(Ginfo ginfo) {  
        mapper.save(ginfo);  
    }  
    /**  
     * 根据 id 修改对应数据  
     */  
    public boolean update(Ginfo ginfo) {  
        return mapper.update(ginfo);  
    }


}
