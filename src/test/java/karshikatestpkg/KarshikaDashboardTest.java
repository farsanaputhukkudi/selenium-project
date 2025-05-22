package karshikatestpkg;

import org.testng.annotations.Test;

import karshikabasepkg.KarshikaBaseClass;
import karshikapagepkg.KarshikaDashboard;

public class KarshikaDashboardTest extends KarshikaBaseClass {

	@Test
	public void test1()
	{
		KarshikaDashboard page=new KarshikaDashboard(driver);
		page.dashboard("mango plant", "Delete", "25", "mango coconut plant");
		page.brokenlinkcheck();;
		page.brokenlinkcheck2();;
		page.profile("kamalaa", "7865111101", "kamalaa@gmail.com","farsananasarp@gmail.com" );
		
		page.logout();
	}
	
}
