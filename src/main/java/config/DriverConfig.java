package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class DriverConfig {
    private static WebDriver driver;

    public static WebDriver createDriver(BrowsersList browser) {
        if (driver == null) {
            switch (browser) {
                case Chrome -> createChrome();
                case ChromeIncognito -> createChromeIncognito();
                case ChromeWithAddBlock -> createChromeWithAddBlock();
                case FireFox -> createFireFox();
            }
        }
        return driver;
    }

    private static void createChromeWithAddBlock() {
        String pathToExtension = "/Users/tetiana/webDrivers/extaddblock.crx";
        ChromeOptions options=new ChromeOptions();
        options.addExtensions(new File(pathToExtension));
        options.addArguments("--start-maximized");
        options.addArguments("–-load-extension=" + pathToExtension);
        driver=new ChromeDriver(options);
    }

    private static void createFireFox() {
        driver=new FirefoxDriver();
        driver.manage().window().maximize();
    }

    private static void createChromeIncognito() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");//open chrome in incognito made
        options.addArguments("--start-maximized");//open chrome in window max
        driver=new ChromeDriver(options);
    }

    private static void createChrome() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
}
