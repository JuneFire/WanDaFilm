package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Admin;


public class AdminDao {
   
	String updmsg=null;
	String qrymsg=null;
    /*
     * 增添操作
     * 向admin表增添一行数据，返回值为插入行数，所有这里为1
     * 默认这四项都可为空
     */
    public int  addAdmin(Object...objects){
     String sql="insert into admin(admin_name,admin_issuper,admin_sex,admin_imgpath) values(?,?,?,?);";
      DbDao wddb=new DbDao();  
      int lines=0;   
      try {
		lines=wddb.executeUpdate(sql, objects);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		updmsg=e.toString();
		System.out.println(updmsg);
		e.printStackTrace();
	}
        return lines;
	}
	/*
	 *查找
	 *返回符合指定项的所有条目放在ArrayList中
	 */
   public ArrayList<Admin> getAdmin(Object...objects){
	   ResultSet res=null;
	   String sql="select * from admin where admin_name=? and admin_pwd=?";
	   ArrayList<Admin> ada=new ArrayList<Admin>();
	   DbDao wdb=new DbDao();
	   res=wdb.querrySQL(sql,objects);
	   try {
			while(res.next())
			  { 
				Admin ad = new Admin();
				ad.setAdmin_id(res.getInt(1));
				ad.setAdmin_name(res.getString(2));
			    ad.setAdmin_pwd(res.getString(3));
			    ada.add(ad);
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			qrymsg=e.toString();
			System.out.println(qrymsg);
			e.printStackTrace();
		}    
	   return ada;
   }
   //根据admin_name查admin
   public Admin getAdmin(String admin_name){
	   ResultSet res=null;
	   Admin ad = new Admin();
	   String sql="select * from admin where admin_name=? ";
	   ArrayList<Admin> ada=new ArrayList<Admin>();	 
	   res=DbDao.querrySQL(sql,admin_name);
	   try {
			if(res.next())
			  { 
				
				ad.setAdmin_id(res.getInt(1));
				ad.setAdmin_name(res.getString(2));
			    ad.setAdmin_pwd(res.getString(3));
			  }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			qrymsg=e.toString();
			System.out.println(qrymsg);
			e.printStackTrace();
		}    
	   return ad;
   }
   /*
    * 删除
    * 
    */
    public int remove(Object...objects){
    	int lines=0;
    	String sql="delete from admin where admin_name like ?;";
    	//String sql="SELECT * FROM TABLE WHERE ID like ? AND CLASS like ? AND NAME like ?"
	    
    	DbDao wddb=new DbDao();
    	try {
			lines=wddb.executeUpdate(sql,objects);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return lines;
    }
}
