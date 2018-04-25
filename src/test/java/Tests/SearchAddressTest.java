package Tests;

import Pages.MainPage;
import Pages.Stores;
import Settings.ChromeSettings;
import org.junit.Test;

public class SearchAddressTest extends ChromeSettings {

    @Test
    public void searchAddressTest1() throws InterruptedException {
        System.out.println("Test search shop address start");
        new MainPage(driver).townPopUpClose();
        Stores store = new Stores(driver);
        store.assertStoresAddress();
        store.ChooseShopCountry();
        store.chooseShopCity();
        store.chooseShopType();
        Thread.sleep(5000);
        store.assertChoose();
    }
}
