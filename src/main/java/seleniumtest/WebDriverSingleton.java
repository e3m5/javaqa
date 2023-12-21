
package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSingleton {
    static WebDriver instance = null;



    public static WebDriver getChromeDriver() {
        if (instance == null) {
            ChromeOptions options = new ChromeOptions();
            instance = new ChromeDriver(options);
            instance.manage().window().maximize();
            return instance;
        } else {
            return instance;
        }
    }
}

