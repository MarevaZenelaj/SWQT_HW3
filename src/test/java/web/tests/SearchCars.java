package web.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import web.pages.CarPage;
import web.pages.MyAccountPage;

public class SearchCars
{
    @Test
    public void searchCarsBasedOnYearAndPrice() throws Exception
    {
        // Optional, if not specified, WebDriver will search your path for chromedriver.
        System.setProperty("webdriver.chrome.driver", "D:\\opt\\chromedriver.exe");

        // initialize webdriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sahibinden.com");
        Thread.sleep(500);

        //create carPage
        CarPage carPage = new CarPage(driver);

        carPage.searchTextInput.sendKeys("araba");
        Thread.sleep(500);

        carPage.searchTextButton.click();
        Thread.sleep(500);

        carPage.advancedSorting.click();
        Thread.sleep(500);

        carPage.sortByDescending.click();
        Thread.sleep(500);

        carPage.searchTextInput.sendKeys(" boyasız");
        Thread.sleep(500);

        carPage.searchTextButton.click();
        Thread.sleep(500);

        carPage.advancedSorting.click();
        Thread.sleep(500);

        carPage.sortByDescending.click();
        Thread.sleep(500);

        carPage.firstRow.click();
        Thread.sleep(500);

        driver.navigate().back();

        carPage.secondRow.click();
        Thread.sleep(500);
    }
}
