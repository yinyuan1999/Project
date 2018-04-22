package com.shopsys.dao;

import com.shopsys.entity.Userinfo;

public class UserDao {
    public boolean login(Userinfo user) {
    	String sql="select * from userinfo where usernmae=? and password=?";
    	
    	return true;
    }
}
