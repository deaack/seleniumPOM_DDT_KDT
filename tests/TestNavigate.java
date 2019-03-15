import com.codecool.Navigate;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNavigate {

    Navigate navigate;
    WebDriver driver;
    String baseURL;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        baseURL = "https://www.seleniumeasy.com/test/";
        navigate = new Navigate(driver,baseURL);
    }

    @AfterEach
    public void close(){
        driver.close();
    }



    @Test
    public void testBaseURLNavigation(){
        navigate.navigateToBaseURL();
    }
}
