package myStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_GetMetodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        Thread.sleep(5000);
        String title=driver.getTitle();
        String expectedResult="Facebook";

        if (title.contains(expectedResult)){
            System.out.println("verify");
        }else {
            System.out.println("facebook");
        }

        String url=driver.getCurrentUrl();
        if (url.contains(expectedResult)){
            System.out.println("url facebook kelimesi içeriyor");
        }{
            System.out.println(url);
        }

        driver.get("https://www.walmart.com/");
        Thread.sleep(5000);
        String title1=driver.getTitle();
        String expectedResult2="Walmart.com";
        if (title.contains(expectedResult2)) {
            System.out.println("sayfa başlığı walmart içerir");
        }
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.close();




    }
}
