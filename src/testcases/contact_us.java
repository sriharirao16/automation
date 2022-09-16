package testcases;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class contact_us {
//
//
//
//		   public static void main(String[] args) throws InterruptedException {
//		        // TODO Auto-generated method stub
//		        System.setProperty("webdriver.chrome.driver","C:/Users/srihari.rao/Downloads/chromedriver_win32/chromedriver.exe");
//		         WebDriver driver = new ChromeDriver();
//		         
//		         Landingpage landingpage3 = new Landingpage(driver);
//		         landingpage3.goTo();
//		         driver.manage().window().maximize();
//		         landingpage3.contactUspage("Srihari","sri@gmail.com","8978563412","I am proud to be a qualitester");
//		         Thread.sleep(1000);
//		        
//		    }
//		}










import java.util.Set;



import javax.swing.text.html.HTMLDocument.Iterator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class contact_us {
    static {
        System.setProperty("webdriver.chrome.driver","C:/Users/srihari.rao/Downloads/chromedriver_win32/chromedriver.exe");
    }
    WebDriver driver;
    
    @Test(priority = 1)
    public void launchBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mobileworld.banyanpro.com/");
    }
    @Test(priority = 2)
    public void clickContactUs() throws InterruptedException {
        driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).click();
        Thread.sleep(2000);
        Set<String> id = driver.getWindowHandles();
        java.util.Iterator<String> it = id.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        driver.manage().window().maximize();
    }
    @Test(priority = 2)
    public void enterName() throws InterruptedException {
        driver.findElement(By.name("name")).sendKeys("srihari");
    }
    @Test(priority = 3)
    public void enterMail() throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys("srihari@gmail.com");
    }
    @Test(priority = 4)
    public void enterPhoneNumber() throws InterruptedException {
        driver.findElement(By.name("phone")).sendKeys("9996913133");
    }
    @Test(priority = 5)
    public void enterMessage() throws InterruptedException {
        driver.findElement(By.name("message")).sendKeys("i am proud to be qualitester");
        Thread.sleep(5000);
    }
    @Test(priority = 6)
    public void clickOnSend() throws InterruptedException {
        driver.findElement(By.className("btn")).click();
    }
}






//package testcases;
//
//
//
//import java.util.Set;
//
//
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
//
//
//
//public class contact_us {
//    @Test
//    void signUp() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","C:\\Users\\sanchitha.rao\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://mobileworld.banyanpro.com/");
//        driver.findElement(By.xpath("//body/nav[@id='navbar']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mx-auto']/li[4]/a[1]")).click();
//        driver.findElement(By.cssSelector(".dropdown-item[href='#']")).click();
//        //driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Virat");
//        String parenthandle = driver.getWindowHandle();
//        Set<String> handles = driver.getWindowHandles();
//        for(String handle : handles) {
//            if(!handle.equals(parenthandle)) {
//                driver.switchTo().window(handle);
//                driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Virat");
//                driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("virat@gmail.com");
//                driver.findElement(By.cssSelector("input[placeholder='Phone']")).sendKeys("9876543210");
//                driver.findElement(By.cssSelector("textarea[placeholder='Message']")).sendKeys("asdgj");
//                Thread.sleep(2000);
//                driver.findElement(By.cssSelector("input[type='submit']")).click();
//                driver.quit();
//            }
//        }
//    }
//}
//    