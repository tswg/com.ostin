package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

    protected WebDriver driver;

    public Search(WebDriver driver) {
        this.driver = driver;
    }
    By basicShirtLocator = By.xpath("//A[@id = 'p_19844590299_link']/DIV[1]/IMG[1]");
    By assertBasicShirtLocator = By.xpath("//SPAN[contains(text(), 'MT6S14')]");

    public void setBasicShirtLocator()  {
        driver.findElement(basicShirtLocator).click();
        System.out.println("Кликнул на базовую футболку");
    }
    public void assertBasicShirt()  {
        Assert.assertEquals("wrong", driver.findElement(assertBasicShirtLocator).getText(), "MT6S14");
        System.out.println("-Проверил базовую футболку");
    }
}
