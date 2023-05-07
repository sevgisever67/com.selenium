package myStudy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class RelatiiveLocator {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");
        WebElement manti = driver.findElement(By.id("pid10_thumb"));
        WebElement amsterdam = driver.findElement(RelativeLocator.with(By.className("ui-li-thumb")).toLeftOf(manti));
        System.out.println("amsterdam.getAttribute(\"id\") = " + amsterdam.getAttribute("id"));

        driver.quit();
    }
    }
