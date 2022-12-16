package org.example;

import config.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Main extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://ithillel.ua/");
        driver.findElement(By.xpath("//*[@id=\"body\"]/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"coursesMenuMainContent\"]/div[2]/ul/li[1]/div/ul/li[3]/a/div")).click();
        String city = "Одеса";
        String city2 = "Черкаси";
        checkCity(city);
        checkCity(city2);
        driver.quit();
    }

    private static void checkCity(String city) {
        List <WebElement> elements = driver.findElements(By.cssSelector("a.header-bar-link[data-city-id]"));
        boolean check = false;
        for (WebElement e: elements
             ) {
            if (e.getText().equals(city)){
                check = true;
               break;
            }
        }
        if (check){
            System.out.println("City "+city+" is displayed on the page");
        } else System.out.println("City "+city+" is NOT displayed on the page");
    }
}