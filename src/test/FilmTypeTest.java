package test;
/*
 * Test by czk
 */
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.FilmType;

import org.junit.Test;

import dao.FilmTypeDao;

public class FilmTypeTest {

	FilmType ft = new FilmType();
	FilmTypeDao fd = new FilmTypeDao();
	@Test
	public void test(){
		/*//add
		fd.addFilmType(1,"asd");
		fd.addFilmType(2,"sasd");*/
		//select
	
	/*	
		ArrayList<FilmType> list = fd.selectAll();
		for(FilmType s:list){
			System.out.println(s.getType_id()+" "+s.getType_name());
		}
		*/
		ArrayList<FilmType> list1 = fd.selectAll("asd");
		for(FilmType s:list1){
			System.out.println(s.getType_id()+" "+s.getType_name());
		}
		//delete
		
	}
}
