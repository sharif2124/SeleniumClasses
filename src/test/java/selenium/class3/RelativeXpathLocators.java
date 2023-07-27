package selenium.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("sharif24");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("abc2345");

        WebElement button = driver.findElement(By.xpath("//input[@class='button']"));
        button.click();

        Thread.sleep(5000);
        driver.quit();
    }
}
