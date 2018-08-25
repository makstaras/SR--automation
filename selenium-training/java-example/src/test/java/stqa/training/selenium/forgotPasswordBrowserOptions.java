package stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class forgotPasswordBrowserOptions {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        //ініціалізація всіх capabilites браузера
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        //driver = new ChromeDriver(options); автоматично, але можна і так + додаткові capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(caps);
        wait = new WebDriverWait (driver, 10);
    }

    @Test
    public void myFirstTest1() {

        driver.get("https://test.salesforce.com/");
        driver.findElement(By.id("forgot_password_link")).click();
        wait.until(titleIs("Forgot Your Password | Salesforce"));
    }

    @After
    public  void stop() {
        driver.quit();
        driver = null;
    }
}
