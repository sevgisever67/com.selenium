package day02_driverMetodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverNavigateMetodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://amazon.com");
        Thread.sleep(2000);
       driver.navigate().to("http://wisequarter.com");
      // Thread.sleep(2000);
      // driver.navigate().back();
      // Thread.sleep(2000);

      // driver.navigate().forward();
      // driver.navigate().refresh();

        driver.switchTo();
       // driver.close();

    }

}
