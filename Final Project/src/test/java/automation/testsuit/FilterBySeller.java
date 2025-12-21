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
    //todo: generate testcase cho cac nhan hang khac
//    @Test
//    public void filterBySellerKaff() throws InterruptedException {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.AccessTo_Mayruachenbat();
//
//        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));
//
//        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);
//        Assert.assertTrue(Page.filterByName("kaff","Kaff"));
//
//
//
//    }
//    @Test
//    public void filterBySellerEvilla() throws InterruptedException {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.AccessTo_Mayruachenbat();
//
//        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));
//
//        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);
//        Assert.assertTrue(Page.filterByName("sevilla","Sevilla"));
//
//
//
//    }
//    @Test
//    public void filterBySellerGrandX() throws InterruptedException {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.AccessTo_Mayruachenbat();
//
//        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));
//
//        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);
//        Assert.assertTrue(Page.filterByName("grandx","GRANDX"));
//
//
//
//    }
//    @Test
//    public void filterBySellerFagor() throws InterruptedException {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.AccessTo_Mayruachenbat();
//
//        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));
//
//        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);
//        Assert.assertTrue(Page.filterByName("fagor","Fagor"));
//
//
//
//    }
//    @Test
//    public void filterBySellerEurSun() throws InterruptedException {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.AccessTo_Mayruachenbat();
//
//        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));
//
//        MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);
//        Assert.assertTrue(Page.filterByName("eurosun","Eurosun"));
//
//
//
//    }
//// Todo: Clone not cac hang may rua chen bat con lai ma k can phai an xem them
//
//    //tu day la cac hang phai an xem them
//@Test
//public void filterBySellerHafele() throws InterruptedException {// case nay hay bi flaky test
//    MainPage mainPage = new MainPage(driver);
//    mainPage.AccessTo_Mayruachenbat();
//
//    justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));
//
//    clickByJS(By.xpath("//h3[contains(text(),'HÃNG SẢN XUẤT')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));
//
//    MayRuaChenBatPage Page= new MayRuaChenBatPage( driver);
//    Assert.assertTrue(Page.filterByName("hafele","HAFELE"));
//
//
//
//}
////Todo: Clone tiep cac hang can phai an xem them



}
