package stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class myFirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
      //  System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe") ;
      //  System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe") ;
        driver = new ChromeDriver();
      //  driver = new FirefoxDriver();
      //  driver = new InternetExplorerDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait (driver, 10);
    }

    @Test
    public void myFirstTest1() {

        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("webdriver");
        //приклад driver.findElement(By.name("btnG")).click();
        //екранна клава
        driver.findElement(By.id("gs_ok0")).click();
        driver.findElement(By.id("K49")).click();
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("Зображення")).click();
        wait.until(titleIs("webdriver1 - Пошук Google"));
    }

    @After
    public  void stop() {
        driver.quit();
        driver = null;
    }
}
