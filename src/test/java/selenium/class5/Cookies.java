package selenium.class5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Cookies {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Add Cookies
        driver.manage().addCookie(new Cookie("Rahim","Karim"));
        System.out.println(driver.manage().getCookieNamed("Rahim").getValue());

        for (Cookie cookie: driver.manage().getCookies()) {
            System.out.println(cookie.getValue());
        }

        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

        //remove cookies
        driver.manage().deleteCookieNamed("Rahim");
        for (Cookie cookie: driver.manage().getCookies()) {
            System.out.println("Cookies : "+cookie.getValue());
        }

        //remove all Cookies

        driver.manage().deleteAllCookies();
        System.out.println("Cookies Size : "+driver.manage().getCookies().size());
        Thread.sleep(30000);
        driver.quit();




    }
}
