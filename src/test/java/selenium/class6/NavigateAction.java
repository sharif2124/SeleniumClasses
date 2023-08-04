package selenium.class6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class NavigateAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/droppable");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Actions actions = new Actions(driver);

        driver.navigate().to("https://demoqa.com/menu");


        driver.findElement(By.linkText("Main Item 2")).click();
        Thread.sleep(3000);

       actions.moveToElement( driver.findElement(By.linkText("SUB SUB LIST »")))
                .click()
              .perform();
       Thread.sleep(3000);

       actions.moveToElement( driver.findElement(By.linkText("Sub Sub Item 1")))
                .click()
              .perform();
        Thread.sleep(2000);

        driver.quit();



    }
}
