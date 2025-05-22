package karshikatestpkg;

import org.testng.annotations.Test;


import karshikabasepkg.KarshikaBaseClass;

import karshikapagepkg.KarshikaAddnewItem;

public class KarshikaAccountTest extends KarshikaBaseClass
{
@Test
public void test1() throws Exception
{
	KarshikaAddnewItem page=new KarshikaAddnewItem(driver);
	page.addnewItem("mango plant", "alphonsa mango plant avaialable", "30", "50", "Kerala","Kollam", "thotil", "456432");
	page.uploadfoto();
}

}
