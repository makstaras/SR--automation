package stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class Cookies {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait (driver, 10);
    }

    @Test
    public void myFirstTest1() {
        driver.get("https://test.salesforce.com/");
        Set<Cookie> cookieSet = driver.manage().getCookies();
        //get count of cookies
        System.out.println("Count of cookies = "+cookieSet.size());
        //get list of cookies
        Iterator<Cookie> iterCookie = cookieSet.iterator();
        while(((Iterator) iterCookie).hasNext()){
            System.out.println("Cookie item: "+iterCookie.next());
        }
    }

    @After
    public  void stop() {
        driver.quit();
        driver = null;
    }
}
