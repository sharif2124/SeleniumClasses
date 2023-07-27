package selenium.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractingWebElementTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        WebElement webElement = driver.findElement(By.id("user-name"));
        webElement.sendKeys("abcd");
        Thread.sleep(3000);
        webElement.clear();

        webElement.sendKeys("standard_user");

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("1234");
        Thread.sleep(1500);
        password.clear();

        password.sendKeys("secret_sauce");

        WebElement button = driver.findElement(By.className("submit-button"));
        button.isDisplayed();
        button.click();

        Thread.sleep(5000);
        driver.quit();

    }
}
