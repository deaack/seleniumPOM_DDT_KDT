import com.codecool.seleniumeasytests.bencedeak.Checkbox;
import com.codecool.seleniumeasytests.bencedeak.Navigate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;


public class TestCheckbox {

    WebDriver driver;
    Navigate navigate;
    String baseURL;
    Checkbox checkbox;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        baseURL = "https://www.seleniumeasy.com/test/";
        navigate = new Navigate(driver,baseURL);
        checkbox = new Checkbox(driver);
    }

    @Test
    public void testCheckboxMessageDisplayed() {
        navigate.navigateToBaseURL();
        navigate.navigateToCheckboxes();
        boolean isTickedAndDisplayed = checkbox.tickInCheckboxes();
        assertEquals(true,isTickedAndDisplayed);
    }
}
