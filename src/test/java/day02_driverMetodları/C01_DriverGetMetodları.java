package day02_driverMetodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMetodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        //sisteme webdriver in ne olacağını ve bu driver in hangi dosya yolunda olduğunu söyler
        WebDriver driver = new ChromeDriver();
        //
        driver.get("https://www.amazon.com");
        Thread.sleep(5000);

        driver.getTitle();
        driver.getCurrentUrl();
        // System.out.println(driver.getPageSource());

        driver.getWindowHandle();
        driver.getWindowHandles();
        driver.close();
    }
}
