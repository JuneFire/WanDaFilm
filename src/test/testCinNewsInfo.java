package test;

import java.util.Scanner;

import org.junit.Test;

import model.CinNewsInfo;
import Dao.CinNewsInfoDao;

import com.sun.java_cup.internal.runtime.Symbol;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class testCinNewsInfo {
	CinNewsInfoDao nDao = new CinNewsInfoDao();

	@Test
	public void addNews() {
		// int news_id=2;
		String news_name = "捉妖记";
		String news_content = "《捉妖记》是由许诚毅执导，白百何、井柏然、曾志伟、吴君如、姜武、钟汉良主演的一部奇幻电影，姚晨、汤唯特别出演了捉妖天师的角色，天天和Cindy则扮演了一对“萌妖";
		int i = 0;
		i = nDao.addNews(news_name, news_content);
		if (i >= 0) {
			System.out.println("新增成功");
		} else {
			System.out.println("新增失败");
		}
	}

	@Test
	public void delNews() {
		Scanner input = new Scanner(System.in);
		System.out.println("输入id:");
		int id = input.nextInt();
		int rs = nDao.delNews(id);
		if (rs > 0) {
			System.out.println("成功");

		} else {
			System.out.println("失败");
		}

	}

	@Test
	public void xx() {

		Scanner input = new Scanner(System.in);
		System.out.println("输入id:");
		int id = input.nextInt();
		String news_name = input.next();
		String news_content = input.next();
		int rs = nDao.saveData(id, news_name, news_content);
		if (rs > 0) {

			System.out.println("cg");

		} else {

			System.out.println("sb");
		}
	}

}
