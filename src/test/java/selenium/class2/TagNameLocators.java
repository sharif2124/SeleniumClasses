package selenium.class2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagNameLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        System.out.println(driver.getTitle());
        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        System.out.println("List of WebElement : "+webElements.size());
        for(WebElement webElement:webElements){
            System.out.println(webElement.getAttribute("href"));

        }
        Thread.sleep(3000);
        driver.quit();

    }
}
