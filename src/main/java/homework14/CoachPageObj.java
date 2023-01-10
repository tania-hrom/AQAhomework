package homework14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CoachPageObj {
    @FindBy(xpath = "//ul[@class=\"block-coaches_list\"]/li")
    List<WebElement> listCoaches;

    public void printListCoaches() {
        for (WebElement l : listCoaches) {
            System.out.println(l.findElement(By.className("coach-card_name")).getText()+" - "+l.findElement(By.className("coach-card_spec")).getText());
        }
    }
    public int getSizeListCoaches()
    {
        return listCoaches.size();
    }
}
