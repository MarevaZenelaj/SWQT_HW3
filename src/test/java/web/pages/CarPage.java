package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarPage extends AbstractPage
{

    public CarPage(WebDriver browser)
    {
        super(browser);
    }

    @FindBy(id = "searchText")
    public WebElement searchTextInput;

    @FindBy(css = "button[value='Ara']")
    public WebElement searchTextButton;

    @FindBy(id = "advancedSorting")
    public WebElement advancedSorting;

    @FindBy(css = ".sort-order-menu li ul :nth-child(4)")
    public WebElement sortByDescending;

    @FindBy(css = ".searchResultsRowClass tr .searchResultsLargeThumbnail a")
    public WebElement firstRow;

    @FindBy(css = ".searchResultsRowClass tr:nth-child(2) .searchResultsLargeThumbnail a")
    public WebElement secondRow;

    @FindBy(name = "price_min")
    public WebElement priceMinInput;

    @FindBy(name = "price_max")
    public WebElement priceMaxInput;

    @FindBy(css = "button.btn.btn-link.js-manual-search-button")
    public WebElement advancedSearchButtonForPrice;
}
