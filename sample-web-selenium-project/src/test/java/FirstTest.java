import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.lang.*;


/**
 * Created by Sergio on 15.07.2018.
 */
public class FirstTest {
    ChromeDriver wd;
    @BeforeMethod
    public void start(){
      //  System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");
        wd = new ChromeDriver();

    }

    @Test
    public void firstTestScript(){
       // wd.get("https://search.maven.org");
        wd.navigate().to("https://search.maven.org");
    }

    @AfterMethod
    public void stop() throws InterruptedException {
        Thread.sleep(3000);
     wd.quit();
    }

}
