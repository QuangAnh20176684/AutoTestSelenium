package automation.common;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

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
    // find explicit
    public WebElement find_element_Ex(By locator){
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(3));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return element;
    }
    FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30)) // Maximum time to wait
            .pollingEvery(Duration.ofMillis(500)) // Interval between each poll
            .ignoring(NoSuchElementException.class);
    //find by fluent
    public WebElement find_element_Fluent(By locator){
         // Exceptions to ignore

	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    return element;
    }
    //wrap click
    public void click(By locator){
        WebElement element = find_element_Ex(locator);
        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }
    // wrap sendKey
    public void sendKey(By locator, String value){
        WebElement element = find_element_Ex(locator);
        element.clear();
        element.sendKeys(value);
    }
    //Click by javaScript
    public void clickByJS(By locator){
        WebElement element = find_element_Ex(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
    // check dissplay
    public boolean isElementDisplay(By locator){
        try {
            WebElement element = find_element_Ex(locator);
            return element.isDisplayed();
        } catch (NoSuchElementException ex1) {
            return false;// khong tim thay thang element
        } catch (Exception ex) {
            return false;
        }
    }


    public void closeDriver(){
        driver.close();
    }
}
