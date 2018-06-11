package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample {
	public WebDriver driver;
	 @BeforeTest
	  public void LaunchBrowser() throws InterruptedException {
     System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\lohitha.perni\\Desktop//chromedriver.exe");

	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().window().maximize();
					Thread.sleep(3000);
	  }
  
  @Test(priority=1)
  public void booking() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("pavan varri");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Indu@1916");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(2000);
		Select depart = new Select(driver.findElement(By.name("fromPort")));
		depart.selectByVisibleText("Frankfurt");
		Select On=new Select(driver.findElement(By.name("fromMonth")));
		On.selectByVisibleText("May");
		Select fromDay=new Select(driver.findElement(By.name("fromDay")));
		fromDay.selectByIndex(21);
		Select returning=new Select(driver.findElement(By.name("toMonth")));
		returning.selectByVisibleText("May");
		Select toDay=new Select(driver.findElement(By.name("toDay")));
		toDay.selectByIndex(25);
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@name='inFlight'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		Select creditCard=new Select(driver.findElement(By.name("creditCard")));
		creditCard.selectByVisibleText("Visa");
		driver.findElement(By.name("creditnumber")).sendKeys("2345678901234567");
		Select expDate=new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		expDate.selectByIndex(4);
		Select expYear=new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		expYear.selectByIndex(10);
		driver.findElement(By.name("cc_frst_name")).sendKeys("abc");
		driver.findElement(By.name("cc_last_name")).sendKeys("xyz");
		driver.findElement(By.name("buyFlights")).click();
		driver.findElement(By.xpath("//img[@src='/images/forms/backtoflights.gif']")).click();
  }
		
		//Flight booking for different destination
		
	@Test(priority=2)
	
		public void booking1() throws InterruptedException
	{
	    Select depart = new Select(driver.findElement(By.name("fromPort")));
		depart.selectByVisibleText("London");
		Select On=new Select(driver.findElement(By.name("fromMonth")));
		On.selectByVisibleText("June");
		Select fromDay=new Select(driver.findElement(By.name("fromDay")));
		fromDay.selectByIndex(23);
		Select toDay=new Select(driver.findElement(By.name("toDay")));
		toDay.selectByIndex(29);
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//input[@name='inFlight'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		Select creditCard=new Select(driver.findElement(By.name("creditCard")));
		creditCard.selectByVisibleText("Visa");
		driver.findElement(By.name("creditnumber")).sendKeys("2345678901234567");
		Select expDate=new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		expDate.selectByIndex(4);
		Select expYear=new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		expYear.selectByIndex(10);
		driver.findElement(By.name("cc_frst_name")).sendKeys("abc");
		driver.findElement(By.name("cc_last_name")).sendKeys("xyz");
		driver.findElement(By.name("buyFlights")).click();
		
		driver.findElement(By.xpath("//img[@src='/images/forms/home.gif']")).click();
		Thread.sleep(2000);
		
		}
		

		
		

  @AfterTest
  public void closeBrowser() {
	  driver.close();
		
  }

}
