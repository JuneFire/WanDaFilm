package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.FilmRoom;
/*
 * FilmRoomDao.java
 * 实现对FilmRoom表的增删查改
 * 2015-7-29
 * by 涂伟
 */

public class FilmRoomDao {
	//增加filmroom
	public int addFilmRoom(String filmroom_name,int cinema_id,int filmroom_seatnum){
		  int lines=0;
		  DbDao db=new DbDao();
		  String sql="insert into filmroom(filmroom_name,cinema_id,filmroom_seatnum) value(?,?,?);";
		  try {
			lines=db.executeUpdate(sql, filmroom_name,cinema_id,filmroom_seatnum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  return lines;
    }
	//根据filmroom_name删除filmroom
    public int removefilmroom(String filmroom_name){
    	int lines=0;
    	DbDao db=new DbDao();
    	String sql="delete from filmroom where filmroom_name=?;";
    	try {
			lines=db.executeUpdate(sql, filmroom_name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return lines;
    }
    //根据filmroom_name查找filmroom
    public ArrayList querryfilmroom(String filmroom_name){
     
    	DbDao db=new DbDao();
    	String sql="select * from filmroom where filmroom_name=?;";
    	ResultSet res=null;
    	ArrayList<FilmRoom> alf=new ArrayList<FilmRoom>();
    	res=db.querrySQL(sql, filmroom_name);
    	try {
			if(res.first()){
				while(res.next()){
				FilmRoom f=new FilmRoom();
			    f.setFilmroom_id(res.getInt(1));
			    f.setFilmroom_name(res.getString(2));
			    f.setCinema_id(res.getInt(3));
			    f.setFilmroom_sertnum(res.getInt(4));
			    alf.add(f);
			    }
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return alf;
    } 

}
