package Tests;

import Pages.MainPage;
import Settings.ChromeSettings;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class LoginTest extends ChromeSettings{


    public void loginTrue(WebDriver driver) {
        System.out.println("Test login(positive) start");
        MainPage mpage = new MainPage(driver);
        mpage.townPopUpClose();
        mpage.assertTitle();
        mpage.loginLK();
        mpage.writeEmail(login);
        mpage.writePass(password);
        mpage.clickComeIn();
        mpage.assertName();
        System.out.println("test successful");
    }
    @Test
    public void loginAndPasswdEmptyValue() {
        System.out.println("Test login (negative) Empty login and password value");
        MainPage mpage = new MainPage(driver);
        mpage.townPopUpClose();
        mpage.assertTitle();
        mpage.loginLK();
        mpage.clickComeIn();
        mpage.invalidLoginOrPasswd();
        System.out.println("test seccessful");
    }
    @Test
    public void loginAndPasswdIncorrect() {
        System.out.println("Test login (negative) Incorrect password and login");
        MainPage mpage = new MainPage(driver);
        mpage.townPopUpClose();
        mpage.assertTitle();
        mpage.loginLK();
        mpage.writeEmail(incorrectLogin);
        mpage.writePass(incorrectpasswd);
        mpage.clickComeIn();
        mpage.invalidLoginOrPasswd();
        System.out.println("test successful");
    }
    @Test
    public void wrongSymbolsLoginAndPasswd() {
        System.out.println("Test login (negative) wrong Symbols password and login");
        MainPage mpage = new MainPage(driver);
        mpage.townPopUpClose();
        mpage.assertTitle();
        mpage.loginLK();
        mpage.writeEmail(wrongSymbols);
        mpage.writePass(wrongSymbols);
        mpage.clickComeIn();
        mpage.invalidLoginOrPasswd();
        System.out.println("test successful");
    }
}
