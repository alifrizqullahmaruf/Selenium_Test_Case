import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class CromeTest {

        @Test
        // Fungsi untuk melakukan pengujian menggunakan Selenium WebDriver
        public void test() {
            // Mendefinisikan objek WebDriver
            WebDriver driver;


            // Inisialisasi objek driver sebagai ChromeDriver
            driver = new ChromeDriver();

            // Maksimalkan jendela browser
            driver.manage().window().maximize();

            // Buka URL Google
            driver.get("https://practicetestautomation.com/practice-test-login/");

            // Verify new page URL contains
            String expectedURL = "https://practicetestautomation.com/practice-test-login/";
            String actualURL = driver.getCurrentUrl();
            Assert.assertEquals(actualURL,expectedURL);
            System.out.println("Verify new page URL successful");

            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("student");


            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("Password123");

            WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
            btnLogin.click();

            // Verify new page contains expected text ('Congratulations')
            WebElement textExpected = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"));
            boolean CongratulationsText = textExpected.isDisplayed();
            System.out.println("Verify new page contains expected text ('Congratulations'): " + CongratulationsText);


            // Verify button Log out is displayed on the new page
            WebElement btnLogOut = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a"));
            boolean LogoutButton = btnLogOut.isDisplayed();
            System.out.println("Verify button Log out is displayed on the new page :" + LogoutButton);

//            btnLogOut.click();

            // Tutup browser
//            driver.quit();
        }


}