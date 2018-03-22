package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    protected WebDriver driver;

    public MainPage(WebDriver driver)   {
        this.driver = driver;
    }

    By townPopUpLocator = By.xpath("//a[@class='hgb_city_popup-button-yes']");
    By titleLocator = By.xpath("//a[@class='noh_logo']");
    By logInLineLocator = By.xpath("//a[@id='loginRef']");
    By emailLineLocator = By.xpath("//input[@id='login']");
    By passLineLocator = By.xpath("//input[@id='pass']");
    By buttonComeInLocator = By.xpath("//input[@id='loginPopupButtonID']");
    By assertLoginNameLocator = By.xpath("//span[contains(text(), 'Николай')]");
    By invalidLoginOrPasswordLocator = By.xpath("//form//div[contains(text(), 'Неверный логин или пароль')]");
    By myCabinetLocator = By.xpath("//A[@id = 'privateCabinet']");
    By searchButtonLocator = By.xpath("//A[@class = 'new_ostin_head__search-icon']");
    By searchLineLocator = By.xpath("//INPUT[@id = 'atg_store_searchInput']");




    public void townPopUpClose() {
        driver.findElement(townPopUpLocator).click();
        System.out.println("-close pop up");
    }
    public void assertTitle()   {
        Assert.assertEquals("Интернет-магазин одежды O’STIN – модная женская, мужская, детская одежда и аксессуары.", driver.findElement(titleLocator).getAttribute("title"));
        System.out.println("-Проверил название страницы");
    }
    public void loginLK()   {
        driver.findElement(logInLineLocator).click();
    }
    public void writeEmail(String email)   {
        WebElement loginline = driver.findElement(emailLineLocator);
        loginline.click();
        loginline.clear();
        loginline.sendKeys(email);
        System.out.println("-ввел емейл");
    }
    public void writePass(String passwd) {
        WebElement passline = driver.findElement(passLineLocator);
        passline.click();
        passline.clear();
        passline.sendKeys(passwd);
        System.out.println("-ввел пароль");
    }
    public void clickComeIn()   {
        driver.findElement(buttonComeInLocator).click();
        System.out.println("-Click to Come In");
    }
    public void assertName()    {
        Assert.assertEquals("not true", driver.findElement(assertLoginNameLocator).getText(), "Николай,");
        System.out.println("-name is true");
    }
    public void invalidLoginOrPasswd()  {
        Assert.assertEquals("incorrect", driver.findElement(invalidLoginOrPasswordLocator).getText(), "Неверный логин или пароль");
        System.out.println("-неверный логин и пароль");
    }
    public void clickCabinet() {
        driver.findElement(myCabinetLocator).click();
        System.out.println("кликнул кнопку личный кабинет");
    }
    public void clickSearchButton() {
        driver.findElement(searchButtonLocator).click();
        System.out.println("-кликнул кнопку Поиск");
    }
    public void searchLine(String searchElement)    {
        WebElement search = driver.findElement(searchLineLocator);
        search.click();
        search.clear();
        search.sendKeys(searchElement);
    }
}
