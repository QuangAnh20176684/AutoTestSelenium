package automation.pagelocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vibloLoginPageFactory {
    private WebDriver driver;

    @FindBy(xpath="//input[@placeholder='Tên người dùng hoặc email']") private WebElement pgEmail;
    @FindBy(xpath="//input[@placeholder='Mật khẩu']") private WebElement pgPassword;
    @FindBy(xpath="//button[@type='button' and .//span[contains(text(),'Đăng nhập')]]") private WebElement btnLogin;

    public vibloLoginPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void  vibloLoginToPage(String email,String password){
        pgEmail.sendKeys(email);
        pgPassword.sendKeys(password);
        btnLogin.click();
    }
}
