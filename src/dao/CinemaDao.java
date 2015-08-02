package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Cinema;
 

/*
 * CinemaDao类
 * 对cinema的增删查
 * 15.7.29
 * by涂伟
 */
public class CinemaDao {
	//增加Cinema
		public int addCinema(String city_name,String cinema_address,int city_id){
			  int lines=0;
			  DbDao db=new DbDao();
			  String sql="insert into cinema(cinema_name,cinema_address,city_id) value(?,?,?);";
			  try {
				lines=db.executeUpdate(sql, city_name,cinema_address,city_id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  
			  return lines;
	    }
		//根据cinema_name删除cinema
	    public int removeCinema(String cinema_name){
	    	int lines=0;
	    	DbDao db=new DbDao();
	    	String sql="delete from cinema where cinema_name=?;";
	    	try {
				lines=db.executeUpdate(sql, cinema_name);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	return lines;
	    }
	    
	    //根据cinema_name查找cinema 
	    public ArrayList querryCinema(String cinema_name){
	    	DbDao db=new DbDao();
	    	ArrayList<Cinema> alc=new ArrayList<Cinema>();
	    	String sql="select * from cinema where cinema_name=?;";
	    	ResultSet res=null;
	    	res=db.querrySQL(sql, cinema_name);
	    	try {
				if(res.first()){
					while(res.next())
					{
					Cinema c=new Cinema();
					c.setCinema_id(res.getInt(1));
				    c.setCinema_name(res.getString(2));
				    c.setCinema_address(res.getString(3));
				    c.setCity_id(res.getInt(4));
					alc.add(c);
					}
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	return alc;
	    } 
		 

}
