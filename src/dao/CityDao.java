package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.City;
/*
 * CityDao.java
 * 实现对City表的增删查改
 * 2015-7-29
 * by 涂伟
 * 
 */

public class CityDao {
	//增加city
	public int addCity(String city_name){
		  int lines=0;
		  DbDao db=new DbDao();
		  String sql="insert into city(city_name) value(?);";
		  try {
			lines=db.executeUpdate(sql, city_name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return lines;
    }
	//根据city_name删除city
    public int removeCity(String city_name){
    	int lines=0;
    	DbDao db=new DbDao();
    	String sql="delete from city where city_name=?;";
    	try {
			lines=db.executeUpdate(sql, city_name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return lines;
    }
    //根据city_name查找city
    public City querryCity(String city_name){
    	City c=new City();
    	DbDao db=new DbDao();
    	String sql="select * from city where city_name=?;";
    	ResultSet res=null;
    	res=db.querrySQL(sql, city_name);
    	try {
			if(res.first()){
				c.setCity_id(res.getInt(1));
			    c.setCity_name(res.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return c;
    } 
	 

}
