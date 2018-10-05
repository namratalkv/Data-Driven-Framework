package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Blogpage
{
	@FindBy(xpath="//a[.='Blog']")
	private WebElement Blogpagelnk;
	
	/*@FindBy(xpath="(//a[.='Media'])[1]")
	private WebElement Medialnk;*/
	public Blogpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);		
	}
	
	public void Blogpg() 
	{
		Blogpagelnk.click();		
	}
	/*public void MediaLink() throws InterruptedException 
	{
		Medialnk.click();
	}*/
}