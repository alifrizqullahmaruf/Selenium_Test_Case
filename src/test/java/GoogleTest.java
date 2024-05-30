import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GoogleTest {

    WebDriver driver;

    @BeforeAll
    public void setUp() {
        // Inisialisasi objek driver sebagai ChromeDriver
        driver = new ChromeDriver();

        // Maksimalkan jendela browser
        driver.manage().window().maximize();

        // Buka URL Google
        driver.get("https://www.google.com/");
    }

    @Test
    public void driverTest() {
        SearchPage search = new SearchPage(driver);

        // Set search bar text
        search.setSearchBar("gibran");

        // Click search button
        search.clickButton();
    }
}
