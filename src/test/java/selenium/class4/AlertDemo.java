package selenium.class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        Thread.sleep(1500);

        //Alert
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();

        //Confirmation Alert
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().dismiss();

        //Prompt Alert
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(1500);

        Alert alert = driver.switchTo().alert();
        Thread.sleep(1500);
        alert.sendKeys("Hello Prompt Alert");
        Thread.sleep(1500);
        System.out.println(alert.getText());
        alert.accept();

        driver.quit();


    }
}
