package SeleniumExcelR;

public class checkout {

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



	public Checkout(SearchContext driver) {
		PageFactory.initElements(driver,this );

	}


	ProductDetailsPage PD;
	Actions action;
	WebDriverWait wait;

	@FindBy(xpath="//button[@data-role='proceed-to-checkout']")
	private WebElement ProceedToCheckOutBtn;

	@FindBy(id="customer-email")
	private WebElement EmailAdd;

	@FindBy(id="customer-password")
	private WebElement Password;

	@FindBy(xpath="//button[@data-action='checkout-method-login']")
	private WebElement loginBtn;

	@FindBy(xpath="//*[@id='checkout-step-shipping']/div[1]/div/div/div")
	private WebElement ShippingAdd;

	@FindBy(xpath="//button[@data-role='opc-continue']")
	private WebElement NextBtn;

	@FindBy(xpath="//input[@id='billing-address-same-as-shipping-checkmo']")
	private WebElement BillingShippingAddCheckBox;

	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement placeOrderBtn;

	@FindBy(xpath ="//span[text()='Thank you for!']")
	private WebElement ThanksForPurchase;


	
	@FindBy(xpath = "//div[@data-role='loader']/div/img")
	private WebElement loader;

	public void LoginWhileCheckout()  {
		PD = new ProductDetailsPage();
		PD.AddToCartOnProdDetails();

		ProceedToCheckOutBtn.click();


		utils.waitForElementPresent(driver, EmailAdd, Duration.ofSeconds(20));
		EmailAdd.sendKeys("Ramdas12@gmail.com");
		utils.waitForElementPresent(driver, Password, Duration.ofSeconds(20));
		Password.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		utils.waitForElementPresent(driver,ShippingAdd , Duration.ofSeconds(20));
		System.out.println("hh");
		Assert.assertTrue(ShippingAdd.isEnabled());
		NextBtn.click();
		Assert.assertTrue(BillingShippingAddCheckBox.isSelected());
		PlaceOrder();

	}

	public void PlaceOrder() {

		wait = new WebDriverWait(driver, Duration.ofSeconds(3000));

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);",placeOrderBtn);
				
		wait.until(ExpectedConditions.invisibilityOf(loader));
				
				placeOrderBtn.click();
				
	}


	

		
}

}
