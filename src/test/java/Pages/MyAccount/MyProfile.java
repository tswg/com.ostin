package Pages.MyAccount;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyProfile {
    protected WebDriver driver;

    public MyProfile(WebDriver driver) {
        this.driver = driver;
    }

    By myInfoLocator = By.xpath("//A[@title = 'Мои данные']");
    By myInfoLocalLocator = By.xpath("*//DIV[@class = 'h2 b-page-title custAccount']/SPAN[node() = 'Мои данные']");
    By firstNameLineLocator = By.xpath("//INPUT[@id = 'atg_store_registerFirstName']");
    By lastNameLineLocator = By.xpath("//INPUT[@name='/com/ostin/profile/OstinProfileFormHandler.value.lastName']");
    By middleNameLineLocator = By.xpath("//input[@name='/com/ostin/profile/OstinProfileFormHandler.value.middleName']");
    By saveChangesLocator = By.xpath("//input[@name='registration-update']");

    public void assertMyInfo() {
        WebElement myinfo = driver.findElement(myInfoLocator);
        Assert.assertEquals("Мои данные", myinfo.getAttribute("title"));
        myinfo.click();
        Assert.assertEquals("wrong", driver.findElement(myInfoLocalLocator).getText(), "МОИ ДАННЫЕ");
        System.out.println("Раздел мои данные проверен");
    }
    public void writeName() {
        WebElement fname = driver.findElement(firstNameLineLocator);
        fname.click();
        fname.clear();
        fname.sendKeys("Николай");
        System.out.println("-ввел имя");
    }
    public void writeLastName() {
        WebElement lname = driver.findElement(lastNameLineLocator);
        lname.click();
        lname.clear();
        lname.sendKeys("Наумов");
        System.out.println("-ввел фамилию");
    }
    public void writeMiddleName() {
        WebElement mname = driver.findElement(middleNameLineLocator);
        mname.click();
        mname.clear();
        mname.sendKeys("Николаевич");
        System.out.println("-ввел отчество");
    }
    public void selectCity() {
        driver.findElement(By.xpath("//div[@class='cuedsel']//input[@type='text']")).click();
        driver.findElement(By.xpath("//div[@class='cuedsel-scroll-pane']//span[contains(text(), 'Уфа')]"));
        System.out.println("-Выбрал город Уфа");
    }
    public void saveChanges() {
        driver.findElement(saveChangesLocator).click();
        System.out.println("-Сохранил изменения");
    }
}
