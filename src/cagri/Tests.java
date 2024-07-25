package cagri;

import LocatorPage.Elements;
import Utility.BaseDriver;
import Utility.MyFunction;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends BaseDriver {
    @Test(groups = ("Smoke"))
    public void CheckingToSystemErrors(){
        Elements elm=new Elements();
        OpenWebsite();
        elm.Username.sendKeys("deneme1");
        elm.password.sendKeys("");
        elm.location.click();
        elm.LoginButton.click();

        MyFunction.OptionalWait(2);
        elm.Username.sendKeys("");
        elm.password.sendKeys("deneme1");
        elm.location.click();
        elm.LoginButton.click();

        MyFunction.OptionalWait(2);
        elm.Username.sendKeys("deneme1");
        elm.password.sendKeys("deneme1");
        elm.location.click();
        elm.LoginButton.click();

        MyFunction.OptionalWait(2);
        elm.Username.sendKeys("Admin");
        elm.password.sendKeys("Admin123");
        elm.location.click();
        elm.LoginButton.click();
    }
    
}
