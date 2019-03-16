import com.codecool.seleniumeasytests.bencedeak.Navigate;
import com.codecool.seleniumeasytests.bencedeak.SingleFieldAndButton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;


public class TestSingleFieldAndButton {
    Navigate navigate;
    WebDriver driver;
    String baseURL;
    SingleFieldAndButton singleFieldAndButton;
    String inputMessage;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        baseURL = "https://www.seleniumeasy.com/test/";
        navigate = new Navigate(driver,baseURL);
        singleFieldAndButton = new SingleFieldAndButton(driver);
        inputMessage = "Hello Page Object Model!";
    }

    @AfterEach
    public void close(){
        driver.close();
    }

    @Test
    public void testSingleInputField(){
        navigate.navigateToBaseURL();
        navigate.navigateToInputForms();
        String result = singleFieldAndButton.enterMessageIntoSingleInputForm(inputMessage);
        assertEquals(inputMessage,result);
    }
}
