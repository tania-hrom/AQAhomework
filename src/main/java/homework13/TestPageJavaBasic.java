package homework13;

import config.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.PageJavaBasic;

public class TestPageJavaBasic extends BaseClass {
    static PageJavaBasic pageJavaBasic;
    @BeforeClass
    public static void initialTest(){
        driver.get("https://ithillel.ua/courses/java-basic");
        pageJavaBasic=new PageJavaBasic(driver);
    }
    @Test
    public void test1(){
        System.out.println(pageJavaBasic.getCourseTitle());
    }
    @Test
    public void test2(){
        System.out.println(pageJavaBasic.getCourseRate());
    }
    @Test
    public void test3(){
        System.out.println(pageJavaBasic.getCourseDescription());
    }
}
