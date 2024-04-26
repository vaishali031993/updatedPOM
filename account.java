package SeleniumExcelR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class account {


WebDriver driver ;
public account (WebDriver idriver)
{
	driver = idriver;
	PageFactory.initElements(driver,this);
}

@FindBy(xpath = "//div[@class='panel header']/child::ul/li[3]") WebElement createButton;
@FindBy(name = "firstname") WebElement nam;
@FindBy(id ="lastname") WebElement lnam;
@FindBy(id="email_address") WebElement emai;
@FindBy(id="password")WebElement pass;
@FindBy(id="password-confirmation") WebElement Cpass;

@FindBy(xpath = "//button[@class='action submit primary']")WebElement buttonclick;

public void launchUrl()
{
	driver.get("https://magento.softwaretestingboard.com/");
}
public void clickonButton()
{

	createButton.click();
}
public void CAccount()
{
	nam.sendKeys("vaishali");	
	lnam.sendKeys("ambekar");
	emai.sendKeys("ambekarvaishali62@gmail.com");
	pass.sendKeys("ambekar@789");
	
	Cpass.sendKeys("ambekar@789");
	buttonclick.click();
	
}


public void InvalidMail()
{
	nam.sendKeys("vaishali12");	
	lnam.sendKeys("ambekar");
	emai.sendKeys("ambekarvaishlai@03");
	pass.sendKeys("ambkear@789");
	
	Cpass.sendKeys("ambekar@3");
	buttonclick.click();
}

public void Diffpasswrd()
{
	nam.sendKeys("vaishali");	
	lnam.sendKeys("ambekar");
	emai.sendKeys("vaishaliambekar62@gmail.com");
	pass.sendKeys("malhar@23");
	
	Cpass.sendKeys("malhar@23");
	buttonclick.click();
}
public void lessStrongPass()
{
	nam.sendKeys("vaishali");	
	lnam.sendKeys("ambekar");
	emai.sendKeys("ambekarvaishali@gmail.com");
	pass.sendKeys("ambekar");
	
	Cpass.sendKeys("ambekar");
	buttonclick.click();
}

public WebElement Accbutton()
{
	nam.sendKeys("vaishali");	
	lnam.sendKeys("ambekar");
	emai.sendKeys("vaishaliambekar62@gmail.com");
	pass.sendKeys("vaishali789");
	
	Cpass.sendKeys("vaishali789");
	return driver.findElement(By.linkText("Create an Account"));
	
}
public void AllBlank()
{
	nam.sendKeys();	
	lnam.sendKeys();
	emai.sendKeys();
	pass.sendKeys();
	
	Cpass.sendKeys();
	buttonclick.click();
}





}
