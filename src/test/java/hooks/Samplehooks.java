package hooks;

import Driverf.Driverfactory;
import io.cucumber.java.Before;

public class Samplehooks  extends Driverfactory{
    @Before
    public void open(){
        Browseropen("edge");
    }

    public void close(){
        driver.quit();
    }
}
