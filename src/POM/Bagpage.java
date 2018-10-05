package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bagpage 
{
		
	@FindBy(xpath="//a[.='ADD ITEMS FROM WISHLIST']")
	private WebElement AddFromWishlistBtn;
	public Bagpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);		
	}
	
	public void AddFromWishlist() 
	{
		AddFromWishlistBtn.click();		
	}
}
