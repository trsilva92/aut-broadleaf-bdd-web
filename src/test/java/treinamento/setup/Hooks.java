package treinamento.setup;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void startTest() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo15es5r.broadleafcommerce.org/admin/login/");
    }

    @After
    public void tearDown() {

        driver.close();
    }

    public static WebDriver getDriver() {

        return driver;

    }
}
