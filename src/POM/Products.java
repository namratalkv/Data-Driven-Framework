package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products
{
	@FindBy(xpath="//img[@alt=\"Shyammc half sleeve floral printed rayon long dress for women's\"]")
	//@FindBy(xpath="//img[@data-reactid=\".1qy5x57ynde.2.0.0.0.0.1.2.0.2.1.0.7.0.0.0.$feed_item_2.0.2.0\"]")
	private WebElement product;
	@FindBy(xpath="//li[@data-reactid=\".1qy5x57ynde.2.0.0.0.2.1.1.1.0.3.2.0.0\"]")
	private WebElement addToBagbtn;
	
	public Products( WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void SelectProduct()
	{
		product.click();
	}
	public void AddToBag() 
	{
		addToBagbtn.click();		
	}
	
	
}