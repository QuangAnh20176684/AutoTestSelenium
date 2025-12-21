package automation.testsuit;

import automation.common.CommonBaseV2;
import automation.constant.CT_URL;
import automation.pageLocator.CheckoutPage;
import automation.pageLocator.MainPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkout extends CommonBaseV2 {
    @BeforeMethod
    public void beforeMethod() {
        driver=initChromeDriver(CT_URL.bepAnToanURL);
    }

    @AfterMethod
    public void afterTest()
    {
        driver.quit();
    }
    @Test
    public void checkoutSainamebotrong() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//div[contains(@class,'product-list')]//a[1]"));
        Thread.sleep(1000);
        clickByJS(By.xpath("//span[text()='Mua ngay'][1]"));
        Thread.sleep(1000);

        CheckoutPage CheckoutPage = new CheckoutPage(driver);
        CheckoutPage.Checkout("","0366586795","Ha noi do ");
        Assert.assertTrue(driver.findElement(By.xpath("//small[normalize-space()='Họ và tên không hợp lệ']")).isDisplayed());
    }
    @Test
    public void checkoutSainamekhoangtrang() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//div[contains(@class,'product-list')]//a[1]"));
        Thread.sleep(1000);
        clickByJS(By.xpath("//span[text()='Mua ngay'][1]"));
        Thread.sleep(1000);

        CheckoutPage CheckoutPage = new CheckoutPage(driver);
        CheckoutPage.Checkout(" ","0366586795","Ha noi do ");
        Assert.assertTrue(driver.findElement(By.xpath("//small[normalize-space()='Họ và tên không hợp lệ']")).isDisplayed());
    }
    @Test
    public void checkoutSaiPhone() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//div[contains(@class,'product-list')]//a[1]"));
        Thread.sleep(1000);
        clickByJS(By.xpath("//span[text()='Mua ngay'][1]"));
        Thread.sleep(1000);

        CheckoutPage CheckoutPage = new CheckoutPage(driver);
        CheckoutPage.Checkout("Quang Anh","03232","Ha noi do ");
        Assert.assertTrue(driver.findElement(By.xpath("//small[normalize-space()='Số điện thoại không hợp lệ']")).isDisplayed());
    }
    @Test
    public void checkoutDiachibotrong() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//div[contains(@class,'product-list')]//a[1]"));
        Thread.sleep(1000);
        clickByJS(By.xpath("//span[text()='Mua ngay'][1]"));
        Thread.sleep(1000);

        CheckoutPage CheckoutPage = new CheckoutPage(driver);
        CheckoutPage.Checkout("Quang Anh","0366586795","");
        Assert.assertTrue(driver.findElement(By.xpath("//small[normalize-space()='Địa chỉ không hợp lệ']")).isDisplayed());
    }
    @Test
    public void checkoutDiackhoangtrang() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//div[contains(@class,'product-list')]//a[1]"));
        Thread.sleep(1000);
        clickByJS(By.xpath("//span[text()='Mua ngay'][1]"));
        Thread.sleep(1000);

        CheckoutPage CheckoutPage = new CheckoutPage(driver);
        CheckoutPage.Checkout("Quang Anh","0366586795"," ");
        Assert.assertTrue(driver.findElement(By.xpath("//small[normalize-space()='Địa chỉ không hợp lệ']")).isDisplayed());
    }


}
