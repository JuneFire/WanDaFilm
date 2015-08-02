package model;
/*
 * admin_id为自增长类型从1开始
 * admin_sex 1男 0女
 * 
 */
public class admin {
 public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	 public String getAdmin_pwd() {
			return admin_pwd;
		}
		public void setAdmin_pwd(String admin_pwd) {
			this.admin_pwd = admin_pwd;
		}
		 



 private int admin_id;
 private String admin_name;
 private String admin_pwd;
 
 

}
