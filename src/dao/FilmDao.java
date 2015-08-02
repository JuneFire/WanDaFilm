package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Film;
import model.FilmType;
/*
 * coded by czk 2015-7-29
 */
public class FilmDao {
	
	DbDao db = new DbDao();
	Film film = new Film();
	public String msg = "";
	/**
	 * 添加电影信息
	 */
	public int addFilm(Object...objects){
		
		String sql ="insert into film(film_id, film_name,film_type_id,"
				+ "film_imgpath,film_director,film_actor,film_score,"
				+ "film_introduction) values(?,?,?,?,?,?,?,?)";
	int result = 0;
	try {
		result = db.executeUpdate(sql, objects);
		/*result = db.executeUpdate(sql,film.getFilm_id(),film.getFilm_name(),film.getFilm_type_id(),
				film.getFilm_imgpath(),film.getFilm_director(),film.getFilm_actor(),film.getFilm_score()
				,film.getFilm_introduction());*/
	} catch (Exception e) {
		e.printStackTrace();
	}
		return result;
	}
	/**
	 * 按id查找电影信息
	 * @param flName
	 * @return
	 */
	public Film getFilmInfoById(String id){
		Film f = null;
		ResultSet res = null;
		String sql="select * from film where film_id=? ";
		            //关键字查询
		res = DbDao.querrySQL(sql, id);
		try {
			while(res.next()){
				//这里用数字代表字段名，可以修改
				f = new Film();
				f.setFilm_id(res.getInt(1));
				f.setFilm_name(res.getString(2));
				FilmType ft = new FilmType();
				ft.setType_id(res.getInt("film_type_id")); //把film_type_id的值赋给type_id			
				f.setFilmType(ft);             //把type_id的值传入f
				f.setFilm_imgpath(res.getString(4));
				f.setFilm_director(res.getString(5));
				f.setFilm_actor(res.getString(6));
				f.setFilm_score(res.getFloat(7));
				f.setFilm_introduction(res.getString(8));
		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DbDao.res = res;
			DbDao.close();
		}
		return f;
		
	}
	/**
	 * 按电影名查找电影信息，当然还可以按关键字查询
	 * 
	 */
	public Film getFilmInfo(String flName){
		Film f = null;
		ResultSet res = null;
		String sql="select * from film where film_name like ?";
		flName = "%"+flName+"%";                  //关键字查询
		res = DbDao.querrySQL(sql, flName);
		try {
			while(res.next()){
				//这里用数字代表字段名，可以修改
				f = new Film();
				f.setFilm_id(res.getInt(1));
				f.setFilm_name(res.getString(2));
				FilmType ft = new FilmType();
				ft.setType_id(res.getInt("film_type_id")); //把film_type_id的值赋给type_id			
				f.setFilmType(ft);             //把type_id的值传入f
				f.setFilm_imgpath(res.getString(4));
				f.setFilm_director(res.getString(5));
				f.setFilm_actor(res.getString(6));
				f.setFilm_score(res.getFloat(7));
				f.setFilm_introduction(res.getString(8));
		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally{
			DbDao.res = res;
			DbDao.close();
		}
		return f;
		
	}
	/**
	 * 关联查询
	 */
	public List<Film> selectAll(){
		ResultSet rs = null;
		String sql ="select  f.*,t.type_name from film f join type t on f.film_type_id=t.type_id";
		ArrayList<Film> list = new ArrayList<Film>();
		rs=db.querrySQL(sql);
		try {
			while(rs.next()){
				//字段名数据赋值
				Film f = new Film();
				f.setFilm_id(rs.getInt("film_id"));
				f.setFilm_name(rs.getString("film_name"));
				FilmType ft = new FilmType();
				ft.setType_name(rs.getString("type_name"));
				f.setFilmType(ft);
				//加入到List
				list.add(f);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			DbDao.res =rs;
			DbDao.close();
		}
		return list;
	}
	
	/**
	 * 删除
	 */
	public int deleteFilm(Object...objects){
		int result=0;
		String sql = "delete from film where film_name=?"; //like '%?%'";//+ "'%"+"?"+"%'"; //'%?%'
		try {
			result = db.executeUpdate(sql, objects);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 修改影片信息
	 */
	public int updateFilm(Film fm){
		int result = 0;
		/**
		 * mySQL的更新语句（唯一）
		 * */
		String sql ="update film set "
				+ "film_name=?,film_type_id=?,film_imgpath=?,"
				+ "film_director=?,film_actor=?,film_score=?,"
				+ "film_introduction=? where film_id=?";
		try {
			result = db.executeUpdateRB(sql,fm.getFilm_name(),fm.getFilmType().getType_id(),fm.getFilm_imgpath(),fm.getFilm_director()
					,fm.getFilm_actor(),fm.getFilm_score(),fm.getFilm_introduction(),fm.getFilm_id());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
		
	}
}
