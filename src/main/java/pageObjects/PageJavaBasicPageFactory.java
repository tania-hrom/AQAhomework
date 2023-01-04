package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageJavaBasicPageFactory {
    @FindBy(className = "course-descriptor_course-text")
    WebElement courseTitle;
    @FindBy(className = "course-rating_average")
    WebElement courseRate;
    @FindBy(className = "profession-bar_descr")
    WebElement courseDescription;

    public PageJavaBasicPageFactory(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String getCourseTitle(){
        return courseTitle.getText();
    }
    public String getCourseRate(){
        return courseRate.getText();
    }
    public String getCourseDescription(){
        return courseDescription.getText();
    }

}
