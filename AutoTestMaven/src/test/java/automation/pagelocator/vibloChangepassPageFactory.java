package automation.pagelocator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class vibloChangepassPageFactory {
    private WebDriver driver;

    @FindBy(xpath="//li[@role='menuitem' and ./span[contains(text(),'Mật Khẩu')]]") private WebElement passItemMenu;
    @FindBy(xpath="//label[@for='current_password']/parent::div//input") private WebElement currentPass;
    @FindBy(xpath="//label[@for='new_password']/parent::div//input") private WebElement newPass;
    @FindBy(xpath="//label[@for='new_password_confirmation']/parent::div//input") private WebElement newPassConfirm;
    @FindBy(xpath="//button[@type='button' and .//span[contains(text(),'Đổi mật khẩu')]]") private WebElement btnChangePass;
    public vibloChangepassPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void  vibloChangepassPage(String OldPass,String changePass) throws InterruptedException {
        passItemMenu.click();
        Thread.sleep(2000);
        currentPass.sendKeys(OldPass);
        newPass.sendKeys(changePass);
        newPassConfirm.sendKeys(changePass);
        btnChangePass.click();




    }
}
