package test;

import static org.junit.Assert.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import model.admin;

import org.junit.Test;

import dao.wddbDao;

/**
 * @author Ennish
 *
 */
public class dbDaoTest {

	@Test
	public void test() {
		wddbDao dao=new wddbDao();
    	String sql="insert into admin(admin_name, admin_pwd) values(?,?);";
	    int lines = 0;  
		try {
			 lines = dao.executeUpdate(sql, "熊大" , "123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    if(lines>0)System.out.println("插入成功"+lines+"条");
	}
}

/*
public class dbDaoTest{
	@Test
	public void test(){
    String sql="select * from admin where admin_sex='1';";
	
    wddbDao db=new wddbDao();	
	ResultSet res = null;
    ArrayList<admin> vad=new ArrayList<admin>();
	 res=db.querrySQL(sql);
	if(res==null)System.out.println("无查询信息");
	else
		try {
			while(res.next()){
			  admin ad=new admin();
			  ad.setAdmin_id(res.getInt(1));
			  ad.setAdmin_name(res.getString(2));
			  ad.setAdmin_pwd(res.getString(3));
			  vad.add(ad);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	for(admin ad:vad)
	{
		System.out.println("admin_id"+ad.getAdmin_id()+"admin_name"+ad.getAdmin_name());		
    }
	}
	
}
*/

/*      PreparedStatement里面是什么 打？号的就能set么 想的太天真，多百度
		java.sql.ResultSet rs=null;
	    String sql="select from ?,?where ?,?";
	    PreparedStatement pst1=null;
	    java.sql.Connection conn=dbDao.getConn();
	    try {
			pst1=conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				 rs=pst1.getGeneratedKeys();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	    try {
			while(rs.next()){
				if(rs.next()!=false)
			System.out.println(rs.getObject(1).toString());
			System.out.println(rs.getObject(2).toString());
			System.out.println(rs.getObject(3).toString());
			 
		}
	    }catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
*/
