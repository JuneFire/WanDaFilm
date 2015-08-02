//赖喜彬

package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDao {
	DbDao dbDao = new DbDao();

	// 通过含参的方法验证用户名和密码
	public boolean doLogin(String userName, String userPwd) {
		boolean iflogin = true;
		try {
			String sql = "select * from user where user_name=? and user_passwd=?";
			ResultSet rs = dbDao.querrySQL(sql, userName, userPwd);
			if (rs.next()) {
				iflogin = true;
				System.out.println("登陆成功");
			} else {
				iflogin = false;
				System.out.println("用户名或密码错误，请重新登录");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return iflogin;
	}

	public String msg;

	// 查询
	public static List<User> getUserList(int id) {
		List<User> ar = new ArrayList<User>();
		Connection conn = DbDao.getConn();
		// SQL执行器对象
		PreparedStatement ps = null;
		// 结果集对象
		ResultSet rs = null;
		try {
			String sql = "select * from user where user_id=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				User us = new User();
				us.setUser_id(rs.getInt("user_id"));
				us.setUser_name(rs.getString("user_name"));
				us.setUser_passwd(rs.getString("user_passwd"));
				us.setUser_phone(rs.getInt("user_phone"));
				us.setUser_truename(rs.getString("user_truename"));
				us.setUser_sex(rs.getInt("user_sex"));
				us.setUser_birth(rs.getDate("user_birth"));
				us.setUser_mail(rs.getString("user_mail"));
				us.setUser_address(rs.getString("user_address"));
				us.setUser_status(rs.getInt("user_status"));
				us.setUser_imgpath(rs.getString("user_imgpath"));
				ar.add(us);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbDao.res = rs;
			DbDao.close();
		}
		return ar;
	}

	// 插入
	public void addUser(User us) {
		DbDao dao = new DbDao();
		String sql = "insert into user(user_name,user_passw,user_phone,user_truename,user_sex,user_birth,user_mail,user_address,uer_status,user_imgpath) values(?,?,?,?,?,?,?,?,?,?)";
		try {
			dao.insert(us);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg = e.getMessage();
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 注册
	public void registerUser(User us) {
		DbDao dao = new DbDao();
		String sql = "insert into user(user_name,user_passwd,user_phone,user_truename,user_sex,user_birth,user_mail,user_address) values(?,?,?,?,?,?,?,?)";
		try {
			dao.insert(us);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg = e.getMessage();
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 测试
	public void testUser(User us) {
		DbDao dao = new DbDao();
		String sql = "insert into user(user_name) values(?)";
		try {
			dao.insert(us);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg = e.getMessage();
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 修改
	public int updateUser(User us, int id) {
		int result = 0;
		DbDao dao = new DbDao();
		String sql = "update user set user_name=?,user_passw=?,user_phone=?,user_truename=?,user_sex=?,user_birth=?,user_mail=?,user_address=?,uer_status,user_imgpath=?";
		sql += " where user_id=?";
		try {
			result = dao.executeUpdate(sql, us.getUser_name(),
					us.getUser_passwd(), us.getUser_phone(),
					us.getUser_truename(), us.isUser_sex(), us.getUser_birth(),
					us.getUser_mail(), us.getUser_address(),
					us.isUser_status(), us.getUser_imgpath(), us.getUser_id());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			msg = e.getMessage();
			e.printStackTrace();
		}
		return result;
	}

	// 删除
	public void deleteUser(int id) {
		DbDao dbDao = new DbDao();
		try {
			String sql = "delete from user where user_id = ?";
			dbDao.executeUpdate(sql, 1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
