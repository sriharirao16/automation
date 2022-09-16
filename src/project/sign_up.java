package project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sign_up {
	@Test

	 public  void signup() throws InterruptedException {
	        // TODO Auto-generated method stub
	         System.setProperty("webdriver.chrome.driver","C:/Users/srihari.rao/Downloads/chromedriver_win32/chromedriver.exe");
	         WebDriver driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         
	       //  driver.get("https://mobileworld.azurewebsites.net/");
	         Landingpage landingpage2 = new Landingpage(driver);
	         landingpage2.goTo();
	         Thread.sleep(1000);
	         landingpage2.signupapplication("srihari","Rao","sri@gmail.com","sri123f" ,"01/01/1999","8989674534","Welcome to Qualitest");
	       
	 }
}
