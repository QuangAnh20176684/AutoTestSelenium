package automation.testsuit;

import automation.common.CommonBase;
import automation.constant.CT_URL;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day8 extends CommonBase {
    @Test
    public void locatorByID(){
        driver = initDriver(CT_URL.URL);
        WebElement email = driver.findElement(By.id("email"));
        System.out.println(email);

        WebElement password = driver.findElement(By.id("password"));
        System.out.println(password);

    }
    @Test
    public void locatorBylinktext(){
        driver = initDriver(CT_URL.URL);
        WebElement linktext= driver.findElement(By.linkText("Sign up"));
        System.out.println(linktext);

    }
}
