package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Loginpage 
{
	//declaration
			@FindBy(xpath="//p[.='Login']")
			private WebElement login;
		
			@FindBy(id="user_email")
			private WebElement emailid;

			@FindBy(id="user_password")
			private WebElement password;
			
			@FindBy(xpath="//button[.='Login']")                               
			private WebElement loginbtn;
			
			//initialization
			public Loginpage(WebDriver driver)
			{
				PageFactory.initElements(driver,this);		
			}
			//utilization
			public void Loginbutton()
			{
				login.click();		
			}
			public void Emailtxtbox(String email)
			{
				emailid.sendKeys(email);
			}
			public void Passwordtxtbox(String pwd)
			{
				password.sendKeys(pwd);
			}
			public void Loginbtn()
			{
				loginbtn.click();                   
			}


}
