package project.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import project.manager.DriverManager;
import project.manager.InitManager;

import java.util.Properties;

import static project.properties.TestProperties.getInstance;

public class Hooks {
    /** Универсальная настройка для всех тестов вначале и конце сценария */

    private final DriverManager driverManager = DriverManager.getDriverManager();
    private final Properties properties = getInstance().getProperties();

    @Before
    public void before() {
        InitManager.initFramework();
        driverManager.getWebDriver().get(properties.getProperty("HOSTNAME"));
    }

    @After
    public void after(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriverManager().getWebDriver();
                byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "img/png", "Screenshot");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        InitManager.quitFramework();
    }
}
