package scripts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM.Blogpage;
import POM.Loginpage;
import generic.Auto_constant;
import generic.Excel;
public class Blog implements Auto_constant
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
    	
    	Blogpage b=new Blogpage(driver);
    	b.Blogpg();
    	Thread.sleep(2000);
    	driver.close();
    }
}