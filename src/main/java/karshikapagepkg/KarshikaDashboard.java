package karshikapagepkg;

import java.net.HttpURLConnection;
import java.net.URI;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class KarshikaDashboard {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[1]/nav/div/a[3]")
	WebElement dashboardclick;
	
	@FindBy(xpath="//*[@id=\"dataTable_filter\"]/label/input")
	WebElement searchbar;
	
	@FindBy(xpath="//*[@id=\"accordionSidebar\"]/li[4]/a/span")
	WebElement showallitems;
	
	
	@FindBy(xpath="//*[@id=\"dataTable_length\"]/label/select")
	WebElement show;
	
	@FindBy(xpath="//*[@id=\"content\"]/nav/form/div/input")
	WebElement topsearchbar;
	

	@FindBy(xpath="//*[@id=\"content\"]/nav/form/div/div/button/i")
	WebElement searchclick;
	

	@FindBy(xpath="//*[@id=\"userDropdown\"]/img")
	WebElement profileicon;
	
	@FindBy(xpath="//*[@id=\"content\"]/nav/ul/li[2]/div/a[1]")
	WebElement profile;
	
	@FindBy(xpath="//*[@id=\"btnEdits\"]")
	WebElement edit;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement nameedit;
	
	@FindBy(xpath="//*[@id=\"mobile\"]")
	WebElement mobedit;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement mailedit;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div/form/input[5]")
	WebElement update;
	
	@FindBy(xpath="//*[@id=\"userDropdown\"]/img")
	WebElement profile2;
	
	@FindBy(xpath="//*[@id=\"content\"]/nav/ul/li[2]/div/a[2]")
	WebElement resetpaswrd;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement entermail;
	
	@FindBy(xpath="//*[@id=\"app\"]/main/div/div/div/div/div[2]/form/div[2]/div/button")
	WebElement submitbutn;
	
	
	@FindBy(xpath="//*[@id=\"accordionSidebar\"]/li[5]/a/span")
	WebElement enquiries;
	
	@FindBy(xpath="//*[@id=\"accordionSidebar\"]/li[6]/a/span")
	WebElement helpcentre;
	
	@FindBy(xpath="//*[@id=\"navbarDropdown\"]")
	WebElement nameicon;
	
	@FindBy(xpath="//*[@id=\"navbarSupportedContent\"]/ul[2]/li/div/a")
	WebElement logout;
	
	public KarshikaDashboard(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void dashboard(String search,String status1,String show1,String search2)
	{
		dashboardclick.click();
		searchbar.sendKeys(search,Keys.ENTER);
		Select t=new Select(show);
		t.selectByVisibleText(show1);
		topsearchbar.sendKeys(search2);
		searchclick.click();
	}
	public void brokenlinkcheck()
	{
	
	try {
	
		enquiries.click();
		String s=enquiries.getDomAttribute("href");
	      URI u=new URI(s);
          HttpURLConnection con= (HttpURLConnection)u.toURL().openConnection();
        		  if(con.getResponseCode()==200)
        		  {
        			  System.out.println("successfull: code is 200    "+s);
        		  }
        		  else if(con.getResponseCode()==404)
        		  {
        			  System.out.println("broken link: code is 404     "+s);
	
        		  }
        		  else
        		  {
        			  System.out.println("other response code     "+s);
	
        		  }}catch(Exception e)
	{
        				System.out.println("message is:   "+e.getMessage());
        			}}
	public void brokenlinkcheck2()
	{
		try {
			helpcentre.click();
		String t=helpcentre.getDomAttribute("href");
	     URI u=new URI(t);
         HttpURLConnection con= (HttpURLConnection)u.toURL().openConnection();
       		  if(con.getResponseCode()==200)
       		  {
       			  System.out.println("successfull: code is 200    "+t);
       		  }
       		  else if(con.getResponseCode()==404)
       		  {
       			  System.out.println("broken link: code is 404     "+t);
	
       		  }
       		  else
       		  {
       			  System.out.println("other response code     "+t);
	
       		  }}catch(Exception e)
	{
       				System.out.println("message is:   "+e.getMessage());
       			}
	}
	public void profile(String name2,String mob2,String email2,String mailforresetpswrd)
	{
		profileicon.click();
		profile.click();
		edit.click();
		nameedit.sendKeys(name2);
		mobedit.sendKeys(mob2);
		mailedit.sendKeys(email2);
		update.click();
		profile2.click();
		resetpaswrd.click();
		entermail.sendKeys(mailforresetpswrd);
		submitbutn.click();
		driver.navigate().back();
		
	}
	
	
	public void logout()
	{
		nameicon.click();
		logout.click();
	}
	
}
