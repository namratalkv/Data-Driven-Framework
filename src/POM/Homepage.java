package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Homepage 
{
	@FindBy(id="searchTag")
	private WebElement searchtxtbox;

	@FindBy(xpath="//i[.=\"search\"]")
	private WebElement search;
	
	@FindBy(xpath="//a[.=\"Home & Living\"]")                        
	private WebElement homeDecor;
	
	@FindBy(xpath="//span[.=\"Home\"]")
	private WebElement homebutton;
	
	@FindBy(xpath="//p[.=\"Track order\"]")
	private WebElement trackOrderbtn; 
	
	@FindBy(xpath="//p[.='bag']")
	private WebElement Bagbutton;
	
	@FindBy(xpath="//a[.=\"Download App\"]")
	private WebElement downloadAppLnk;
	
	//initialization
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);		
	}
	//utilization
	public void search(String prod)
	{
		searchtxtbox.sendKeys(prod);
	}
	public void searchbutton()
	{
		search.click();
	}
    public void HomeDecor()
	{
		homeDecor.click();
	}
    public void Home()
    {
      	homebutton.click();
    }	
    public void Bag()
    {                         
    	Bagbutton.click();
    }
    public void TrackorderButton()
    {                         
        trackOrderbtn.click();
    }
    public void DownloadAppLink()
    {                         
      	downloadAppLnk.click();
    }
}