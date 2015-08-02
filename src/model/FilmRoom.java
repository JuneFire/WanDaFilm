package model;

public class FilmRoom {
	
	public int getFilmroom_id() {
		return filmroom_id;
	}
	public void setFilmroom_id(int filmroom_id) {
		this.filmroom_id = filmroom_id;
	}
	public String getFilmroom_name() {
		return filmroom_name;
	}
	public void setFilmroom_name(String filmroom_name) {
		this.filmroom_name = filmroom_name;
	}
	public int getCinema_id() {
		return cinema_id;
	}
	public void setCinema_id(int cinema_id) {
		this.cinema_id = cinema_id;
	}
	public int getFilmroom_sertnum() {
		return filmroom_sertnum;
	}
	public void setFilmroom_sertnum(int filmroom_sertnum) {
		this.filmroom_sertnum = filmroom_sertnum;
	}
	
	private int filmroom_id;
	private String filmroom_name;
	private int cinema_id;
	private int filmroom_sertnum;
	
}
