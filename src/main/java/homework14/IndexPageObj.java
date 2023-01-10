package homework14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPageObj {
    @FindBy(xpath = "//li[contains(@class,\"site-nav-menu_item\") and contains(@class,\"-submenu\")]")
    WebElement aboutSchoolButton;
    @FindBy(partialLinkText = "Викладачі")
    WebElement coachesButton;

    public void aboutSchoolButtonClick(){
        aboutSchoolButton.click();
    }
    public void coachesButtonClick(){
        coachesButton.click();
    }
}
