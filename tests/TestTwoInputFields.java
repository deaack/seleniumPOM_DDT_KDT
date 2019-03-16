import com.codecool.seleniumeasytests.bencedeak.Navigate;
import com.codecool.seleniumeasytests.bencedeak.TwoInputFields;
import com.codecool.seleniumeasytests.bencedeak.excelreader.ExcelReader;
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
    ExcelReader excelReader;
    double [] values;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        baseURL = "https://www.seleniumeasy.com/test/";
        navigate = new Navigate(driver,baseURL);
        twoInputFields = new TwoInputFields(driver);
        excelReader = new ExcelReader();
        try {
            excelReader.initFileInputStream();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            excelReader.initWorkbook();
        } catch (Exception e) {
            e.printStackTrace();
        }
        values = excelReader.readValuesForTwoInputFields();
    }

    @AfterEach
    public void close(){
        driver.close();
    }

    @Test
    public void testTwoInputFields(){
        navigate.navigateToBaseURL();
        navigate.navigateToInputForms();
        double expectedResult = values[0] + values[1];
        double result = twoInputFields.getTotalOfTwoInputFields(values[0],values[1]);
        assertEquals(expectedResult, result);
    }
}
