package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import POM.Homepage;
import POM.Loginpage;
import POM.Logoutpage;
import generic.Auto_constant;
import generic.Excel;
public class Home_Living implements Auto_constant
{
		static
		{
			System.setProperty(key,value);
		}
	    public static void main(String[] args) throws InterruptedException 
	    {
	    	String e=Excel.abc(excelpath,"Sheet1",1,0);
	    	String pwd=Excel.abc(excelpath,"Sheet1",1,1);
	    	String prod=Excel.abc(excelpath,"Sheet1",3,0);
	    		    		    	
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
	    	Thread.sleep(2000);
	    	    	  	
	    	Homepage h=new Homepage(driver);
	    	h.search(prod);
	    	Thread.sleep(3000);
	    	h.searchbutton();
	    	Thread.sleep(3000);
	    	h.HomeDecor(); 
	    	Thread.sleep(3000);
	    	h.Home();
	    	Thread.sleep(2000);
	    	
	    	WebElement ele1 = driver.findElement(By.xpath("//p[.=\"namratalkv\"]"));
	        Actions a1=new Actions(driver);
	        a1.moveToElement(ele1).perform();
	        
	    	Logoutpage log=new Logoutpage(driver);
	    	Thread.sleep(2000);
	    	log.logoutbutton();
	    	driver.close();	
		}
}