package automation.testsuit;

import automation.common.CommonBase;
import automation.constant.CT_URL;
import automation.pagelocator.LoginPageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BTVN_Day16 extends CommonBase {
//    @BeforeMethod
//    public void beforeTest() {
//        driver=initDriverFireFox(CT_URL.loginURL);
//    }
    @Test
    public void loginSuccess() throws InterruptedException
    {
        driver=initDriverFireFox(CT_URL.loginURL);
        sendKey(By.id("email"),"admin@gmail.com");
        sendKey(By.id("password"),"12345678");
        click(By .name("signin"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        Assert.assertTrue(driver.findElements(By.xpath("//p[contains(text(),'Quản lý người dùng')]")).isEmpty());
    }
    @Test
    public void addKLVSuccess() throws InterruptedException
    {
        driver=initDriverFireFox(CT_URL.loginURL);
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.loginFactory("admin@gmail.com","12345678");
        click(By.xpath("//a[contains(text(),'Quản lý khu làm việc')]"));
        click(By.xpath("//button[contains(text(),'Thêm mới')]"));
        sendKey(By .name("work_areas_code"),"KV023");
        sendKey(By .name("name"),"KVLV cua Quang Anh");
        click(By.xpath("//button[@type='button'and @onclick='submit_new_workarea()']"));
        // chua co assert vi function luu loi
    }
    @Test
    public void deleteKLV() throws InterruptedException
    {
        driver=initDriverFireFox(CT_URL.loginURL);
        LoginPageFactory loginPageFactory = new LoginPageFactory(driver);
        loginPageFactory.loginFactory("admin@gmail.com","12345678");
        click(By.xpath("//a[contains(text(),'Quản lý khu làm việc')]"));
        click(By.xpath("//tr[.//td[contains(text(),'KV0076')]]//a[contains(text(),'Xóa')]"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        // chua co assert vi function luu loi


    }
    @Test
    public void testAlertBai2() throws InterruptedException
    {
        driver=initDriverFireFox(CT_URL.seleULR);
        driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        String msg=  driver.switchTo().alert().getText();
        Assert.assertEquals(msg,"Welcome to Selenium WebDriver Tutorials");

    }

}
