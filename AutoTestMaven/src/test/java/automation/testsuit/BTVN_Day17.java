package automation.testsuit;


import automation.common.CommonBaseV2;
import automation.constant.CT_URL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BTVN_Day17 extends CommonBaseV2 {
    @BeforeMethod
    public void beforeTest() {
        driver=initFirefoxDriver(CT_URL.mediaURL);
    }
    @AfterMethod
    public void afterTest() {
        driver.quit();
    }
    @Test
    public void zaloCheck() throws InterruptedException {

        Thread.sleep(5000);



        int num=findIframeZalo();


        driver.switchTo().frame(num);

        JavascriptExecutor js= (JavascriptExecutor)driver;
        WebElement logo = driver.findElement(By.xpath("//div[@class='logo']"));
        js.executeScript("arguments[0].click()", logo);
        driver.switchTo().defaultContent();// luu y cau nay rat quan trong, phai kiem soat duoc driver dang o dau
        Thread.sleep(3000);

        int num2=findIframezaloChat();// vi ket qua la 1 iframe nen assert rang co the tim ra iframe nay
        Assert.assertNotEquals(num2,-1);


    }
}
