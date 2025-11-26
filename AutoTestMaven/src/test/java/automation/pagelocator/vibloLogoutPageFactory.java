package automation.pagelocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vibloLogoutPageFactory {
    private WebDriver driver;

    @FindBy(xpath="//img[contains(@class,'avatar') and ..//div[@role='tooltip']]") private WebElement pgAvatar;
    @FindBy(partialLinkText = "Đăng xuất") private WebElement pgLogout;

    public vibloLogoutPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void  vibloLogout(){
        pgAvatar.click();
        pgLogout.click();
    }
}
