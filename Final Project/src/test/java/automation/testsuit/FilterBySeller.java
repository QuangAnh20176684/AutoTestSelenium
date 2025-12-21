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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class FilterBySeller extends CommonBaseV2 {
    //Todo: Them chay voi nhieu trinh duyet
//    @BeforeMethod
//    @Parameters({"browser","URL"})
//    public void directTopage(String browserSetup) {
////        driver=initFirefoxDriver(CT_URL.mediaURL);
//        setUpDriver(browserSetup);
//        driver.get(CT_URL.bepAnToanURL);
//    }

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
    public void filterBySellerBosch() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);

        List<WebElement> productList=Page.getListProductBySeller("bosch");
        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductBySeller(productList,"Bosch"));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }





    }
    @Test
    public void filterBySellerKAFF() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);

        List<WebElement> productList=Page.getListProductBySeller("kaff");
        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductBySeller(productList,"Kaff"));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }





    }
    @Test
    public void filterBySellerSevila() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);

        List<WebElement> productList=Page.getListProductBySeller("sevilla");
        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductBySeller(productList,"Sevilla"));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }





    }
    @Test
    public void filterBySellergrandX() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);

        List<WebElement> productList=Page.getListProductBySeller("grandx");
        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductBySeller(productList,"GRANDX"));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }





    }
    @Test
    public void filterBySellerfagor() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);

        List<WebElement> productList=Page.getListProductBySeller("fagor");
        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductBySeller(productList,"Fagor"));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }





    }
    // tuong tu voi cac nhan hang con lai
    // tu day la cac nhan hang can phai an xem them
    @Test
    public void filterBySellerHafele() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//h3[contains(text(),'HÃNG SẢN XUẤT')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);

        List<WebElement> productList=Page.getListProductBySeller("hafele");
        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductBySeller(productList,"HAFELE"));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }





    }
    @Test
    public void filterBySellerBauer() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//h3[contains(text(),'HÃNG SẢN XUẤT')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);

        List<WebElement> productList=Page.getListProductBySeller("bauer");
        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductBySeller(productList,"BAUER"));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }





    }
    @Test
    public void filterBySellerFaster() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//h3[contains(text(),'HÃNG SẢN XUẤT')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);

        List<WebElement> productList=Page.getListProductBySeller("faster");
        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductBySeller(productList,"Faster"));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }





    }
    @Test
    public void filterBySellerCanzy() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//h3[contains(text(),'HÃNG SẢN XUẤT')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);

        List<WebElement> productList=Page.getListProductBySeller("canzy");
        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductBySeller(productList,"Canzy"));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }





    }
    @Test
    public void filterBySellerElectrolux() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//h3[contains(text(),'HÃNG SẢN XUẤT')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);

        List<WebElement> productList=Page.getListProductBySeller("electrolux");
        if(productList.size()>0)
        {
            System.out.println(productList.size());
            ItemListValidator Check= new ItemListValidator( driver);
            Assert.assertTrue(Check.checkListProductBySeller(productList,"Electrolux"));

        }
        else{
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }





    }
    // cac nhan hang con lai tuong tu







}
