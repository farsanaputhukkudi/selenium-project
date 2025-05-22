package karshikapagepkg;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class KarshikaAddnewItem {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"accordionSidebar\"]/li[3]/a/span")
	WebElement newitem;
	
	@FindBy(xpath="//*[@id=\"-1\"]")
	WebElement seedsandplants;
	
	@FindBy(xpath="//*[@id=\"1\"]/a[5]/div")
	WebElement agriplants;
	
	@FindBy(xpath="//*[@id=\"title\"]")
	WebElement title;
	
	@FindBy(xpath="//*[@id=\"description\"]")
	WebElement description;
	
	@FindBy(xpath="//*[@id=\"price\"]")
	WebElement price;
	
	
	@FindBy(xpath="//*[@id=\"quantity\"]")
	WebElement quantity;
	
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement state;
	
	
	@FindBy(xpath="//*[@id=\"district\"]")
	WebElement district;
	
	@FindBy(xpath="//*[@id=\"locality\"]")
	WebElement locality;
	
	@FindBy(xpath="//*[@id=\"pinCode\"]")
	WebElement pincode;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement next;
	
	
	@FindBy(xpath="//input[@id='fileUpload']")
	WebElement fileupload;
	
	@FindBy(xpath="//*[@id=\"ImageForm\"]/div/input[2]")
	WebElement uploadbutton;

	public KarshikaAddnewItem(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void addnewItem(String title1,String description1,String price1,String quantity1,String state1,String district1,String locality1,String pincode1 ) throws Exception
	{
		newitem.click();
		seedsandplants.click();
		agriplants.click();
		title.sendKeys(title1);
		description.sendKeys(description1);
		price.sendKeys(price1);
		quantity.sendKeys(quantity1);
		Select s=new Select(state);
		s.selectByVisibleText(state1);
		Select t=new Select(district);
		Thread.sleep(2000);
		t.selectByVisibleText(district1);
		locality.sendKeys(locality1);
		pincode.sendKeys(pincode1,Keys.ENTER);	
	}
		public void uploadfoto() 
		{
			fileupload.sendKeys("C:\\Users\\farsa\\Desktop\\Spinach.webp");
		driver.switchTo().alert().accept();
		     uploadbutton.click();
	}
}
