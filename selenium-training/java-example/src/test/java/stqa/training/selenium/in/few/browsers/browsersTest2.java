package stqa.training.selenium.in.few.browsers;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class browsersTest2 extends browsersBase {

    @Test
    public void Test1() {

        driver2.get("https://test.salesforce.com/");
        driver2.findElement(By.id("forgot_password_link")).click();
        driver2.findElement(By.linkText("Sandbox Login"));
    }

    @Test
    public void Test2() {

        driver2.get("https://test.salesforce.com/");
        driver2.findElement(By.id("forgot_password_link")).click();
        driver2.findElement(By.linkText("Sandbox Login"));
    }

    @Test
    public void Test3() {

        driver2.get("https://test.salesforce.com/");
        driver2.findElement(By.id("forgot_password_link")).click();
        driver2.findElement(By.linkText("Sandbox Login"));
    }
}
