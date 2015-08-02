package test;

import java.util.List;
import java.util.Scanner;

import model.City;

import org.junit.Test;

import dao.CityDao;

public class CityTest {

	CityDao cd = new CityDao();
	/**
	 * 普通查询
	 */
	/*@Test
	public void query() {
		
		List<City> list = cd.query();
		for(City c:list){
			System.out.println(c.getProvince());
		}
	}*/
	
	/*@Test
	public void add(){
		Scanner sc = new Scanner(System.in);
		int id = 0;
		System.out.println("请输入城市名：");
		String city_name=sc.next();
		System.out.println("请输入省名：");
		String province=sc.next();
	
		cd.addCity(id, city_name, province);
	}
		*/
	/*@Test
	public void update(){

	City city=new City();
	city.setCity_id(2);
	city.setCity_name("sfdsdf");
	city.setProvince("dssfsd");
	cd.upDate(city);
	}*/
	/*@Test
	public void delete(){
		
		cd.delCity(1);;
	}*/

}
