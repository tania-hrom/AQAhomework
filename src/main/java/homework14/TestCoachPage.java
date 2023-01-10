package homework14;

import config.BaseClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import utils.ScrollPage;

public class TestCoachPage extends BaseClass {
    static IndexPageObj indexPage= PageFactory.initElements(driver, IndexPageObj.class);
    static CoachPageObj coachPage= PageFactory.initElements(driver, CoachPageObj.class);

    @Before
    public  void setUpBeforeTestMainScreen(){
        if(!driver.getCurrentUrl().contains("https://dnipro.ithillel.ua/"))
        {
            driver.get("https://dnipro.ithillel.ua/");
        }
        indexPage.aboutSchoolButtonClick();
        indexPage.coachesButtonClick();
    }
    @Test
    public void printCoach() throws InterruptedException {
        int i=0;
        while(true){
            if(coachPage.getSizeListCoaches()>i){
                i= coachPage.getSizeListCoaches();
                ScrollPage.scroll(driver);
                Thread.sleep(1000);
            }else {
                break;
            }
        }
        coachPage.printListCoaches();
    }
}
