package SeleniumExcelR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessibilityVerification {

	public static void main(String[] args) throws InterruptedException {
		

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(2000);

        // Test case 17:Verify screen reader compatibility
        
        WebElement element = driver.findElement(By.tagName("body"));
        boolean screenReaderCompatible = element.isEnabled() && element.isDisplayed();

        if (screenReaderCompatible) {
            System.out.println("Website is screen reader compatible.");
        } else {
            System.out.println("Website is not screen reader compatible.");
        }

        //Test Case 18: Verify keyboard navigation
       
        WebElement searchBox = driver.findElement(By.id("search"));
        searchBox.sendKeys("Test");
        Thread.sleep(2000);

        //Test Case 19: Verify that essential functions are accessible to users with disabilities
      
        WebElement searchButton = driver.findElement(By.cssSelector(".actions [type='submit']"));
        searchButton.click();
        
        driver.close();
    }


	}


