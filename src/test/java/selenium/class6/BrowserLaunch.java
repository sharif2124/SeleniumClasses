package selenium.class6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BrowserLaunch {
    WebDriver driver;
//@BeforeClass
//    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        driver=new ChromeDriver();
//    }
    @BeforeMethod
    public void setUp2(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
//    @AfterClass
//    public void closeBrowser(){
//        driver.quit();
//    }
    @AfterMethod
    public void closeBrowser2() throws InterruptedException {
    Thread.sleep(1000);
        driver.quit();
    }
}
