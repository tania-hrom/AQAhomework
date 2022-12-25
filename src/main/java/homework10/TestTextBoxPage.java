package homework10;

import config.BaseClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TestTextBoxPage extends BaseClass {

    @BeforeClass
    public static void openLink(){
        driver.get("https://demoqa.com/text-box");
    }
    @Test
    public void enterName(){
       driver.findElement(By.id("userName")).sendKeys("Tania Test");
    }
    @Test
    public void enterEmail(){
        driver.findElement(By.id("userEmail")).sendKeys("test@gmail.com");
    }
    @Test
    public void enterCurrentAddress(){
        driver.findElement(By.id("currentAddress")).sendKeys("Kyiv, Khreshatyk str, 12/123");
    }
    @Test
    public void enterPermanentAddress(){
        driver.findElement(By.id("permanentAddress")).sendKeys("Kharkiv, Sumska str, 56/1");
    }
    @AfterClass
    public static void submitForm(){
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.id("submit")).click();
        if (driver.findElement(By.id("output")).isDisplayed()){
            System.out.println("form is accepted! here is your entered data:");
            System.out.println(driver.findElement(By.id("output")).getText());
        }
        else System.out.println("form is not accepted, please re-check your data!");
    }

}
