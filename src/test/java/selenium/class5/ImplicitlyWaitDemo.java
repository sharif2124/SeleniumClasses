package selenium.class5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitlyWaitDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //open a tab
       String OriginalWindow = driver.getWindowHandle();

        //Switch a Tab
       driver.switchTo().newWindow(WindowType.TAB);
       driver.get("https://demoqa.com/sample");
       System.out.println("New Tab Text: "+driver.findElement(By.id("sampleHeading")).getText());
       Thread.sleep(1500);
       driver.close();
        Thread.sleep(1500);

        //Back OriginalWindow
        driver.switchTo().window(OriginalWindow);
        System.out.println("Original Window Heading Text: "+driver.findElement(By.className("main-header")).getText());
        Thread.sleep(1500);
        driver.quit();


    }
}
