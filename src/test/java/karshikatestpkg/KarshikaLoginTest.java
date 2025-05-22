package karshikatestpkg;

import org.testng.annotations.Test;


import karshikabasepkg.KarshikaBaseClass;
import karshikapagepkg.KarshikaLogin;
import karshikautilities.KarshikaExcel;

public class KarshikaLoginTest extends KarshikaBaseClass {
	@Test
	public void test1()
	{
		KarshikaLogin page=new KarshikaLogin(driver);
		String xl="C:\\Users\\farsa\\karshikadata.xlsx\\";
		String sheet="Sheet1";
		int rowcount=KarshikaExcel.getRowcount(xl, sheet);
		for(int i=1;i<=rowcount;i++)
		{
			String username=KarshikaExcel.getcellvalues(xl, sheet, i, 0);
			String passwrd=KarshikaExcel.getcellvalues(xl, sheet, i, 1);
			page.login(username, passwrd);
		    page.click();
		}
		
	}

}
