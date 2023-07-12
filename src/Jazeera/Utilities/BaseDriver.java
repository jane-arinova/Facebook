package Jazeera.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;
    static {

        Logger logger= Logger.getLogger(""); // Shows only severe problems on the consol
        logger.setLevel(Level.SEVERE);

        driver = new ChromeDriver();

        driver.manage().window().maximize(); // fits the browser to the screen

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        // Waits for 15 secs for page to be loaded.
        // if it takes more than 15 secs to a page being loaded it throws an exception
        // PageLoad = waits all html files are downloaded to our computer but they are not visible on our browser yet.

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // waits until all elements on a webpage are visible on our browser.
        // if it is not done in 15 secs it throws an exception

    }

    public static void waitAndQuit(){
        MyMethods.myWait(4);
        driver.quit();
    }
}
