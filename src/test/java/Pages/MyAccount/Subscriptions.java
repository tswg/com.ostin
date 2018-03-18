package Pages.MyAccount;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Subscriptions {
    protected WebDriver driver;

    public Subscriptions(WebDriver driver) {
        this.driver = driver;
    }

    By mySubscriptionsLocators = By.xpath("//A[@title = 'Мои подписки']");
    By mySubscriptionsLocalLocator = By.xpath("//span[contains(text(), 'МОИ ПОДПИСКИ')]");
    By emailCheckboxLocator = By.xpath("//INPUT[@id = 'subscribeForOstinInfo']");
    By emailBonusCheckboxLocator = By.xpath("//INPUT[@id = 'subscribeForClubProEmailInfo']");
    By smsCheckboxLocator = By.xpath("//INPUT[@id = 'subscribeForClubProSmsInfo']");
    By saveSubscriptionsLocator = By.xpath("//INPUT[@id = 'atg_store_createMyAccount']");

    public void assertMySubscriptions() {
        WebElement mysubscr = driver.findElement(mySubscriptionsLocators);
        Assert.assertEquals("Мои подписки", mysubscr.getAttribute("title"));
        mysubscr.click();
        Assert.assertEquals("wrong", driver.findElement(mySubscriptionsLocalLocator).getText(), "МОИ ПОДПИСКИ");
        System.out.println("-Раздел мои подписки проверен");
    }
    public void clickSubscriptions() {
        driver.findElement(emailCheckboxLocator).click();
        driver.findElement(emailBonusCheckboxLocator).click();
        driver.findElement(smsCheckboxLocator).click();
        driver.findElement(saveSubscriptionsLocator).click();
        System.out.println("-Проверил мои подписки");
    }

}
