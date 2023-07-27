package selenium.seleniumclass2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.name("username")).sendKeys("sharif06");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("abc1234");
        driver.findElement(By.linkText("Services")).click();
        driver.findElement(By.partialLinkText("Admin")).click();
        Thread.sleep(5000);
        driver.quit();

    }
}
