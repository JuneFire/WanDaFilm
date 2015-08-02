package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Seat;
//赖喜彬

public class SeatDao {
	// 查询
		public static List<Seat> getSeatList(int id) {
			List<Seat> ar = new ArrayList<Seat>();
			Connection conn = DbDao.getConn();
			// SQL执行器对象
			PreparedStatement ps = null;
			// 结果集对象
			ResultSet rs = null;
			try {
				String sql = "select * from seat where seat_id=?";
				ps = conn.prepareStatement(sql);
				ps.setInt(1, id);
				rs = ps.executeQuery();
				while (rs.next()) {
					Seat se = new Seat();
					se.setSeat_id(rs.getInt("seat_id"));
					se.setSeat_name(rs.getString("seat_name"));
					se.setSeat_filmroom_id(rs.getInt("seat_filmroom_id"));
					se.setSeat_status(rs.getBoolean("seat_status"));
					ar.add(se);
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
		public String msg;
		public void adduser(Seat se) {
			DbDao dao = new DbDao();
			String sql = "insert into seat(seat_id,seat_status,seat_filmroom_id,seat_name) values(?,?,?,?)";
			try {
				dao.insert(se);

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
		public int updateSeat(Seat se, int id) {
			int result = 0;
			DbDao dao = new DbDao();
			String sql = "update seat set ,Seat_status=?,seat_filmroom_id=?,seat_name=?";
			sql += " where seat_id=?";
			try {
				result = dao.executeUpdate(sql,se.isSeat_status(),
						se.getSeat_filmroom_id(),se.getSeat_name(), se.getSeat_id());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				msg = e.getMessage();
				e.printStackTrace();
			}
			return result;
		}

		// 删除
		public void deleteSeat(int id) {
			DbDao dbDao = new DbDao();
			try {
				String sql = "delete from seat where seat_id = ?";
				dbDao.executeUpdate(sql, 1);

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
}
