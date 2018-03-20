package Tests;

import Pages.MainPage;
import Pages.MyAccount.*;
import Settings.ChromeSettings;
import org.junit.Test;

public class MyCabinetTests extends ChromeSettings{



    @Test
    public void assertMyCabinet() {
        System.out.println("Test assert my cabinet(positive) start");
        LoginTest loginT = new LoginTest();
        loginT.loginTrue(driver);
        MainPage mpage = new MainPage(driver);
        mpage.clickCabinet();
        new MyProfile(driver).assertMyInfo();
        new AddressBook(driver).assertMyAddress();
        new MyOrders(driver).assertMyOrders();
        new Subscriptions(driver).assertMySubscriptions();
        new ClubCard(driver).assertMyInfoClub();
        System.out.println("test seccessful");
    }
    @Test
    public void saveMyProfileInfo() {
        System.out.println("Test save my info start");
        new LoginTest().loginTrue(driver);
        new MainPage(driver).clickCabinet();
        MyProfile mp = new MyProfile(driver);
        mp.writeName();
        mp.writeLastName();
        mp.writeMiddleName();
        mp.selectCity();
        mp.saveChanges();
        System.out.println("Test successful");
    }
    @Test
    public void addAndDeleteAddress() {
        System.out.println("Test addAddress start");
        new LoginTest().loginTrue(driver);
        new MainPage(driver).clickCabinet();
        AddressBook addressB = new AddressBook(driver);
        addressB.assertMyAddress();
        addressB.addAddress();
        addressB.deleteAddress();
        System.out.println("Test Successful");
    }
    @Test
    public void subscriptions() {
        System.out.println("Test click subscriptions start");
        new LoginTest().loginTrue(driver);
        new MainPage(driver).clickCabinet();
        Subscriptions subs = new Subscriptions(driver);
        subs.assertMySubscriptions();
        subs.clickSubscriptions();
        System.out.println("Test Successful");
    }
}
