package selenium.class5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IFrameDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        System.out.println(driver.findElement(By.cssSelector("div.main-header")).getText());

        //switch IFrame
        driver.switchTo().frame("frame1");
        System.out.println("Frame1 Value : "+driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();

        Thread.sleep(2000);
        //switch Another IFrame

        driver.switchTo().frame("frame2");
        System.out.println("Frame2 Value : "+driver.findElement(By.id("sampleHeading")).getText());
        driver.switchTo().defaultContent();

        //text print

        System.out.println(driver.findElement(By.id("framesWrapper")).getText());
        driver.quit();
    }
}
