package automation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonBase {
    public static WebDriver driver;
    public WebDriver initDriverChrome(String url){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get(url);
        chromeDriver.manage().window().maximize();
        return chromeDriver;




    }
    public WebDriver initDriverFireFox(String url){
        System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
        FirefoxDriver FirefoxDriver = new FirefoxDriver();
        FirefoxDriver.get(url);
        FirefoxDriver.manage().window().maximize();
        return FirefoxDriver;




    }

    public void closeDriver(){
        driver.close();
    }
}
