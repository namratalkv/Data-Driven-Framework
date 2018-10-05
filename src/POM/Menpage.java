package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Menpage
{
	/*@FindBy(xpath="//a[.=\"Men\"]")
	private WebElement menlnk;*/
	
	@FindBy(xpath="(//span[.=\"Footwear\"])[2]")
	private WebElement ftwearlnk;
	
	public Menpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);		
	}
	//utilization
	/*public void Menlink()
	{
		menlnk.click();		
	}*/
	public void Footwearlink()
	{
		ftwearlnk.click();		
	}

}
