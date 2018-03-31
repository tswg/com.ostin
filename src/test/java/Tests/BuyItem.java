package Tests;

import Pages.Basket;
import Pages.ItemPage;
import Pages.MainPage;
import Pages.Shirts;
import Settings.ChromeSettings;
import org.junit.Test;

public class BuyItem extends ChromeSettings{

    @Test
    public void buyShirt() {
        MainPage shirt = new MainPage(driver);
        shirt.townPopUpClose();
        shirt.clickMenList();
        shirt.clickShirtList();
        new Shirts(driver).clickShirtOne();
        ItemPage shirtOne = new ItemPage(driver);
        shirtOne.chooseSizeM();
        shirtOne.addToBasket();
        shirtOne.goToBasket();
        new Basket(driver).deleteItem();
        new Basket(driver).assertBusketDel();
        System.out.println("Test successful");
    }
}
