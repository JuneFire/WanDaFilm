package test;
/*
 * Test by czk
 */
import model.Film;
import model.FilmType;

import org.junit.Test;

import dao.FilmDao;

public class FilmTest {
	FilmDao films =new FilmDao(); 
	Film fm = new Film();
	FilmType ft = new FilmType();
	
	@Test
	public void test() {
		//add
		//films.addFilm(null,"红楼梦",1,null,"曹雪芹","黛玉","9.0","怡红院");
		// update
		
/*		fm.setFilm_id(14);
		fm.setFilm_name("红楼梦2");
		ft.setType_id(2);
		fm.setFilmType(ft);
		fm.setFilm_imgpath(null);
		fm.setFilm_actor("程志康");
		fm.setFilm_director(null);
		fm.setFilm_score(0);
		fm.setFilm_introduction(null);
		films.updateFilm(fm);

		//delete
		films.deleteFilm("西游记") ;*/
		//show
		/*ArrayList<Film> fs = films.getFilmInfo("楼");
		for(Film f:fs){
			System.out.println(f.getFilm_actor());
		}
		Film fi = films.getFilmInfo("红楼梦");
		System.out.println(fi.getFilm_id());*/
		Film fi2 = films.getFilmInfoById("14");
		System.out.println(fi2.getFilm_actor());
		
		/*List<Film> fs = films.selectAll();
		for(Film f:fs){
			System.out.println(f.getFilm_id()+" "+f.getFilm_name()+" "+f.getFilmType().getType_name());
		}*/
	}
	
	
}
