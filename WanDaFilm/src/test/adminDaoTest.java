package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import model.admin;

import org.junit.Test;

import dao.adminDao;

public class adminDaoTest {
	  adminDao ad=new adminDao();
	/*@Test
	 * // 增加
	public void test() {
	
	  System.out.println(ad.addAdmin("丁扁","1","0","url1"));
	  
	}
*/
	@Test//查询
	public void test(){
		
		 admin admin=ad.getAdmin("丁扁");
		 if(admin==null)
			 System.out.println("无此用户");
		 else if(admin.getAdmin_pwd()=="123")
			System.out.println(admin.getAdmin_id()+"admin_name"+admin.getAdmin_name());
		 else System.out.println("密码错误");
	}
	 /* @Test//删除
	 public void test(){
		int lines=0;
		lines=ad.remove("丁扁");
		System.out.println(lines);
	 }*/
}
