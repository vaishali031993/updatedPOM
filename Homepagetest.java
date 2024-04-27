

package Updatedproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Homepagetest {
	 private WebDriver driver;
	    
	    // Locators
	    private By homeLink = By.linkText("Home");
	    private By productsLink = By.linkText("Products");
	    private By categoriesLink = By.linkText("Categories");
	    private By searchInput = By.id("search");
	    private By searchButton = By.xpath("//button[@class='action search']");
	    
	    // Constructor
	    public Homepagetest(WebDriver driver) {
	        this.driver = driver;
	    }
	    
	    // Methods to interact with elements
	    public WebElement getHomeLink() {
	        return driver.findElement(homeLink);
	    }
	    
	    public WebElement getProductsLink() {
	        return driver.findElement(productsLink);
	    }
	    
	    public WebElement getCategoriesLink() {
	        return driver.findElement(categoriesLink);
	    }
	    
	    public WebElement getSearchInput() {
	        return driver.findElement(searchInput);
	    }
	    
	    public WebElement getSearchButton() {
	        return driver.findElement(searchButton);
	    }
	}

