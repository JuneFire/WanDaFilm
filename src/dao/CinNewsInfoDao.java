package Dao;
/**
 * ÏÄÌÆÁè 7.30
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.criteria.From;
import javax.persistence.criteria.Join;

import model.CinNewsInfo;

//Ôö¼Ó
public class CinNewsInfoDao {
	FilmdbDao daoUtil = new FilmdbDao();
	public String msg;

	public int addNews(String new_name, String news_content) {
		int result = 0;
		String sql = "insert into news(news_name,news_content)values(?,?)";
		try {
			daoUtil.executeSQL(sql, new_name, news_content);
		} catch (SQLException e) {
			msg = e.getMessage();
			e.printStackTrace();
		}
		return result;
	}

	public ResultSet selectAll() {
		List<CinNewsInfo> list = null;
		ResultSet rs = null;
		String sql = "";
		sql = "select n.news_id,t.news_name,n.content";
		rs = daoUtil.execute(sql);
		return rs;
	}

	// É¾³ý
	public int delNews(int news_id) {
		int result = 0;
		String sql = " delete from news where news_id=?";
		try {
			result = daoUtil.executeSQL(sql, news_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg = e.getMessage();
			e.printStackTrace();
		}
		return result;
	}

	// ²éÑ¯
	public CinNewsInfo getNewsInfoById(String news_id) {
		CinNewsInfo ni = null;
		String sql = "select * from newsinfo where news_id=?";
		ResultSet rs = daoUtil.execute(sql, news_id);
		try {
			if (rs.next()) {
				ni = new CinNewsInfo();
				ni.setNews_id(rs.getInt("id"));
				ni.setNews_name(rs.getString("name"));
				ni.setNews_content(rs.getString("contents"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			daoUtil.res = rs;
			daoUtil.close();
		}
		return ni;
	}

	// ÐÞ¸Ä
	public int saveData(int id, String news_name, String news_content) {
		int result = 0;

		String sql = "update news set news_name=?,news_content=? where news_id=?";

		try {
			result = daoUtil.executeSQL(sql, news_name, news_content, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg = e.getMessage();
			e.printStackTrace();
		}
		return result;
	}
}
