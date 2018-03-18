package Pages.MyAccount;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClubCard {
    protected WebDriver driver;

    public ClubCard(WebDriver driver) {
        this.driver = driver;
    }

    By myInfoClubLocator = By.xpath("//LI[child::A[contains(text(), 'Мои данные')]]/A[@href = '/ru/ru/secured/myaccount/myAccountMain.jsp?selpage=CLUBCARD']");
    By myInfoClubLocalLocator = By.xpath("//SPAN[contains(text(), 'КЛУБНАЯ ПРОГРАММА > МОИ ДАННЫЕ')]");

    public void assertMyInfoClub() {
        WebElement myInfoClub = driver.findElement(myInfoClubLocator);
        Assert.assertEquals("wrong", myInfoClub.getText(), "Мои данные");
        myInfoClub.click();
        Assert.assertEquals("wrong", driver.findElement(myInfoClubLocalLocator).getText(), "КЛУБНАЯ ПРОГРАММА > МОИ ДАННЫЕ");
        System.out.println("Раздел мои данные(клуб) проверен");
    }

}
