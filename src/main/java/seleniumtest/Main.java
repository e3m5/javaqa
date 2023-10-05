package seleniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args){
        System.setProperty("web-driver.chrome.driver","C:\\Users\\uczen\\Downloads\\chrome-win64\\chrome-win64");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);

        }
    }
