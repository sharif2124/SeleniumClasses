package selenium.class4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectTestDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        Select select = new Select(driver.findElement(By.id("oldSelectMenu")));
        select.selectByIndex(3);
        Thread.sleep(2000);

        select.selectByValue("2");
        Thread.sleep(3000);

        select.selectByVisibleText("Magenta");
        Thread.sleep(3000);

        for (WebElement webelement: select.getAllSelectedOptions()) {
            System.out.println(webelement.getText());

        }

        Thread.sleep(3000);

        System.out.println("::::::::::::::::::::::::::::::");
        //Multiple Selector

        Select multipleselect = new Select(driver.findElement(By.id("cars")));
        multipleselect.selectByValue("saab");
        Thread.sleep(2000);

        multipleselect.selectByIndex(3);
        Thread.sleep(2000);

        multipleselect.selectByValue("Audi");
        Thread.sleep(2000);




    }
}
