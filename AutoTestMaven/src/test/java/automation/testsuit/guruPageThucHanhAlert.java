package automation.testsuit;

import automation.common.CommonBase;
import automation.constant.CT_URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class guruPageThucHanhAlert extends CommonBase {

    @BeforeMethod
    public void beforeTest() {
        driver=initDriverFireFox(CT_URL.guruURL);
    }
    @Test
    public void deleteCusSuccess() throws InterruptedException {
        sendKey(By.name("cusid"),"123123");
        click(By.name("submit"));
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        String msg=  driver.switchTo().alert().getText();
        Assert.assertEquals(msg,"Customer Successfully Delete!");


    }
}
