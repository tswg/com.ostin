package Pages.MyAccount;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyOrders {
    protected WebDriver driver;

    public MyOrders(WebDriver driver) {
        this.driver = driver;
    }
    By myOrdersLocator = By.xpath("//A[@title = 'Мои заказы']");
    By myOrdersLocalLocator = By.xpath("//span[contains(text(), 'МОИ ЗАКАЗЫ')]");

    public void assertMyOrders() {
        WebElement myorder = driver.findElement(myOrdersLocator);
        Assert.assertEquals("Мои заказы", myorder.getAttribute("title"));
        myorder.click();
        Assert.assertEquals("wrong", driver.findElement(myOrdersLocalLocator).getText(), "МОИ ЗАКАЗЫ");
        System.out.println("Раздел мои заказы проверен");
    }

}
