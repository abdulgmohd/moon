import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LandingPage {

    private WebDriver driver;
    @FindBy(xpath = "//li[@id='menu_projects']/a")
    WebElement projects_tab;

    @FindBy(xpath = "//li[@id='menu_download']/a")
    WebElement download_tab;

    @FindBy(xpath = "//li[@id='menu_documentation']/a")
    WebElement documentaiton_tab;

    @FindBy(xpath = "//li[@id='menu_support']/a")
    WebElement support_tab;

    @FindBy(xpath = "//li[@id='menu_about']/a")
    WebElement about_tab;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
    }


}
