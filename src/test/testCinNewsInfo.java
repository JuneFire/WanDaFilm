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
		String news_name = "׽����";
		String news_content = "��׽���ǡ����������ִ�����װٺΡ�����Ȼ����־ΰ������硢���䡢�Ӻ������ݵ�һ����õ�Ӱ��Ҧ������Ψ�ر������׽����ʦ�Ľ�ɫ�������Cindy�������һ�ԡ�����";
		int i = 0;
		i = nDao.addNews(news_name, news_content);
		if (i >= 0) {
			System.out.println("�����ɹ�");
		} else {
			System.out.println("����ʧ��");
		}
	}

	@Test
	public void delNews() {
		Scanner input = new Scanner(System.in);
		System.out.println("����id:");
		int id = input.nextInt();
		int rs = nDao.delNews(id);
		if (rs > 0) {
			System.out.println("�ɹ�");

		} else {
			System.out.println("ʧ��");
		}

	}

	@Test
	public void xx() {

		Scanner input = new Scanner(System.in);
		System.out.println("����id:");
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
