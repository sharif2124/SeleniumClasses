package selenium.class6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");

        //Click and hold
        Actions actions = new Actions(driver);
        WebElement webElement = driver.findElement(By.id("droppableExample-tab-simple"));
        actions.clickAndHold(webElement)
                .perform();
        Thread.sleep(2000);

        //Context Click

        actions.contextClick(webElement).click().perform();
        Thread.sleep(2000);

        //doubleClick

        actions.doubleClick(webElement).click().perform();
        Thread.sleep(2000);


    }
}
