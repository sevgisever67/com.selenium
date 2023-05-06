package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P03 {
    public static void main(String[] args) {
        /* ...Exercise3...
      Navigate to  https://testpages.herokuapp.com/styled/index.html
      Click on  Calculater under Micro Apps
      Type any number in the first input
      Type any number in the second input
      Click on Calculate
      Get the result
      Print the result
           */
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.id("calculate")).click();
        WebElement calculetebox=driver.findElement(By.id("number1"));
        calculetebox.sendKeys("24");
        WebElement calculetebox2=driver.findElement(By.id("number2"));
        calculetebox2.sendKeys("34");
        WebElement function=driver.findElement(By.id("function"));
        function.click();
        driver.findElement(By.xpath("//input[@id='calculate']")).click();
        System.out.println("driver.findElement(By.id(\"answer\")).getText() = " + driver.findElement(By.id("answer")).getText());


    }
}
