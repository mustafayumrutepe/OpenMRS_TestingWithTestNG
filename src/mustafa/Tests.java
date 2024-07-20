package mustafa;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.MyFunction;

public class Tests extends BaseDriver {
    Elements elm=new Elements();

    @Test
    public void Login(){
        loginTest();
    }

    @Test
    public void PatientRegisteration(){
        Elements elm = new Elements();
        driver.get("https://openmrs.org/");
        elm.demo.click();
        elm.openMRS2.click();
        Actions actions=new Actions(driver);
        actions.sendKeys("Admin").keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("Admin123").build().perform();
        int randomNum= MyFunction.RandomNumberGenerator(6);
        (elm.locations).get(randomNum).click();
        actions.keyDown(Keys.ENTER).keyUp(Keys.ENTER).build().perform();
    }
}
