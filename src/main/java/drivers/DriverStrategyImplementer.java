package drivers;

import org.openqa.selenium.WebDriver;

public class DriverStrategyImplementer implements DriverStrategy {
    public static DriverStrategy chooseStrategy(String strategy){
        switch (strategy){
            case "Chrome":
                return new ChromeInstance();

            case "EdgeDriver":
               return new EdgeDriverInstance();

            default:
                return null;
        }
    }

    @Override
    public WebDriver setStrategy() {
        return null;
    }
}
