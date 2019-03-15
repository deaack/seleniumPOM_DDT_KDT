import com.codecool.Navigate;
import com.codecool.TwoInputFields;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;


public class TestTwoInputFields {
    Navigate navigate;
    WebDriver driver;
    String baseURL;
    TwoInputFields twoInputFields;
    int sum1;
    int sum2;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        baseURL = "https://www.seleniumeasy.com/test/";
        navigate = new Navigate(driver,baseURL);
        twoInputFields = new TwoInputFields(driver);
        sum1 = 23;
        sum2 = 56563747;
    }

    @AfterEach
    public void close(){
        driver.close();
    }

    @Test
    public void testTwoInputFields(){
        navigate.navigateToBaseURL();
        navigate.navigateToInputForms();
        int expectedResult = sum1 + sum2;
        int result = twoInputFields.getTotalOfTwoInputFields(sum1,sum2);
        assertEquals(expectedResult, result);
    }
}
