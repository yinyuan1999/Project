package com.gsdx.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.gsdx.entity.Userinfo;

public class MybatisTest {
	@Test
	public void selectAll() {
		String resource = "config/Configuration.xml";
		Reader reader;
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession sqlsession = null;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			sqlsession = sqlSessionFactory.openSession();
			List<Userinfo> users = sqlsession.selectList("UserinfoMapper.selectAll");
			for (Userinfo userinfo : users) {
				System.out.println(userinfo);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sqlsession != null) {
				sqlsession.close();
			}
		}

	}

	@Test
	public void selectByUsername() {
		String resource = "config/Configuration.xml";
		Reader reader;
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession sqlsession = null;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			sqlsession = sqlSessionFactory.openSession();
			Userinfo user = sqlsession.selectOne("UserinfoMapper.selectByUsername", "zhangsan");
			System.out.println(user);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (sqlsession != null) {
				sqlsession.close();
			}
		}

	}
	@Test
	public void insertUser() {
		String resource = "config/Configuration.xml";
		Reader reader;
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession sqlsession = null;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			sqlsession = sqlSessionFactory.openSession();
			Userinfo user=new Userinfo();
			user.setPassword("999888");
			user.setUsername("xiaoming1");
			user.setRealname("小明");
			int result = sqlsession.insert("UserinfoMapper.insertUser",user);
			sqlsession.commit();
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlsession.rollback();
		} finally {
			if (sqlsession != null) {
				sqlsession.close();
			}
		}

	}
	@Test
	public void updateUser() {
		String resource = "config/Configuration.xml";
		Reader reader;
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession sqlsession = null;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			sqlsession = sqlSessionFactory.openSession();
			Userinfo user=new Userinfo();
			user.setPassword("101010");
			user.setUsername("xiaoming1");
			user.setRealname("小明");
			user.setUserid(6);
			int result = sqlsession.update("UserinfoMapper.updateUser",user);
			sqlsession.commit();
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlsession.rollback();
		} finally {
			if (sqlsession != null) {
				sqlsession.close();
			}
		}

	}
	@Test
	public void deleteUser() {
		String resource = "config/Configuration.xml";
		Reader reader;
		SqlSessionFactory sqlSessionFactory = null;
		SqlSession sqlsession = null;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			sqlsession = sqlSessionFactory.openSession();
			
			int result = sqlsession.delete("UserinfoMapper.deleteUser",6);
			sqlsession.commit();
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlsession.rollback();
		} finally {
			if (sqlsession != null) {
				sqlsession.close();
			}
		}

	}
}
