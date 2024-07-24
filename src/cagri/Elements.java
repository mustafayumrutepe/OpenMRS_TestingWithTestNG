package cagri;

import org.openqa.selenium.support.PageFactory;
import Utility.BaseDriver;

public class Elements extends LocatorPage.Elements {
    public Elements() {PageFactory.initElements(BaseDriver.driver,this);}


}
