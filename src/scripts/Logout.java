package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.Loginpage;
import POM.Logoutpage;
import generic.Auto_constant;
import generic.Excel;

public class Logout implements Auto_constant
{
	static
	{
		System.setProperty(key,value);
	}
    public static void main(String[] args) throws InterruptedException 
    {
    	String e=Excel.abc(excelpath,"Sheet1",1,0);
    	String pwd=Excel.abc(excelpath,"Sheet1",1,1);
    		    		    	
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://www.voonik.com");
    	Loginpage l=new Loginpage(driver);
    	l.Loginbutton();
    	Thread.sleep(3000);
    	l.Emailtxtbox(e);
    	Thread.sleep(3000);
    	l.Passwordtxtbox(pwd);
    	Thread.sleep(3000);
    	l.Loginbtn();
    	Thread.sleep(3000);
    	
	WebElement ele1 = driver.findElement(By.xpath("//p[.=\"namratalkv\"]"));
    Actions a1=new Actions(driver);
    a1.moveToElement(ele1).perform();
    Thread.sleep(2000);
	Logoutpage log=new Logoutpage(driver);
	log.logoutbutton();
	driver.close();
     }
}