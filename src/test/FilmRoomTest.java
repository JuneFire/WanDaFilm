package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import model.FilmRoom;

import org.junit.Test;

import dao.FilmRoomDao;

public class FilmRoomTest {

	@Test
	public void test() {
      FilmRoomDao frd=new FilmRoomDao();
      for(int i=0;i<20;i++)
      frd.addFilmRoom("红谷滩", i++, 90-i);
	  //frd.removefilmroom("红谷滩");
	  ArrayList<FilmRoom> al=new ArrayList();
	  
      al = frd.querryfilmroom("红谷滩");
	  for(FilmRoom f:al)
	  {
		  System.out.print(f.getFilmroom_name());
		  System.out.println(f.getFilmroom_sertnum());
	  }
	}

}
