package Updatedproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addtocartfunctionality {

	WebDriver driver ;
	public  addtocartfunctionality(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//div[@class='panel header']")WebElement ClickonButtSign;

	@FindBy(className = "product-image-photo")WebElement FirstTb;
	@FindBy(id = "option-label-size-143-item-166")WebElement sized;
	@FindBy(id= "option-label-color-93-item-59")WebElement colour;
	@FindBy(id = "product-addtocart-button")WebElement AddButton;
	@FindBy(xpath = "//div[@class = 'minicart-wrapper']/child::a")WebElement cart;
	@FindBy(xpath = "//div[@class='actions']/child::div/child::button")WebElement Checkout;
	@FindBy(xpath = "//div[@class='panel header']") WebElement CreateButton;
	@FindBy(xpath = "//div[@class='panel header']")WebElement SigninButton;

	
	public void LinkURL() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(000);
	}
	public void CliconButoon()
	{
		ClickonButtSign.click();
	}
	public WebElement searchbuar()
	{
		return driver.findElement(By.id("search"));
	}
	public void ADDProducts()
	{
		FirstTb.click();
		sized.click();
		colour.click();
		AddButton.click();
	}
	public void signInFromAddCartPag()
	{
		FirstTb.click();
		sized.click();
		colour.click();
		AddButton.click();
		SigninButton.click();
		
		
	}
	public void CreateAccfromAddcart()
	{
		FirstTb.click();
		sized.click();
		colour.click();
		AddButton.click();
	
		CreateButton.click();
		
	}
	
	public void Cartdet()
	{
		cart.click();
		
	}
	public void check()
	{
		Checkout.click();
	}
	public WebElement CheckProduIspresent()
	{
	
		return driver.findElement(By.className("product-item-name"));
	}
	public WebElement itemDetails()
	{
		return driver.findElement(By.xpath("//div[@class='product-item-details']"));
	}
	
	
	
	
}
