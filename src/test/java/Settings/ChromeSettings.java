package Settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ChromeSettings {

    protected  WebDriver driver;
    protected String login = "myhappy13@bk.ru";
    protected String password = "Legion13";
    protected String incorrectLogin = "vovapupkin@gmail.com";
    protected String incorrectpasswd = "VovaPupkinStyle1";
    protected String wrongSymbols = "@#$%^&*((*&^%$#@#$%^&*";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ostin.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void setDown()   {
        driver.quit();
    }
}
