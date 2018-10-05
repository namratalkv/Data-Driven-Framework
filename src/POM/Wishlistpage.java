package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlistpage
{
	@FindBy(xpath="//p[.='Wishlist']")
	private WebElement Wishlistbutton;      
	public Wishlistpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);		
	}
	public void Wishlist()
	{                         
		Wishlistbutton.click();
	}


}