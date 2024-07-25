package cagri;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class Tests extends BaseDriver {
    @Test(groups = ("Smoke"))
    public void CheckingToSystemErrors(){
        OpenWebsite();

    }
    
}
