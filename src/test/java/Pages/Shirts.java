package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Shirts {
    protected WebDriver driver;
    public Shirts(WebDriver driver) {
        this.driver = driver;
    }
    By shirtOneNumberLocator = By.xpath("//A[@id = 'p_20240050299_link']/DIV[1]/IMG[1]");

    public void clickShirtOne() {
        driver.findElement(shirtOneNumberLocator).click();
        System.out.println("-кликнул на рубашку в клетку");
    }
}
