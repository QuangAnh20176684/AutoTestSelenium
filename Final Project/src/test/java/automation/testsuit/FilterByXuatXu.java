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
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }
    }
    @Test
    public void filterByEngland() throws InterruptedException
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));



        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByXuatXu("England");
        System.out.println(productList.size());

        if(productList.size()>0){
            boolean result=true;
            for(int i=0;i<productList.size();i++){

                productList=Page.getListProductByXuatXu();

                clickByJS(productList.get(i));
                Thread.sleep(2000);


                ItemListValidator itemListValidator = new ItemListValidator(driver);
                if(itemListValidator.checkProductByXuatxu("England")==true){
                    
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
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }
    }
    @Test
    public void filterByScotland() throws InterruptedException
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));



        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByXuatXu("Scotland");
        System.out.println(productList.size());

        if(productList.size()>0){
            boolean result=true;
            for(int i=0;i<productList.size();i++){

                productList=Page.getListProductByXuatXu();

                clickByJS(productList.get(i));
                Thread.sleep(2000);


                ItemListValidator itemListValidator = new ItemListValidator(driver);
                if(itemListValidator.checkProductByXuatxu("Scotland")==true){
                    
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
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }
    }
    @Test
    public void filterByGreece() throws InterruptedException
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));



        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByXuatXu("Greece");
        System.out.println(productList.size());

        if(productList.size()>0){
            boolean result=true;
            for(int i=0;i<productList.size();i++){

                productList=Page.getListProductByXuatXu();

                clickByJS(productList.get(i));
                Thread.sleep(2000);


                ItemListValidator itemListValidator = new ItemListValidator(driver);
                if(itemListValidator.checkProductByXuatxu("Greece")==true){
                    
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
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }
    }
    @Test
    public void filterByIndia() throws InterruptedException
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));



        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByXuatXu("India");
        System.out.println(productList.size());

        if(productList.size()>0){
            boolean result=true;
            for(int i=0;i<productList.size();i++){

                productList=Page.getListProductByXuatXu();

                clickByJS(productList.get(i));
                Thread.sleep(2000);


                ItemListValidator itemListValidator = new ItemListValidator(driver);
                if(itemListValidator.checkProductByXuatxu("India")==true){

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
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }
    }


    // tu day can bam xem them moi click duoc

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
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }
    }



    @Test
    public void filterByEU() throws InterruptedException{// demo bang testcase nay cho de vi co it san pham khong mat thoi gian
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
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }


    }
    @Test
    public void filterByKorea() throws InterruptedException{// demo bang testcase nay cho de vi co it san pham khong mat thoi gian
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//h3[contains(text(),'Xuất xứ')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByXuatXu("Korea");
        System.out.println(productList.size());

        if(productList.size()>0){
            boolean result=true;
            for(int i=0;i<productList.size();i++){

                productList=Page.getListProductByXuatXu();

                clickByJS(productList.get(i));
                Thread.sleep(5000);


                ItemListValidator itemListValidator = new ItemListValidator(driver);
                if(itemListValidator.checkProductByXuatxu("Korea")==true){

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
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }


    }
    @Test
    public void filterByJapan() throws InterruptedException{// demo bang testcase nay cho de vi co it san pham khong mat thoi gian
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//h3[contains(text(),'Xuất xứ')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByXuatXu("Japan");
        System.out.println(productList.size());

        if(productList.size()>0){
            boolean result=true;
            for(int i=0;i<productList.size();i++){

                productList=Page.getListProductByXuatXu();

                clickByJS(productList.get(i));
                Thread.sleep(5000);


                ItemListValidator itemListValidator = new ItemListValidator(driver);
                if(itemListValidator.checkProductByXuatxu("Japan")==true){

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
            Assert.assertTrue(driver.findElement(By.xpath("//img[contains(@src,'empty')]")).isDisplayed());
        }


    }
}

