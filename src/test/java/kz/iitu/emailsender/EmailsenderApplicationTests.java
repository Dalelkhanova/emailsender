package kz.iitu.emailsender;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailsenderApplicationTests {
    private final static String CHROME_DRIVER = "/Users/admin/chromedriver_win32/chromedriver.exe";
    private final static String BASE_URL = "https://gmail.com";

    @Test
    void firstTest() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);
        ChromeDriver driver = new ChromeDriver();

        driver.get(BASE_URL);
        driver.findElement(By.cssSelector("#identifierId")).sendKeys("dalelkhanova18");
        driver.findElement(By.cssSelector("div.VfPpkd-RLmnJb"));


        driver.quit();
    }

}
