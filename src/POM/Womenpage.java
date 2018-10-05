package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Womenpage
{
	@FindBy(xpath="//a[.=\"Women\"]")
	private WebElement Womenlnk;
	
	@FindBy(xpath="	//span[.=\"Bags\"]")
	private WebElement Bagslnk;
	
	public Womenpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);		
	}
	//utilization
	public void Womenlink()
	{
		Womenlnk.click();		
	}
	public void Bagslink()
	{
		Bagslnk.click();		
	}
}