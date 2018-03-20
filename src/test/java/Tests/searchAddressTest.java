package Tests;

import Pages.Stores;
import Settings.ChromeSettings;
import org.junit.Test;

public class searchAddressTest extends ChromeSettings {

    @Test
    public void searchAddressTest1() {
        System.out.println("Test search ahop address start");
        new LoginTest().loginTrue(driver);
        Stores store = new Stores(driver);
        store.assertStoresAddress();
        store.ChooseShopCountry();
        store.chooseShopCity();
        store.chooseShopType();
        store.assertChoose();
    }
}
