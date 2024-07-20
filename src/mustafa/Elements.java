package mustafa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.BaseDriver;

import java.util.List;

public class Elements {
    public Elements() {PageFactory.initElements(BaseDriver.driver,this);}

    @FindBy(xpath = "//*[text()='Demo']")
    public WebElement demo;

    @FindBy(xpath = "//*[text()='Enter the OpenMRS 2 Demo']")
    public WebElement openMRS2;

    @FindBy(xpath = "//ul[@id='sessionLocation']//li")
    public List<WebElement> locations;

}
