package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basket {
    protected WebDriver driver;

    public Basket(WebDriver driver) {
        this.driver = driver;
    }

    By basketButtonLocator = By.xpath("//I[@class = 'new_ostin_head__basket-icon active']");
    By deleteItemFromBusket = By.xpath("//A[@class = 'multi-basket__items-delete js-delete-rlsId']");
    By assertBusketforItem = By.xpath("//DIV[@class = 'multi-basket__empty']/P[node() = 'Ваша корзина пуста']");

    public void deleteItem()    {
        driver.findElement(deleteItemFromBusket).click();
        System.out.println("-удалил итем из корзины");
    }
    public void assertBusketDel() {
        Assert.assertEquals("wrong", driver.findElement(assertBusketforItem).getText(), "ВАША КОРЗИНА ПУСТА");
    }
}
