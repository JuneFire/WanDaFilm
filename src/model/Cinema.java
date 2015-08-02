package model;
/*
 * Cinema类
 * 电影院的modle
 * 15.7.29
 * by 涂伟
 */
public class Cinema {
  
	
	public int getCinema_id() {
		return cinema_id;
	}
	public void setCinema_id(int cinema_id) {
		this.cinema_id = cinema_id;
	}
	public String getCinema_name() {
		return cinema_name;
	}
	public void setCinema_name(String cinema_name) {
		this.cinema_name = cinema_name;
	}
	public String getCinema_address() {
		return cinema_address;
	}
	public void setCinema_address(String cinema_address) {
		this.cinema_address = cinema_address;
	}
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	private int cinema_id;
	private String cinema_name;
    private String cinema_address;
    private int city_id;
}
