package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Project_3_ChromeBrowserTest {

    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Launchthe the URL
        driver.get("http://the-internet.herokuapp.com/login");

        //Maximum Window
        driver.manage().window().maximize();

        //We give implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is :" + title);

        //Get Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        //Get page saurce
        System.out.println("Page source: " + driver.getPageSource());

        //Find the email field element
        WebElement emailField = driver.findElement(By.id("username"));
        //Type email to email field
        emailField.sendKeys("nimisha1234");

        //Find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("test1234");

        //Close the browser
        //driver.quit();
    }
}
