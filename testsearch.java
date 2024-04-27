package SeleniumExcelR;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testsearch {

	private WebDriver driver;
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
    }

    @Test
    public void testValidSearchQuery() {
        String searchQuery = "kurta";
        homePage.searchProduct(searchQuery);
        assertTrue(searchResultsPage.areResultsDisplayed());
        assertTrue(searchResultsPage.areResultsRelevant(searchQuery));
    }

    @Test
    public void testSearchResultsDisplay() {
        String searchQuery = "dress";
        homePage.searchProduct(searchQuery);
        assertTrue(searchResultsPage.areResultsDisplayed());
    }

    @Test
    public void testAdvancedSearchOptions() {
        String searchQuery = "shoes";
        homePage.searchProduct(searchQuery);
        searchResultsPage.filterByPrice("500", "1000");
        assertTrue(searchResultsPage.areResultsFilteredByPrice("500", "1000"));
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
}
