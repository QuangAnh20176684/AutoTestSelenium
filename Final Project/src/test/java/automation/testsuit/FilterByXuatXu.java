package automation.testsuit;

import automation.common.CommonBaseV2;
import automation.constant.CT_URL;
import automation.pageLocator.DetailSanphamPage;
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

public class FilterByXuatXu extends CommonBaseV2 {
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
    public void filterBySingapore() throws InterruptedException
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));



        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByXuatXu("Singapore");
        System.out.println(productList.size());

        if(productList.size()>0){
            boolean result=true;
            for(int i=0;i<productList.size();i++){

                productList=Page.getListProductByXuatXu();

                clickByJS(productList.get(i));
                Thread.sleep(2000);


                ItemListValidator itemListValidator = new ItemListValidator(driver);
                if(itemListValidator.checkProductByXuatxu("Singapore")==true){
                    System.out.println("Spain");
                    driver.navigate().back();
                    Thread.sleep(2000);
                    continue;
                }else{

                    result=false;
                    break;

                }


            }
            Assert.assertTrue(result);




        }else{
            System.out.println("wtf?");
        }
    }
//    //todo: Generate ra cac case voi xuat xu khong can bam xem them
//
//    @Test
//    public void filterByCzech() throws InterruptedException
//    {
//        MainPage mainPage = new MainPage(driver);
//        mainPage.AccessTo_Mayruachenbat();
//
//        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));
//
//        clickByJS(By.xpath("//h3[contains(text(),'Xuất xứ')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));
//
//        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
//        List<WebElement> productList=Page.getListProductByXuatXu("Czech");
//        System.out.println(productList.size());
//
//        if(productList.size()>0){
//
//            ItemListValidator itemListValidator = new ItemListValidator(driver);
//            itemListValidator.checkListProductByXuatxu(productList,"Czech");
//
//        }else{
//            System.out.println("wtf?");
//        }
//
//
//
//
//    }
    //todo: Generate ra cac case voi xuat xu  can bam xem them
    @Test
    public void filterBySpain() throws InterruptedException// chay duoc nhung page hoat dong ao qua :)))) van se ra ket qua nhung ton nhieu thoi gian vi co nhieu san pham can check
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//h3[contains(text(),'Xuất xứ')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByXuatXu("Spain");
        System.out.println(productList.size());

        if(productList.size()>0){
            boolean result=true;
            for(int i=0;i<productList.size();i++){

                productList=Page.getListProductByXuatXu();

                clickByJS(productList.get(i));
                Thread.sleep(2000);


                ItemListValidator itemListValidator = new ItemListValidator(driver);
                if(itemListValidator.checkProductByXuatxu("Spain")==true){
                    System.out.println("Spain");
                    driver.navigate().back();
                    Thread.sleep(2000);
                    continue;
                }else{

                    result=false;
                    break;

                }


            }
            Assert.assertTrue(result);




        }else{
            System.out.println("wtf?");
        }
    }
    //todo: Generate ra cac case voi xuat xu  can bam xem them
    @Test
    public void filterByEU() throws InterruptedException// chay duoc nhung page hoat dong ao qua :)))) van se ra ket qua nhung ton nhieu thoi gian vi co nhieu san pham can check
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//h3[contains(text(),'Xuất xứ')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByXuatXu("EU");
        System.out.println(productList.size());

        if(productList.size()>0){
            boolean result=true;
            for(int i=0;i<productList.size();i++){

                productList=Page.getListProductByXuatXu();

                clickByJS(productList.get(i));
                Thread.sleep(5000);


                ItemListValidator itemListValidator = new ItemListValidator(driver);
                if(itemListValidator.checkProductByXuatxu("EU")==true){
                    System.out.println("Spain");
                    driver.navigate().back();
                    Thread.sleep(2000);
                    continue;
                }else{

                    result=false;
                    break;

                }


            }
            Assert.assertTrue(result);




        }else{
            System.out.println("wtf?");
        }
    }
}

