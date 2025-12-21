package automation.pageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;
    @FindBy (xpath = "//input[@placeholder='Nhập họ và tên']") private WebElement inputName;
    @FindBy (xpath = "//input[@placeholder='Nhập số điện thoại']") private WebElement inputPhonenumber;
    @FindBy (xpath = "//input[@placeholder='Nhập số nhà, tên đường, phường/ xã, quận/huyện, tỉnh/ thành phố']") private WebElement inputAddress;
    @FindBy (xpath = "//span[text()='Thanh toán']/parent::button") private WebElement buttonThanhToan;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void Checkout( String name, String phonenumber, String address){
        inputName.sendKeys(name);
        inputPhonenumber.sendKeys(phonenumber);
        inputAddress.sendKeys(address);

//        buttonThanhToan.click();

    }
}
