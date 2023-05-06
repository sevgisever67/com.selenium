package myStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath_soru {
    public static void main(String[] args) throws InterruptedException {
        /*
        1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        2- Add Element butonuna basin
        3- Delete butonu’nun gorunur oldugunu test edin
        4- Delete tusuna basin
        5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
         */
        System.setProperty("webdriver.chrome.driver : ","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(5000);
        //Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        Thread.sleep(5000);
        //Delete tusuna basin
        WebElement deleteButonu=driver.findElement(By.xpath("//button[@class='added-manually']"));
        System.out.println("Delete butonu’nun gorunur oldugunu test edin : "+deleteButonu.isDisplayed());
        deleteButonu.click();
        Thread.sleep(5000);
        //5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemove=driver.findElement(By.xpath("//h3"));
        // 5- “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        System.out.println("Add/Remove Elements yazisinin gorunur oldugunu test edin"+addRemove.isDisplayed());


        driver.close();



    }
}
