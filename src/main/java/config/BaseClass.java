package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

    public static WebDriver driver = initDriverChrome();

    private static WebDriver initDriverChrome() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }


}
