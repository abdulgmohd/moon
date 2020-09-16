import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


import java.net.URI;

@Listeners(GenerateReport.class)
public class LandingPageTest {
    private static WebDriver webDriver;

    @BeforeClass
    public void setup() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/abdul/drivers/chromedriver");
        webDriver = new ChromeDriver();
        URI uri = new URI("http://www.seleniumhq.org/");
        webDriver.get(uri.toString());
    }

    @Test
    public void verifyProjectsTab() throws Exception {

        LandingPage lp = new LandingPage(webDriver);

        try {
            System.out.println("landingpage2:" + Thread.currentThread().getId());
            Assert.assertEquals(1,1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void tearDwon() {
        webDriver.quit();
    }

}