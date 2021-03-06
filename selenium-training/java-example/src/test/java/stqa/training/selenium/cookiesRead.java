package stqa.training.selenium;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Cookie;

public class cookiesRead{


    public static void main(String[] args)
    {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:///chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");


        // Input Email id and Password If you are already Register
        driver.findElement(By.name("username")).sendKeys("abc123");
        driver.findElement(By.name("password")).sendKeys("123xyz");
        driver.findElement(By.name("submit")).click();
        /*driver.get("https://test.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("sanantonio.coordinator@meritagehomes.com.uat");
        driver.findElement(By.id("password")).sendKeys("Meritage17_@2");
        driver.findElement(By.id("Login")).click();*/

        // create file named Cookies to store Login Information
        File file = new File("Cookies.data");
        try
        {
            // Delete old file if exists
            file.delete();
            file.createNewFile();
            FileWriter fileWrite = new FileWriter(file);
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);
            // loop for getting the cookie information

            // loop for getting the cookie information
            for(Cookie ck : driver.manage().getCookies())
            {
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
                Bwrite.newLine();
            }
            Bwrite.close();
            fileWrite.close();

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}