package automation.testsuit;

import automation.common.CommonBaseV2;
import automation.constant.CT_URL;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class BTVN_Day18 extends CommonBaseV2 {
    @BeforeMethod
    @Parameters({"browser","URL"})
    public void directTopage(String browserSetup, String URLSetup) {
//        driver=initFirefoxDriver(CT_URL.mediaURL);
        setUpDriver(browserSetup);
        driver.get(URLSetup);
    }
    @AfterMethod
    public void afterTest() {
        driver.quit();
    }
    @Test
    public void zaloCheck() throws InterruptedException {
       if(!driver.getCurrentUrl().equals(CT_URL.hungAnhDienMayURL)) {
           throw new SkipException("Skipping this test cause URL is not equals");
       }else{
           click(By.xpath("//div[@id='zalo-vr']//img"));
           Thread.sleep(2000);
           String currentTab= driver.getWindowHandle();
           List<String> tabs= new ArrayList<>(driver.getWindowHandles());
           driver.switchTo().window(tabs.get(1));
           Assert.assertTrue(driver.getCurrentUrl().equals("https://zalo.me/0965880198")||driver.getCurrentUrl().equals("https://id.zalo.me/account?continue=http%3A%2F%2Fzalo.me%2F0965880198"));
       }
    }
    @Test
    public void chatCheck() throws InterruptedException {
        if(!driver.getCurrentUrl().equals(CT_URL.bepAnToanURL)) {
            throw new SkipException("Skipping this test cause URL is not equals");
        }else{
            click(By.xpath("//a[@target='_blank'][.//img[contains(@alt,'messenger')]]"));
            Thread.sleep(2000);
            String currentTab= driver.getWindowHandle();
            List<String> tabs= new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(tabs.get(1));
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.messenger.com/login.php?next=https%3A%2F%2Fwww.messenger.com%2Ft%2F111668015005619%2F%3Fmessaging_source%3Dsource%253Apages%253Amessage_shortlink%26source_id%3D1441792%26recurring_notification%3D0");




        }
    }

}
