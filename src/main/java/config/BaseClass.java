package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    static public WebDriver driver;
    @BeforeClass
    public static void startDriver() {
        driver = DriverConfig.createDriver(BrowsersList.Chrome);
    }
    @AfterClass
    public static void endDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }


}
