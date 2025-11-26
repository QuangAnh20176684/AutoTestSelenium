package automation.pagelocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageFactory {
    private WebDriver driver;
    @FindBy(id="dropdownMenuLink") private WebElement dropdownMenuLink;
    @FindBy(xpath="//button[contains(text(),'Đăng xuất')]") private WebElement logoutSelection;
    @FindBy(xpath="(//button[text()='Đăng xuất'&type='submit'])") private WebElement logoutButton;
    public LogoutPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void LogoutPageFactory() throws InterruptedException {
        dropdownMenuLink.click();
        Thread.sleep(3000);
        logoutSelection.click();
        Thread.sleep(3000);
        logoutButton.click();
    }
}
