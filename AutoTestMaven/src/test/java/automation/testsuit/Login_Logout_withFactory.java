package automation.testsuit;

import automation.common.CommonBase;
import automation.constant.CT_URL;
import automation.pagelocator.LoginPageFactory;
import automation.pagelocator.LogoutPageFactory;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_Logout_withFactory extends CommonBase {
    @BeforeMethod
    public void beforeTest() {
        driver=initDriverFireFox(CT_URL.loginURL);
    }
    @AfterMethod
    public void afterTest() {
        closeDriver();
    }
    @Test
    public void loginSuccess(){


        LoginPageFactory Loginpage = new LoginPageFactory(driver);
        Loginpage.loginFactory("admin@gmail.com","12345678");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Quản lý người dùng')]")).isDisplayed());

    }

    @Test
    public void loginWithIncorrectEmail(){
        LoginPageFactory Loginpage = new LoginPageFactory(driver);
        Loginpage.loginFactory("admin@gmail123.com","12345678");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElements(By.xpath("//p[contains(text(),'Quản lý người dùng')]")).isEmpty());
    }
    @Test
    public void loginWithIncorrectPassword(){
        LoginPageFactory Loginpage = new LoginPageFactory(driver);
        Loginpage.loginFactory("admin@gmail.com","1234567899992");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElements(By.xpath("//p[contains(text(),'Quản lý người dùng')]")).isEmpty());
    }
    @Test
    public void loginWithIncorrectBoth(){
        LoginPageFactory Loginpage = new LoginPageFactory(driver);
        Loginpage.loginFactory("admin123@gmail.com","123456782332");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElements(By.xpath("//p[contains(text(),'Quản lý người dùng')]")).isEmpty());
    }

    @Test
    public void logoutSuccess() throws InterruptedException {
        LoginPageFactory Loginpage = new LoginPageFactory(driver);
        Loginpage.loginFactory("admin@gmail.com","12345678");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LogoutPageFactory Logoutpage = new LogoutPageFactory(driver);
        Logoutpage.LogoutPageFactory();

        Assert.assertTrue(driver.findElement(By.id("password")).isDisplayed());
    }

}
