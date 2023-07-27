package selenium.class3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.css.Rect;

import javax.swing.text.Position;
import java.time.Duration;

public class InformationWebElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        WebElement webElement = driver.findElement(By.id("user-name"));
        webElement.isDisplayed();
        webElement.sendKeys("standard_user");
        System.out.println("Get Text: "+driver.findElement(By.className("login_logo")).getText());
        System.out.println("Tag Name: "+webElement.getTagName());
        System.out.println("CSS front: "+webElement.getCssValue("font-family"));
        System.out.println("The Size of x,y= "+webElement.getRect().getX() +" "+webElement.getRect().getY());

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("secret_sauce");

        WebElement button = driver.findElement(By.className("submit-button"));
        button.isDisplayed();
        button.click();

        driver.quit();

    }
}
