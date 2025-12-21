package automation.validators;

import automation.common.CommonBaseV2;
import automation.pageLocator.DetailSanphamPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ItemListValidator extends CommonBaseV2 {
    public ItemListValidator(WebDriver driver) {
        this.driver = driver;

    }
    public boolean checkListProductBySeller(List <WebElement> productList, String image_Logo){

            for (WebElement element : productList) {
                if (element.findElements(By.xpath(".//img[@alt='" + image_Logo + "']")).size() == 0) {

                    return false;
                } else {

                    continue;
                }

            }
            return true;


    }

    public boolean checkListProductByPrice(List<WebElement> List, float max, float min){// in this test case mac dinh lien he la dung
        for (WebElement element : List) {
            String price=element.findElement(By.xpath(".//span[contains(@class,'sale-price')] | .//div[contains(@class,'sale-price')]")).getText();
            if (price.equals("Liên hệ")){
                continue;
            } else if (price.equals("")) {
                return false;

            } else{
                long longPrice=parseLong(price);

                if(longPrice>max||longPrice<min){
                    System.out.println("This record false"+longPrice);
                    return false;
                }

            }
        }
        return true;
    }
    // overwrite de ap dung cho dieu kien >15000000, vi khong co gia tri max
    public boolean checkListProductByPrice(List<WebElement> List, float min){// in this test case mac dinh lien he la dung
        for (WebElement element : List) {
            String price=element.findElement(By.xpath(".//span[contains(@class,'sale-price')] | .//div[contains(@class,'sale-price')]")).getText();
            if (price.equals("Liên hệ")){
                continue;
            } else if (price.equals("")) {
                return false;

            } else{
                long longPrice=parseLong(price);

                if(longPrice<min){
                    System.out.println("This record false"+longPrice);
                    return false;
                }

            }
        }
        return true;
    }
    public boolean checkProductByXuatxu(String nameCheck) throws InterruptedException {
        DetailSanphamPage sanPham=new DetailSanphamPage(driver);
        List<String> ListXuatXu=sanPham.getXuatXu();
        for(String s: ListXuatXu){
            System.out.println(s);
            if(s.equalsIgnoreCase(nameCheck)){


                continue;
            }else{

                return false;
            }
        }
        return true;
    }
    public boolean checkProductByCongXuat(String nameCheck) throws InterruptedException {
        DetailSanphamPage sanPham=new DetailSanphamPage(driver);
        List<String> ListXuatXu=sanPham.getXuatXu();
        for(String s: ListXuatXu){
            System.out.println(s);
            if(s.equalsIgnoreCase(nameCheck)){


                continue;
            }else{

                return false;
            }
        }
        return true;
    }
}
