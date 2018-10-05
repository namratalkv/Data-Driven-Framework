package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import POM.Loginpage;
import POM.Logoutpage;
import POM.Womenpage;
import generic.Auto_constant;
import generic.Excel;

public class Women implements Auto_constant
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
    	
    	WebElement wo = driver.findElement(By.xpath("//a[.=\"Women\"]"));
    	Actions a=new Actions(driver);
        a.moveToElement(wo).perform();
        Thread.sleep(2000);
    	Womenpage wo1=new Womenpage(driver);
    	wo1.Womenlink();
    	Thread.sleep(2000);
    	wo1.Bagslink();
    	
    	WebElement ele1 = driver.findElement(By.xpath("//p[.=\"namratalkv\"]"));
        Actions a1=new Actions(driver);
        a1.moveToElement(ele1).perform();
        Thread.sleep(2000);
    	Logoutpage log=new Logoutpage(driver);
    	log.logoutbutton();
    	driver.close();
    }
  }