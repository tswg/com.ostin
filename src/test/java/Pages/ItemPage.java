package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemPage {
    protected WebDriver driver;
    public ItemPage(WebDriver driver)    {
        this.driver = driver;
    }

    By chooseSizeMlocator = By.xpath("//A[@id = 'size_171640060299']");
    By addToBasketLocator = By.xpath("//INPUT[@id = 'addItemToOrderID']");
    By basketActiveLocator = By.xpath("//I[@class = 'new_ostin_head__basket-icon active']");
    By goToBasketLocator = By.xpath("//A[@class = 'new-ostin__button']");

    public void chooseSizeM()   {
        driver.findElement(chooseSizeMlocator).click();
        System.out.println("-выбрал размер M");
    }
    public void addToBasket()   {
        driver.findElement(addToBasketLocator).click();
        System.out.println("-добавил в корзину");
    }
    public void goToBasket()    {
        driver.findElement(goToBasketLocator).click();
        System.out.println("-перешел в корзину");
    }

}
