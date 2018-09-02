package stqa.training.selenium.in.few.browsers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class browsersTest1 extends browsersBase {

    @Test
    public void Test1() {

        driver.get("https://test.salesforce.com/");
        driver.findElement(By.id("forgot_password_link")).click();
        driver.findElement(By.linkText("Sandbox Login"));
    }

    @Test
    public void Test2() {

        driver.get("https://test.salesforce.com/");
        driver.findElement(By.id("forgot_password_link")).click();
        driver.findElement(By.linkText("Sandbox Login"));
    }

    @Test
    public void Test3() {

        driver.get("https://test.salesforce.com/");
        driver.findElement(By.id("forgot_password_link")).click();
        driver.findElement(By.linkText("Sandbox Login"));
    }
}
