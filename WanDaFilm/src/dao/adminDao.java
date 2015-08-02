package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.admin;

public class adminDao {

	String updmsg = null;
	String qrymsg = null;

	/*
	 * 增添操作 向admin表增添一行数据，返回值为插入行数，所有这里为1 默认这四项都可为空
	 */
	public int addAdmin(Object... objects) {
		String sql = "insert into admin(admin_name,admin_issuper,admin_sex,admin_imgpath,admin_passwd) values(?,?,?,?,?);";
		wddbDao wddb = new wddbDao();
		int lines = 0;
		try {
			lines = wddb.executeUpdate(sql, objects);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			updmsg = e.toString();
			System.out.println(updmsg);
			e.printStackTrace();
		}
		return lines;
	}

	/*
	 * 查找返回符合指定项的所有条目放在ArrayList中
	 */
	public ArrayList<admin> getAdmin(Object... objects) {
		ResultSet res = null;
		String sql = "select * from admin where admin_name=?";
		ArrayList<admin> ada = new ArrayList<admin>();
		wddbDao wdb = new wddbDao();
		res = wdb.querrySQL(sql, objects);
		try {
			while (res.next()) {
				admin ad = new admin();
				ad.setAdmin_id(res.getInt(1));
				ad.setAdmin_name(res.getString(2));
				ad.setAdmin_issuper(res.getString(3));
			    ad.setAdmin_sex(String.valueOf(res.getInt(4)));
			    ad.setAdmin_passwd(res.getString(5));
			    
				ada.add(ad);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			qrymsg = e.toString();
			System.out.println(qrymsg);
			e.printStackTrace();
		}
		return ada;
	}

	// 根据admin_name查admin
	public admin getAdmin(String admin_name) {
	
		admin ad = new admin();
		String sql = "select * from admin where admin_name=?;";
		

		ResultSet res = wddbDao.querrySQL(sql, admin_name);
		try {
			if (res.first()) {	
				ad.setAdmin_id(res.getInt(1));//System.out.println(ad.getAdmin_id());
				ad.setAdmin_name(res.getString(2));//System.out.println(ad.getAdmin_name());
				ad.setAdmin_issuper(res.getInt(3)+"");
			    ad.setAdmin_sex(res.getInt(4)+"");
			    ad.setAdmin_imgpath(res.getString(5));
			    ad.setAdmin_passwd(res.getString(6));
			}
		}
 catch (SQLException se) {
			// TODO Auto-generated catch block
			qrymsg = se.toString();
			System.out.println(qrymsg);
			se.printStackTrace();
  }
 catch(NullPointerException npe){
			 System.out.println(npe.toString());
			 npe.printStackTrace();
  }
 

	return ad;
}

	/*
	 * 删除
	 */
	public int remove(Object... objects) {
		int lines = 0;
		String sql = "delete from admin where admin_name like ?;";
		// String
		// sql="SELECT * FROM TABLE WHERE ID like ? AND CLASS like ? AND NAME like ?"

		wddbDao wddb = new wddbDao();
		try {
			lines = wddb.executeUpdate(sql, objects);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}
}
