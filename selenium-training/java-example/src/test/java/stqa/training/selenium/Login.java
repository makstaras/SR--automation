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

public class Login {

    private WebDriver driverCH;
    private WebDriver driverMF;
    private WebDriver driverIE;
    private WebDriverWait wait;
/*
    ////CHROME
    @Before
    public void start1() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        driverCH = new ChromeDriver();
        driverCH.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait (driverCH, 10);
    }

    @Test
    public void myFirstTest1() {

        driverCH.get("https://test.salesforce.com/");
        driverCH.findElement(By.id("username")).sendKeys("sanantonio.coordinator@meritagehomes.com.uat");
        driverCH.findElement(By.id("password")).sendKeys("Meritage17_@2");
        driverCH.findElement(By.id("Login")).click();
        wait.until(titleIs("Details - Console"));

    }

    @After
    public  void stop1() {
        driverCH.quit();
        driverCH = null;
    }

    ////FIREFOX
    @Before
    public void start2() {
        System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe") ;
        driverMF = new FirefoxDriver();
        driverMF.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait (driverMF, 10);
    }

    @Test
    public void myFirstTest2() {

        driverMF.get("https://test.salesforce.com/");
        driverMF.findElement(By.id("username")).sendKeys("sanantonio.coordinator@meritagehomes.com.uat");
        driverMF.findElement(By.id("password")).sendKeys("Meritage17_@2");
        driverMF.findElement(By.id("Login")).click();
        wait.until(titleIs("Details - Console"));

    }

    @After
    public  void stop2() {
        driverMF.quit();
        driverMF = null;
    }
*/
    ///INTERNET EXPLORER
    @Before
    public void start3() {
        System.setProperty("webdriver.ie.driver", "c:\\IEDriverServer.exe") ;
        driverIE = new InternetExplorerDriver();
        driverIE.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait (driverIE, 10);
    }

    @Test
    public void myFirstTest3() {

        driverIE.get("https://test.salesforce.com/");
        driverIE.findElement(By.id("username")).sendKeys("sanantonio.coordinator@meritagehomes.com.uat");
        driverIE.findElement(By.id("password")).sendKeys("Meritage17_@2");
        driverIE.findElement(By.id("Login")).click();
        wait.until(titleIs("Details - Console"));

    }

    @After
    public  void stop3() {
        driverIE.quit();
        driverIE = null;
    }
}
