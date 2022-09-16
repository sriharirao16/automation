import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage {

	 WebDriver driver;
	 
	 public Landingpage(WebDriver driver)
	    {
	        this.driver=driver;
	        PageFactory.initElements(driver,this);
	    }
	    //WebElement myName = driver.findElement(By.id("myName"));
	 
	 //signup
	 
	 @FindBy(xpath= "//button[@type='submit']")
	 WebElement signin;
//	 
      @FindBy(css= "a[href='signup.html']")
      WebElement signup;
	 
	 @FindBy(id =  "myName")
	 WebElement firstname;
	 
	 @FindBy(xpath = "//input[@placeholder='Last Name']")
	 WebElement lastname;
	 
	 @FindBy(xpath ="//input[@placeholder='Enter Email']")
	 WebElement email;
	 
	 @FindBy(xpath ="//input[@placeholder='Password']") 
	 WebElement signuppassword;
	 
	 @FindBy(xpath ="//input[@type='date']")
	 WebElement date;
	 
	 @FindBy(xpath ="//div[@class='col-md-2']//input[@name='gender']")
	 WebElement gender;
	 
	 @FindBy(xpath ="//input[@placeholder='91XXXXXXXXXX']")
	 WebElement mobile;
	 
	 @FindBy(css= " textarea[placeholder='Short Bio'] ")
	 WebElement shortbio;
	 
	 @FindBy(xpath= "//button[@type='submit']")
	 WebElement register;
	
	 
	 //Sign In
	 
	 @FindBy(id="username")
	 WebElement username;
	 
	 @FindBy(xpath="//input[@id='password']")
	 WebElement signinpassword;
	 
	 @FindBy(xpath="//a[@type='submit']")
	 WebElement submit;
	 
	 
//	 //Contact us 
//	 @FindBy(xpath ="//body/nav[@id='navbar']/div[@id='navbarSupportedContent']/ul[@class='navbar-nav mx-auto']/li[4]/a[1]")
//	 WebElement support;
//	 
//	 @FindBy(xpath = "//a[@class='dropdown-item'][normalize-space()='Contact Us']")
//	 WebElement contactus;
//	 
//	 @FindBy(xpath = "//input[@placeholder='Username']")
//	 WebElement cusername;
//	 
//	 @FindBy(xpath = "//input[@placeholder='Email']")
//	 WebElement cemail;
//	 
//	 @FindBy(xpath = "//input[@placeholder='Phone']")
//	 WebElement cphone ;
//	 
//	 @FindBy( xpath = "//textarea[@placeholder='Message'] ")
//	 WebElement cmessage ;
//	 
//	 @FindBy(xpath = "//input[@value='Send']" )
//	 WebElement send ;
	 
	 
	 
	 
	 
	//action
	    public void goTo()
	    {
	        driver.get("https://mobileworld.banyanpro.com/");
	    }
	    
	    
	 public void signupapplication(String fname,String lname,String mail,String uppwd,String dob,String phone,String bio) throws InterruptedException
	    {
	       signin.click();
	       Thread.sleep(1000);
	        signup.click();
	        Thread.sleep(1000);
	        firstname.sendKeys(fname);
	        Thread.sleep(1000);
	        lastname.sendKeys(lname);
	        Thread.sleep(1000);
	        email.sendKeys(mail);
	        Thread.sleep(1000);
	        signuppassword.sendKeys(uppwd);
	        Thread.sleep(1000);
	        date.sendKeys(dob);
	        Thread.sleep(1000);
	        gender.click();
	        Thread.sleep(1000);
	        mobile.sendKeys(phone);
	        Thread.sleep(1000);
	        shortbio.sendKeys(bio);
	        Thread.sleep(1000);
	        register.click();
	    }
	 
	 
	 public void signinapplication(String name, String pwd) throws InterruptedException
	    {
	        signin.click();
	        username.sendKeys(name);
	        Thread.sleep(1000);
	        signinpassword.sendKeys(pwd);
	        Thread.sleep(1000);
	        submit.click();
	    }
	 
	 
//	  public void contactUspage(String cuname,String cmail,String cphn,String cmsg)
//	    {
//	        support.click();
//	        contactus.click();
//	        driver.manage().window().maximize();
//	        cusername.sendKeys(cuname);
//	        cemail.sendKeys(cmail);
//	        cphone.sendKeys(cphn);
//	        cmessage.sendKeys(cmsg);
//	        send.click();
//	    }
//	 
	 
}
