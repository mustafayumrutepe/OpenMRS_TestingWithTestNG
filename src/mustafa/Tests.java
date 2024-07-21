package mustafa;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.MyFunction;

import java.security.Key;

public class Tests extends BaseDriver {
    Elements elm=new Elements();

    @Test
    public void Login(){
        loginTest();
    }

    @Test
    public void PatientRegisteration(){
        Actions actions=new Actions(driver);
        Elements elm = new Elements();
        driver.get("https://openmrs.org/");
        elm.demo.click();
        elm.openMRS2.click();
        actions.sendKeys("Admin").keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("Admin123").build().perform();
        int randomNum= MyFunction.RandomNumberGenerator(6);
        (elm.locations).get(randomNum).click();
        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
        elm.registerPatient.click();
        actions.sendKeys("beybun",Keys.TAB,Keys.TAB,"kulilk",Keys.TAB).build().perform();
        elm.gender.click();
        actions.sendKeys(Keys.TAB,"3",Keys.TAB,"d",Keys.TAB,"1944",Keys.TAB).build().perform();
        actions.sendKeys(Keys.TAB,"Amed",Keys.TAB,Keys.TAB,Keys.TAB,"Semsur",Keys.TAB,Keys.TAB,Keys.TAB,"12345",Keys.TAB).build().perform();

        Select select=new Select(elm.relationship);
        select.selectByVisibleText("Parent");
        elm.personName.sendKeys("mustafa",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);

        Assert.assertTrue(elm.verification.getText().toLowerCase().equals("beybun"), "The patient name not registered ");
    }

    @Test
    public void FindPatientRecord(){
        loginTest();
        Elements elm = new Elements();
        elm.patientRecord.click();

    }
}
