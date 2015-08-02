package dao;
/**
 * 
 * @param czk
 *  2015-7-30
 */
import java.sql.ResultSet;
import java.util.ArrayList;

import model.FilmType;

public class FilmTypeDao {
	FilmType ft =new FilmType();
	DbDao db = new DbDao();
	
	//查询所有
	public ArrayList<FilmType> selectAll(){
		ResultSet rs = null;
		String sql ="select * from type";
		ArrayList<FilmType> list = new ArrayList<FilmType>();
		rs = DbDao.querrySQL(sql);
		try {
			while(rs.next()){
				FilmType ft =new FilmType();
				ft.setType_id(rs.getInt(1));
				ft.setType_name(rs.getString(2));
				list.add(ft);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	/**
	 * 单个查询,可以按id或者name查找
	 * @param searchValue
	 * @return
	 */
	public ArrayList<FilmType> selectAll(String searchValue){
		ResultSet rs = null;
		String sql ="select * from type where type_id=? or type_name=?";
		ArrayList<FilmType> list = new ArrayList<FilmType>();
		rs = DbDao.querrySQL(sql,searchValue,searchValue);
		try {
			while(rs.next()){
				FilmType ft =new FilmType();
				ft.setType_id(rs.getInt(1));
				ft.setType_name(rs.getString(2));
				list.add(ft);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}
	
	/**
	 * 添加
	 */
	public int addFilmType(Object...objects){
		int result=0;
		String sql ="insert into type(type_id,type_name) values(?,?)";
		try {
			result = db.executeUpdate(sql,objects);//ni.getType_id(),ni.getType_name()
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	/**
	 * 更新
	 */
	public int updateFilmType(FilmType ft){
		int result=0;
		String sql ="update type set type_name=? where type_id=?";
		try {
			result = db.executeUpdateRB(sql,ft.getType_name(),ft.getType_id());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 删除
	 */
	public int deleteFilmType(Object...objects){
		int result = 0;
		String sql = "delete from type where type_id=?";
		try {
			result = db.executeUpdate(sql, objects);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
}
