package karshikapagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KarshikaRegistration {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"app\"]/main/div/div/div/div[2]/div/a/button")
	WebElement register;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement emailid;
	
	@FindBy(xpath="//*[@id=\"mobile\"]")
	WebElement mobile;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement paswrd;
	
	@FindBy(xpath="//*[@id=\"password-confirm\"]")
	WebElement cnfrmpaswrd;
	
	@FindBy(xpath="//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[6]/div/button")
	WebElement button;
	public KarshikaRegistration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void registerclick()
	{
		register.click();
	}
	public void setvalues(String name1,String mail1,String mob,String paswrd1,String cnfrmpaswrd1)
	{
		name.sendKeys(name1);
		emailid.sendKeys(mail1);
		mobile.sendKeys(mob);
		paswrd.sendKeys(paswrd1);
		cnfrmpaswrd.sendKeys(cnfrmpaswrd1);
		
	}
	public void register()
	{
		button.click();
	}
}
