package Tests;

import Pages.MainPage;
import Settings.ChromeSettings;
import org.junit.Test;

public class SerachTests extends ChromeSettings{
    @Test
    public void searchTest1()   {
        MainPage searchElem = new MainPage(driver);
        searchElem.clickSearchButton();
        searchElem.searchLine(searchElement1);
    }
}
