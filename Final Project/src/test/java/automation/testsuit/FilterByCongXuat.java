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

public class FilterByCongXuat extends CommonBaseV2 {
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
    public void filterByCongXuat7() throws InterruptedException
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.AccessTo_Mayruachenbat();

        justWaitUntil(By.xpath("//span[contains(@class,'breadcrumb')]"));

        clickByJS(By.xpath("//h3[contains(text(),'Số Bộ')]/following-sibling::div[contains(@class,'category-menus')]//span[contains(text(),'Xem thêm')]"));

        MayRuaChenBatPage Page= new MayRuaChenBatPage(driver);
        List<WebElement> productList=Page.getListProductByCongXuat("7 bộ");
        System.out.println(productList.size());

        if(productList.size()>0){
            boolean result=true;
            for(int i=0;i<productList.size();i++){

                productList=Page.getListProductByCongXuat();

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
