package Pages;

import Tests.MyCabinetTests;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Stores extends MyCabinetTests {
    protected WebDriver driver;

    public Stores(WebDriver driver) {
        this.driver = driver;
    }

    By storesAddressLocator = By.xpath("//A[@href = '/ru/ru/stores']");
    By assertStoresLocator = By.xpath("//DIV[contains(node(), 'Адреса магазинов')]");
    By formatSelectLocator = By.xpath("//select[@id='format']");
    By countrySelectLocator = By.xpath("//SELECT[@id = 'country']");
    By citySelectLocator = By.xpath("//SELECT[@id = 'city']");
    By assertFormatLocator = By.xpath("//DIV[@class = 'scoresResult scoresPage']/DIV[child::SPAN[contains(text(), 'Формат')]]/text()[1]");
    By assertAddressLocator = By.xpath("//DIV[@class = 'scoresResult scoresPage']/DIV[8]/text()[1]");

    public void assertStoresAddress() {
        driver.findElement(storesAddressLocator).click();
        Assert.assertEquals("wrong", driver.findElement(assertStoresLocator).getText(), "АДРЕСА МАГАЗИНОВ");
        System.out.println("Проверил адреса магазинов");
    }
    public void chooseShopType() {
        WebElement selectFormat = driver.findElement(formatSelectLocator);
        getSelect(selectFormat).selectByVisibleText("O'STIN Дисконт");
        System.out.println("-выбрал тип");
    }
    public void ChooseShopCountry() {
        WebElement selectCountry = driver.findElement(countrySelectLocator);
        getSelect(selectCountry).selectByVisibleText("Россия");
        System.out.println("-выбрал Страну");
    }
    public void chooseShopCity() {
        WebElement selectCity = driver.findElement(citySelectLocator);
        getSelect(selectCity).selectByVisibleText("Уфа");
        System.out.println("-Выбрал город");
    }
    public void assertChoose() {
        Assert.assertEquals("wrong", driver.findElement(assertFormatLocator).getText(), "O'STIN Дисконт");
        System.out.println("-проверил формат магазина");
        Assert.assertEquals("wrong", driver.findElement(assertAddressLocator).getText(), "г. Уфа, ул. Менделеева, д.137, ТЦ \"Иремель\"");
        System.out.println("-проверил адрес магазина");
    }
}
