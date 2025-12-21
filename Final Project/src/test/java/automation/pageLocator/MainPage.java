package automation.pageLocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    private WebDriver driver;

    @FindBy(xpath = "//div[@class='container header__mega']//a[contains(text(),'Máy Rửa Chén Bát')]") private WebElement linktoPage;
    public MainPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void AccessTo_Mayruachenbat() throws InterruptedException {
        linktoPage.click();

    }
}
