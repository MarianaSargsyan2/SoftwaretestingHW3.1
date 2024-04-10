import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
   public static WebDriver driver;
   public static String baseUrl = "https://www.cba.am/am/SitePages/Default.aspx";

   @BeforeClass
   public static void initWebDriver() {
      System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
   }
   @Test
   public void WebDriverHelloWorldTest() {
      driver.get("https://www.google.com/");
      driver.findElement(By.name("q")).sendKeys("Selenium WebDriver" + Keys.ENTER);
   }

   @Test
   public void navigateToURL() {
      driver.navigate().to(baseUrl);
   }

   @Test
   public void WebDriverNavigationTest() {
      driver.get("https://www.cba.am/am/SitePages/Default.aspx");
      driver.manage().window().maximize();
      String title = driver.getTitle();
      System.out.println("Current Page Title: " + title);
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().refresh();
      driver.quit();
   }

}