package automation.pagelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void logintoPage(String username, String password) {
        WebElement email=driver.findElement(By.id("email"));
        email.click();
        email.sendKeys(username);

        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys(password);

        driver.findElement(By.xpath("//button[@name='signin']")).click();

        new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.switchTo().alert().accept();


    }
}
