package cagri;

import org.openqa.selenium.support.PageFactory;
import utility.BaseDriver;

public class Elements extends mustafa.Elements {
    public Elements() {PageFactory.initElements(BaseDriver.driver,this);}


}
