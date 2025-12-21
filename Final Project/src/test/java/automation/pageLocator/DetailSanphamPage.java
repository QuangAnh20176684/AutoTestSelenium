package automation.pageLocator;

import automation.common.CommonBaseV2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DetailSanphamPage extends CommonBaseV2 {
    private WebDriver driver;
    private By xpathXuatxu = By.xpath("//span[contains(text(),'Xuất xứ')]/following-sibling::span");
    private By xpathCongXuat = By.xpath("//span[contains(text(),'Công xuất rửa')]/following-sibling::span");

    public DetailSanphamPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public List<String> getXuatXu(){// tra ve xuat xu cua san pham( k can thiet lam )
        List<String> result=new ArrayList<>();

        List <WebElement> xuatXu=driver.findElements(xpathXuatxu);
        for(WebElement element:xuatXu){
            result.add(element.getText());
            break;

        }
        return result;
    }
    public boolean getCongxuat(){// ham nay tra ve
        String result=driver.findElement(xpathCongXuat).getText();
        System.out.println(result);
        return true;
    }

}
