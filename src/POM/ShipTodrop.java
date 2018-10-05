package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ShipTodrop 
{
	@FindBy(xpath="//p[.=\"USA\"]")
	private WebElement shipTodropdown;
	
	public ShipTodrop(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ShipTobtn()
	{
		shipTodropdown.click();
	}
	
}