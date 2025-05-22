package karshikabasepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class KarshikaBaseClass {
	public static WebDriver driver;


	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://karshika.com/login");
		driver.manage().window().maximize();

	}

}
