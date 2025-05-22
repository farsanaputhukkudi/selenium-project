package karshikapagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KarshikaLogin {
WebDriver driver;
@FindBy(xpath="//input[@id='username']")
WebElement email;

@FindBy(xpath="//*[@id=\"password\"]")
WebElement password;

@FindBy(xpath="//*[@id=\"app\"]/main/div/div/div/div[1]/div[2]/form/div[4]/div/button")
WebElement login;

public KarshikaLogin(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
public void login(String mailid,String passwrd)
{
	email.clear();
	email.sendKeys(mailid);
	password.clear();
	password.sendKeys(passwrd);
	
}
public void click()
{
	login.click();
}

}
