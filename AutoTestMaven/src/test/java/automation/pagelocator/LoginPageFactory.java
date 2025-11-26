package automation.pagelocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageFactory {
     private WebDriver driver;

     @FindBy(id="email") private WebElement Page_email;
     @FindBy(id="password") private WebElement Page_password;
     @FindBy(xpath="//button[@name='signin']") private WebElement Sign_in_button;


    public LoginPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void loginFactory (String  email, String password) {
        Page_email.clear();
        Page_email.sendKeys(email);
        Page_password.clear();
        Page_password.sendKeys(password);
        Sign_in_button.click();

        new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.switchTo().alert().accept();

    }
}
