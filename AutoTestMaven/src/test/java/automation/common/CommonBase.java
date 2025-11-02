package automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonBase {
    public static WebDriver driver;
    public WebDriver initDriver(String url){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get(url);
        chromeDriver.manage().window().maximize();
        return chromeDriver;




    }
    public void closeDriver(){
        driver.close();
    }
}
