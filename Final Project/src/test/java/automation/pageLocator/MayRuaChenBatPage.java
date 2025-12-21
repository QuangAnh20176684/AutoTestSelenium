package automation.pageLocator;

import automation.common.CommonBaseV2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class MayRuaChenBatPage extends CommonBaseV2 {
    private WebDriver driver;
    private By xpathXemThem = By.xpath("//a[contains(@class,'btn-linear-orange')]//span[text()='Xem thêm']");
    private By xpathProductList= By.xpath("//div[contains(@class,'product-list')]//a");

    public MayRuaChenBatPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getListProductBySeller(String name) throws InterruptedException {


        clickByJS(By.xpath("//div[@class='category-menus']//a[contains(@href,'" + name + "')]"));
        Thread.sleep(2000);//Todo: cần tìm 1 cái locator để đợi web load xong ở chỗ này :))
        while (driver.findElements(xpathXemThem).size()!=0) {
            clickByJS(xpathXemThem);
            Thread.sleep(1000);


        }

        List<WebElement> productList = driver.findElements(xpathProductList);
        return productList;
    }

    public List<WebElement> getListProductByPrice(String name) throws InterruptedException {

        clickByJS(By.xpath("//div[@class='category-menus']//span[normalize-space(text())='" + name + "']"));

        Thread.sleep(2000);
        while (driver.findElements(xpathXemThem).size()!=0) {
            clickByJS(xpathXemThem);
            Thread.sleep(1000);


        }
        List<WebElement> productList = driver.findElements(xpathProductList);
        return productList;


    }
    public List<WebElement> getListProductByXuatXu(String name) throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        clickByJS(By.xpath("//span[normalize-space(text())='"+name+"']/preceding-sibling::input[@type='checkbox']"));
        Thread.sleep(3000);
        while (driver.findElements(xpathXemThem).size()!=0) {
            clickByJS(xpathXemThem);
            Thread.sleep(1000);


        }
        List<WebElement> productList = driver.findElements(xpathProductList);
        return productList;


    }
    public List<WebElement> getListProductByXuatXu() throws InterruptedException {// overwright vi ham nay k can click vao checkbox nua

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

        while (driver.findElements(xpathXemThem).size()!=0) {
            clickByJS(xpathXemThem);
            Thread.sleep(1000);


        }
        List<WebElement> productList = driver.findElements(xpathProductList);
        return productList;


    }
    public List<WebElement> getListProductByCongXuat(String name) throws InterruptedException {

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        clickByJS(By.xpath("//span[normalize-space(text())='"+name+"']/preceding-sibling::input[@type='checkbox']"));
        Thread.sleep(3000);
        while (driver.findElements(xpathXemThem).size()!=0) {
            clickByJS(xpathXemThem);
            Thread.sleep(1000);


        }
        List<WebElement> productList = driver.findElements(xpathProductList);
        return productList;


    }
    public List<WebElement> getListProductByCongXuat() throws InterruptedException {// overwright vi ham nay k can click vao checkbox nua

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

        while (driver.findElements(xpathXemThem).size()!=0) {
            clickByJS(xpathXemThem);
            Thread.sleep(1000);


        }
        List<WebElement> productList = driver.findElements(xpathProductList);
        return productList;


    }



}
