import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    //locator
    By search_bar = new By.ById("APjFqb");
    By button = new By.ByName("btnK");

    WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to set text in search bar
    public void setSearchBar(String text) {
        driver.findElement(search_bar).sendKeys(text);
    }

    // Method to click the search button
    public ResultPage clickButton() {
        driver.findElement(search_bar).submit();
        return new ResultPage(driver);
    }
}
