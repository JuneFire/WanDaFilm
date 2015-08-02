package test;

import static org.junit.Assert.*;

import java.sql.Date;

import model.User;

import org.junit.Test;

import dao.UserDao;

public class UserDaoTest {

	@Test
	public void test() {
		UserDao ud=new UserDao();
		User us=new User();
		Date user_birth =new Date(20010102);
		for(int i=0;i<20;i++)
		{
			us.setUser_address("jiangxi");
			us.setUser_birth(user_birth);
			us.setUser_imgpath("weizhi");
			us.setUser_mail("qq.com");
			us.setUser_name("八戒");
			us.setUser_passwd("mimawobugaosuni");
			us.setUser_phone(110);
			us.setUser_sex(1);
			us.setUser_status(1);
			us.setUser_truename("tianpeng");
            
			ud.addUser(us);
		}
	}

}
