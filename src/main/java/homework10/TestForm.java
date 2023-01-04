package homework10;

import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestForm extends BaseClass {
    @BeforeClass
    public static void openLink(){
        driver.get("https://demoqa.com/automation-practice-form");
    }
    @Test
    public void enterFirstName(){
        driver.findElement(By.id("firstName")).sendKeys("Tania");
    }
    @Test
    public void enterLastName(){
        driver.findElement(By.id("lastName")).sendKeys("Test");
    }
    @Test
    public void enterEmail(){
        driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
    }
    @Test
    public void enterGender(){
       // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]")).click();
    }
}
