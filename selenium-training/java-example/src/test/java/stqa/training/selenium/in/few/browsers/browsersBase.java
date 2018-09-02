package stqa.training.selenium.in.few.browsers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class browsersBase {

    public static WebDriver driver;
    public static WebDriver driver2;
    public static WebDriver driver3;
    public WebDriverWait wait;

    @Before
    public void start() {
        if (driver != null){
            return;
        }
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait (driver, 500);

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> { driver.quit(); driver = null;})
        );

        if (driver2 != null){
            return;
        }
        System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe") ;
        driver2 = new FirefoxDriver();
        wait = new WebDriverWait (driver2, 500);

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> { driver2.quit(); driver2 = null;})
        );

        if (driver3 != null){
            return;
        }
        System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe") ;
        driver3 = new InternetExplorerDriver();
        wait = new WebDriverWait (driver3, 500);

        Runtime.getRuntime().addShutdownHook(
                new Thread(() -> { driver3.quit(); driver3 = null;})
        );

    }

    @After
    public  void stop() {
        //driver.quit();
        //driver = null;
    }
}
