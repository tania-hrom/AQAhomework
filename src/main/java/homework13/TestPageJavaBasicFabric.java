package homework13;

import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.PageJavaBasicPageFactory;

public class TestPageJavaBasicFabric extends BaseClass {
    static PageJavaBasicPageFactory pageFactory;
    @BeforeClass
    public static void start(){
        driver.get("https://ithillel.ua/courses/java-basic");
        pageFactory=new PageJavaBasicPageFactory(driver);
    }
    @Test
    public void test1(){
        pageFactory.getCourseTitle();
    }
    @Test
    public void test2(){
        pageFactory.getCourseRate();
    }
    @Test
    public void test3(){
        pageFactory.getCourseDescription();
    }
}
