package test;
/*
 * 
 * 
 * 
 */
import static org.junit.Assert.*;

import org.junit.Test;

import dao.CityDao;

public class cityDaoTest {

	@Test
	public void test() {
	  CityDao cd=new CityDao();
	  cd.addCity("南京");
	  cd.addCity("南昌");
	  cd.removeCity("南京");
	  
	 
	}

}
