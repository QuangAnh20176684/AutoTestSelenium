package automation.testsuit;

import automation.common.CommonBase;
import automation.constant.CT_URL;
import automation.pagelocator.vibloChangepassPageFactory;
import automation.pagelocator.vibloLoginPageFactory;
import automation.pagelocator.vibloLogoutPageFactory;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Viblo_Test_Case extends CommonBase {
    @BeforeMethod
    public void beforeTest() {
        driver=initDriverFireFox(CT_URL.vibloURL);
    }


    @Test
    public void loginSuccessTest() throws InterruptedException {
        vibloLoginPageFactory loginPage = new vibloLoginPageFactory(driver);
        loginPage.vibloLoginToPage("quanganh010499@gmail.com","123456789");
        Thread.sleep(3000);
        Assert.assertFalse(driver.findElements(By.xpath("//h2[contains(text(),'Thông tin của tôi')]")).isEmpty());

    }
    @Test
    public void loginFalseTest() throws InterruptedException {
        vibloLoginPageFactory loginPage = new vibloLoginPageFactory(driver);
        loginPage.vibloLoginToPage("quanganh@gmail.com","12345678");
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElements(By.xpath("//h2[contains(text(),'Thông tin của tôi')]")).isEmpty());

    }
    @Test
    public void logout() throws InterruptedException {
        vibloLoginPageFactory loginPage = new vibloLoginPageFactory(driver);
        loginPage.vibloLoginToPage("quanganh010499@gmail.com","12345678");
        Thread.sleep(3000);
        Assert.assertFalse(driver.findElements(By.xpath("//h2[contains(text(),'Thông tin của tôi')]")).isEmpty());

        vibloLogoutPageFactory logoutPage = new vibloLogoutPageFactory(driver);
        logoutPage.vibloLogout();

        Assert.assertFalse(driver.findElements(By.xpath("//button[@type='button' and .//span[contains(text(),'Đăng nhập')]]")).isEmpty());

    }
    @Test
    public void changePass() throws InterruptedException {
        vibloLoginPageFactory loginPage = new vibloLoginPageFactory(driver);
        loginPage.vibloLoginToPage("quanganh010499@gmail.com","QuangAnh14");
        Thread.sleep(3000);
        Assert.assertFalse(driver.findElements(By.xpath("//h2[contains(text(),'Thông tin của tôi')]")).isEmpty());

        vibloChangepassPageFactory changepassPage = new vibloChangepassPageFactory(driver);
        changepassPage.vibloChangepassPage("QuangAnh14", "123456789");

        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed());
     // Luu y testcase nay sau khi pass co the lam cac tc bi false trong lan chay tiep theo do mat khau cua tai khoan da bi thay doi
        // Can nghien cuu su dung bien dong nhung chua co thoi gian
    }
}
