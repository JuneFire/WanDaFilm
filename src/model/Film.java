package model;

public class Film{
	
	private int film_id;
	private String film_name;
	private FilmType filmType;
	private String film_imgpath; //电影图片路径
	private String film_director;  //导演
	private String film_actor;  //演员
	private float film_score;   //评分
	private String film_introduction;   // 简介
	
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public String getFilm_name() {
		return film_name;
	}
	public void setFilm_name(String film_name) {
		this.film_name = film_name;
	}
	/*public int getFilm_type_id() {
		return film_type_id;
	}
	public void setFilm_type_id(int film_type_id) {
		this.film_type_id = film_type_id;
	}*/
	public String getFilm_imgpath() {
		return film_imgpath;
	}
	public void setFilm_imgpath(String film_imgpath) {
		this.film_imgpath = film_imgpath;
	}
	public String getFilm_director() {
		return film_director;
	}
	public void setFilm_director(String film_director) {
		this.film_director = film_director;
	}
	public String getFilm_actor() {
		return film_actor;
	}
	public void setFilm_actor(String film_actor) {
		this.film_actor = film_actor;
	}
	public float getFilm_score() {
		return film_score;
	}
	public void setFilm_score(float film_score) {
		this.film_score = film_score;
	}
	public String getFilm_introduction() {
		return film_introduction;
	}
	public void setFilm_introduction(String film_introduction) {
		this.film_introduction = film_introduction;
	}
	public FilmType getFilmType() {
		return filmType;
	}
	public void setFilmType(FilmType filmType) {
		this.filmType = filmType;
	}
	
	
}
