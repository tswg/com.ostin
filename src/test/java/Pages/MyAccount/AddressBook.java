package Pages.MyAccount;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressBook {
    protected WebDriver driver;

    public AddressBook(WebDriver driver) {
        this.driver = driver;
    }

    By myAddressLocator = By.xpath("//A[@title = 'Мои адреса']");
    By myAddressLocalLocator = By.xpath("//SPAN[contains(text(), 'МОИ АДРЕСА')]");
    By addAddressButtonLocator = By.xpath("//A[@id = 'newAddressLink']");
    By addAddressNamelineLocator = By.xpath("//INPUT[@id = 'atg_store_editAddressNickname']");
    By addHomeNumberLocator = By.xpath("//INPUT[@id = 'atg_store_houseAddressInput_house']");
    By addTelephoneNumberLocator = By.xpath("//INPUT[@id = 'atg_store_telephoneInput']");
    By saveButtonLocator = By.xpath("//INPUT[@id = 'atg_store_editAddressSubmit']");
    By deleteButtonLocator = By.xpath("//a[@class = 'atg_store_addressBookDefaultEdit']");
    By deleteButtonConfirmationLocator = By.xpath("//INPUT[@id = 'atg_store_editAddressSubmit']");

    public void assertMyAddress() {
        WebElement myaddress = driver.findElement(myAddressLocator);
        Assert.assertEquals("Мои адреса", myaddress.getAttribute("title"));
        myaddress.click();
        Assert.assertEquals("wrong", driver.findElement(myAddressLocalLocator).getText(), "МОИ АДРЕСА");
        System.out.println("-Раздел мои адреса проверен");
    }
    public void addAddress() {
        driver.findElement(addAddressButtonLocator).click();
        WebElement addressName = driver.findElement(addAddressNamelineLocator);
        addressName.click();
        addressName.clear();
        addressName.sendKeys("Тестовая улица");
        System.out.println("-Ввел название адреса");
        WebElement homeNumber = driver.findElement(addHomeNumberLocator);
        homeNumber.click();
        homeNumber.clear();
        homeNumber.sendKeys("30");
        System.out.println("-ввел номер дома");
        WebElement addTelephone = driver.findElement(addTelephoneNumberLocator);
        addTelephone.click();
        addTelephone.clear();
        addTelephone.sendKeys("9177777777");
        System.out.println("-Ввел номер телефона");
        driver.findElement(saveButtonLocator).click();
        System.out.println("-Добавил адрес доставки");
    }
    public void deleteAddress() {
        driver.findElement(deleteButtonLocator).click();
        driver.findElement(deleteButtonConfirmationLocator).click();
        System.out.println("-Удалил адрес доставки");
    }
}
