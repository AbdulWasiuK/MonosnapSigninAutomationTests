package SignIn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignIntests {

    private static WebDriver driver;

    // import chromeDriver
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\23490\\Desktop\\monosnap\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Input project URL = Monosnap Sign In page URL

        driver.get("https://monosnap.com/auth");
        // Global Waiting period
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        // Maximize the window

        driver.manage().window().maximize();
        // Get page title
        System.out.println(driver.getTitle());

        // locate username field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]/input[1]")).sendKeys("kaybossplus@gmail.com");
        // locate the password field
        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div/div[2]/form/div[4]/input[2]")).sendKeys("admintop34");
        // click on the log in button
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div/div[2]/form/button")).click();
        Thread.sleep (10000);

        driver.quit ();
}
    // initiate the test run command
    public static void main(String args[]) throws InterruptedException {
        SignIntests test = new SignIntests ();
        test.setUp();
    }

}
