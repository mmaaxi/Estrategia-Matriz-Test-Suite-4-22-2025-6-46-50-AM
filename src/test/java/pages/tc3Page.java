package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc3Page {
    WebDriver driver;
    WebDriverWait wait;

    public tc3Page(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void performAction3() {
        // Implement action 3
    }

    public void verifyResult3() {
        // Implement verification for result 3
    }
}