package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import model.Cinema;

import org.junit.Test;

import dao.CinemaDao;

public class CinemaDaoTest {

	@Test
	public void test() {
		CinemaDao cd=new CinemaDao();
	    ArrayList<Cinema> alc=new ArrayList<Cinema>();
		for(int i=0;i<20;i++)
		cd.addCinema("大学", "枫林大道", 3);
	    
	    alc=cd.querryCinema("大学");
	    for(Cinema c:alc)
	    	System.out.println(c.getCinema_name());
	    
	    cd.removeCinema("大学");
	    
	    
	}

}
