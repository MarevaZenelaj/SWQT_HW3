package web.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import web.pages.CarPage;
import web.pages.MyAccountPage;

public class SearchCars
{

    WebDriver driver;
    CarPage carPage;

    @Test
    public void searchCarsBasedOnYearAndPrice() throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "D:\\opt\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.sahibinden.com");
        Thread.sleep(500);
        carPage = new CarPage(driver);

        /*
         * Search by 'araba' text
         */
        addFilterByText("araba");

        sortByPrice();

        /*
         * Filter results for price between 40.000-50.000
         */
        priceFilter("40000", "50000");

        /*
         * Add 'boyasız' filter too
         */
        addFilterByText(" boyasız");
        sortByPrice();
//        priceFilter("40000", "50000");

        carPage.firstRow.click();
        Thread.sleep(500);

        driver.navigate().back();

        carPage.secondRow.click();
        Thread.sleep(500);
    }

    private void sortByPrice() throws InterruptedException
    {
        this.carPage.advancedSorting.click();
        Thread.sleep(500);
        this.carPage.sortByDescending.click();
        Thread.sleep(500);
    }

    private void addFilterByText(String t) throws InterruptedException
    {
        carPage.searchTextInput.sendKeys(t);
        Thread.sleep(500);
        carPage.searchTextButton.click();
        Thread.sleep(500);
    }

    private void priceFilter(String first, String second) throws InterruptedException
    {
        carPage.priceMinInput.sendKeys(first);
        Thread.sleep(500);
        carPage.priceMaxInput.sendKeys(second);
        Thread.sleep(500);
        carPage.advancedSearchButtonForPrice.click();
        Thread.sleep(500);
    }
}
