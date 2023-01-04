package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageJavaBasic{
    By courseTitle = By.className("course-descriptor_header-text");
    By courseRate = By.className("course-rating_average");
    By courseDescription = By.className("profession-bar_descr");

    public PageJavaBasic(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;

    public String getCourseTitle(){
        return driver.findElement(courseTitle).getText();
    }
    public String getCourseRate(){
        return driver.findElement(courseRate).getText();
    }
    public String getCourseDescription(){
        return driver.findElement(courseDescription).getText();
    }
}
