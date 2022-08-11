package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverInstance implements DriverStrategy{
    public WebDriver setStrategy(){
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
      //  EdgeDriver driver = new EdgeDriver();
        return new EdgeDriver();
    }
}
