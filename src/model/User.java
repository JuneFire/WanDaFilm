package model;

import java.util.Date;

public class User {
	private int user_id;
	private String user_name;
	private String user_passwd;
	private int user_phone;
	private String user_truename;
	private int user_sex;
	private Date user_birth;
	private String user_mail;
	private String user_address;
	private int user_status;
	private String user_imgpath;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_passwd() {
		return user_passwd;
	}
	public void setUser_passwd(String user_passwd) {
		this.user_passwd = user_passwd;
	}
	public int getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(int user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_truename() {
		return user_truename;
	}
	public void setUser_truename(String user_truename) {
		this.user_truename = user_truename;
	}
	public int isUser_sex() {
		return user_sex;
	}
	public void setUser_sex(int user_sex) {
		this.user_sex = user_sex;
	}
	public Date getUser_birth() {
		return user_birth;
	}
	public void setUser_birth(Date user_birth) {
		this.user_birth = user_birth;
	}
	public String getUser_mail() {
		return user_mail;
	}
	public void setUser_mail(String user_mail) {
		this.user_mail = user_mail;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public int isUser_status() {
		return user_status;
	}
	public void setUser_status(int user_status) {
		this.user_status = user_status;
	}
	public String getUser_imgpath() {
		return user_imgpath;
	}
	public void setUser_imgpath(String user_imgpath) {
		this.user_imgpath = user_imgpath;
	}
	public User(int user_id, String user_name, String user_passwd,
			int user_phone, String user_truename, int user_sex,
			Date user_birth, String user_mail, String user_address,
			int user_status, String user_imgpath) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_passwd = user_passwd;
		this.user_phone = user_phone;
		this.user_truename = user_truename;
		this.user_sex = user_sex;
		this.user_birth = user_birth;
		this.user_mail = user_mail;
		this.user_address = user_address;
		this.user_status = user_status;
		this.user_imgpath = user_imgpath;
	}
	public User() {
		super();
	}
	
	
}
