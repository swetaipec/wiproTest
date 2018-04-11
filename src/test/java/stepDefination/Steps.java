package stepDefination;
//import java.util.logging.Logger;

import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;




//import java.util.logging.LogManager;
//import java.util.logging.Logger;



import org.apache.log4j.Logger;
//import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.logging.Logs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		
import utility.ReadElememtFromObjectRepo;

//import org.apache.logging.log4j.LogManager;
 
public class Steps  
{
	
	Logger log = Logger.getLogger("devpinoylogger");
	WebDriver driver;
	String link;
	String emailid;
    String Create_account_btn;
    String errorpath;
    String menu,submenus,summer_menu;

	@Given("^Open the Firefox and launch the application$")				
	public void open_the_Firefox_and_launch_the_application() throws Throwable							
	{		

		ReadElememtFromObjectRepo r=new ReadElememtFromObjectRepo();
		Properties p=r.getobjectrepository();
		link=p.getProperty("signIn");
		emailid=p.getProperty("email_field");
		Create_account_btn=p.getProperty("createbutton");
		errorpath=p.getProperty("errorId");
		menu=p.getProperty("megamenu");
		submenus=p.getProperty("submenu");
		summer_menu=p.getProperty("summer_submenu");
		log.debug("<<<Start from here >>>>");
		
		
		//start from here 
		
		/*
		String BROWSER=System.getProperty("browser");
		 if(BROWSER.equalsIgnoreCase("Firefox"))
		    {
			 c
		    }
		   		    else if(BROWSER.equalsIgnoreCase("Chrome"))
		    {
		    System.setProperty("webdriver.chrome.driver",  "C://Users//SK//latest selenium//chromedriver.exe");
		    driver=new ChromeDriver();
		
		
		// endd here
		
		
		
		*/
	
		System.setProperty("webdriver.gecko.driver", "C://Users//SK//latest selenium//geckodriver.exe");
		driver=new FirefoxDriver();	
		Thread.sleep(50);
		driver.get("http://automationpractice.com/index.php");	
		    }

		

	@When("^Enter the Email address$")					
	public void enter_the_Email_address() throws Throwable 							
	{		
		Thread.sleep(50);

          log.debug("when start from here ");
		driver.findElement(By.partialLinkText(link)).click();	
		driver.findElement(By.id(emailid)).click();
		driver.findElement(By.id(emailid)).sendKeys("Sweta.ipec@gmail.com");

	}	
	
	@When("^Enter the invalidEmail address$")					
	public void enter_the_invalidEmail_address() throws Throwable 							
	{		
		Thread.sleep(100);


		driver.findElement(By.partialLinkText(link)).click();	
		driver.findElement(By.id(emailid)).click();
		driver.findElement(By.id(emailid)).sendKeys("Sweta.ipec");

	}	
	
	@When("^megamenu Dresses Clicked$")					
	public void megamenu() throws Throwable 							
	{		
		Thread.sleep(50);


		driver.findElement(By.xpath(menu)).click();
		
		
	}	
	

	@Then("^click on create myaccount button$")					
	public void Create_my_account() throws Throwable 							
	{    		
		driver.findElement(By.id(Create_account_btn)).submit();
						
}
	@Then("^verify user is  logged in$")
	public void verify_user_loggedIn()
	{
	if(	driver.getPageSource().contains("YOUR PERSONAL INFORMATION"))
	{
		System.out.println("user on right track");
	}
	else 
	{
		System.out.println("not on right track");
	}
	}
	
	
	@Then("^check system throw an error$")					
	public void check_error() throws Throwable 							
	{    		
		Thread.sleep(50);
		String actualerror=driver.findElement(By.id(errorpath)).getAttribute("innerhtml");
		
		Assert.assertEquals("Invalid email address.", actualerror);
						
}
	
	@Then("^click on submenu summer menu$")					
	public void click_on_submenu() throws Throwable 							
	{    		
		java.util.List<WebElement> submenu=driver.findElements(By.xpath(submenus));
		 for (WebElement element : submenu) 
		 {
			 
			   System.out.println(element.getText());
			  
			  }
		 //click on summer menu
		 driver.findElement(By.xpath(summer_menu)).click();
	
						
}
	
	@Then("^sort by Price lowest first$")					
	public void short_by_price() throws Throwable 							
	{    		

System.out.println("less timing- no further scenario");
	
						
}

}