package cagri;

import LocatorPage.Elements;
import Utility.BaseDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        wait.until(ExpectedConditions.elementToBeClickable(elm.Username));
        elm.Username.sendKeys("");
        elm.password.sendKeys("deneme1");
        elm.location.click();
        elm.LoginButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(elm.Username));
        elm.Username.sendKeys("deneme1");
        elm.password.sendKeys("deneme1");
        elm.location.click();
        elm.LoginButton.click();

        OpenMyAccount();


    }
    @Test(groups = {"Smoke"})
    public void LogoutFromTheSystem(){
        OpenMyAccount();
        Elements elm=new Elements();
        elm.logout.click();
        Assert.assertTrue(elm.LoginButton.isEnabled(),"Test pass");
    }

    @Test(groups = {"Smoke"})
    public void MyAccount(){
        OpenMyAccount();
        Elements elm=new Elements();
        elm.admin.click();
        elm.MyAccount.click();
        wait.until(ExpectedConditions.elementToBeClickable(elm.ChangePasswords));

    }
    
}
