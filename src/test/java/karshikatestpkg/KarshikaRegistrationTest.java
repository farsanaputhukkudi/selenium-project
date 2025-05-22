package karshikatestpkg;

import org.testng.annotations.Test;

import karshikabasepkg.KarshikaBaseClass;
import karshikapagepkg.KarshikaRegistration;

public class KarshikaRegistrationTest extends KarshikaBaseClass {
	@Test
	public void test1()
	{
		KarshikaRegistration page=new KarshikaRegistration(driver);
		page.registerclick();
		page.setvalues("kamala", "kamala@gmail.com", "7865111100", "Kamalamariya@123", "Kamalamariya@123");
		page.register();
		
	}

}
