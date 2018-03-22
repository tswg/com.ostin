package Tests;

import Pages.MainPage;
import Pages.Search;
import Settings.ChromeSettings;
import org.junit.Test;

public class SearchTests extends ChromeSettings {
    @Test
    public void searchTest1()   {
        MainPage searchElem = new MainPage(driver);
        searchElem.townPopUpClose();
        searchElem.clickSearchButton();
        searchElem.searchLine(searchElement1);
        Search searchTest = new Search(driver);
        searchTest.setBasicShirtLocator();
        searchTest.assertBasicShirt();
    }
}
