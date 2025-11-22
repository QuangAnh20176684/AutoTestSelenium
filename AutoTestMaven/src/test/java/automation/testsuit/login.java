package automation.testsuit;

import automation.common.CommonBase;
import automation.pagelocator.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.constant.CT_URL;
import org.testng.Assert.*;

import java.time.Duration;

public class login extends CommonBase {
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


        LoginPage loginPage = new LoginPage(driver);
        loginPage.logintoPage("admin@gmail.com","12345678");

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
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logintoPage("admin123@gmail.com","12345678");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertFalse(driver.findElement(By.xpath("//p[contains(text(),'Quản lý người dùng')]")).isDisplayed());
    }
    @Test
    public void loginWithIncorrectPassword(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logintoPage("admin@gmail.com","ABcDef");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertFalse(driver.findElement(By.xpath("//p[contains(text(),'Quản lý người dùng')]")).isDisplayed());
    }
    @Test
    public void loginWithIncorrectBoth(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logintoPage("admin123@gmail.com","ABcDef");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertFalse(driver.findElement(By.xpath("//p[contains(text(),'Quản lý người dùng')]")).isDisplayed());
    }

    @Test
    public void logoutSuccess(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.logintoPage("admin@gmail.com","12345678");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("dropdownMenuLink")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Đăng xuất')]")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("MyModal")
        ));

        driver.findElement(By.xpath("//button[contains(text(),'Đăng xuất')]")).click();



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(driver.findElement(By.id("password")).isDisplayed());
    }



}
