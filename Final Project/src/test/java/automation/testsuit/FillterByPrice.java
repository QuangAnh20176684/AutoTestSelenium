package automation.testsuit;

import automation.common.CommonBaseV2;
import automation.constant.CT_URL;
import automation.pageLocator.MainPage;
import automation.pageLocator.MayRuaChenBatPage;
import automation.validators.ItemListValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FillterByPrice extends CommonBaseV2 {
    @BeforeMethod
    public void beforeMethod() {
        driver=initChromeDriver(CT_URL.bepAnToanURL);
    }

    @AfterMethod
    public void afterTest()
    {
        driver.quit();
    }
    //todo: Chỉnh lại các Test với filter theo cấu trúc mới
    @Test
    public void filterByPrice3000() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByPrice("< 3.000.000");



        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductByPrice(productList,3000000,0));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }



    }
    @Test
    public void filterByPrice3000to5000() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByPrice("3.000.000 > 5.000.000");



        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductByPrice(productList,5000000,3000000));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }



    }
    @Test
    public void filterByPrice5000to10000() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByPrice("5.000.000 > 10.000.000");



        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductByPrice(productList,10000000,5000000));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }



    }
    @Test
    public void filterByPrice10000to15000() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByPrice("10.000.000 > 15.000.000");



        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductByPrice(productList,15000000,10000000));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }



    }


    @Test
    public void filterByPrice15000() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByPrice("> 15.000.000");



        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductByPrice(productList,15000000));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }



    }
}
