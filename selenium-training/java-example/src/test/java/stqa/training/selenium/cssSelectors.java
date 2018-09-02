package stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class cssSelectors {

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

        driver.get("https://test.salesforce.com/");
        driver.findElement(By.cssSelector("[name=Login]")); //загальна формула для cssSelectors (атрибут)
        driver.findElement(By.cssSelector("#Login")); //by id
        driver.findElement(By.cssSelector(".standard_logo")); //by class
        driver.findElement(By.cssSelector("[name=logo].standard_logo")); //подвійний пошук (атрибут, клас)
        driver.findElement(By.cssSelector("label.label[for=password]")); //потрійний пошук (тег, клас, атрибут)
        driver.findElement(By.cssSelector("label:not([for=password])")); //пошук з запереченням (всі лейбл (теги), але в яких атрибут не password
        driver.findElements(By.cssSelector("a:not([href^=http])")); //пошук локальних лінків
        driver.findElements(By.cssSelector("li:last-child")); //список всіх останніх пунктів в списках
        driver.findElements(By.cssSelector("div#jsn-page li:first-child")); //пошук перших елементів списку в елементі з id jsn-page
        driver.findElements(By.cssSelector("div#jsn-page > ul li:first-child")); //пошук перших елементів списку в елементі з jsn-page->ul
    }

    @After
    public  void stop() {
        driver.quit();
        driver = null;
    }
}
