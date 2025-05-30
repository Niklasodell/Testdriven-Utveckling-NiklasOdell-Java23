package se.reky.hakan;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

@Disabled
public class PlayerControllerSeleniumTest {
    private WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void testCorrectNumberOfPlayersShown() {
        driver.get("http://localhost:8080/players");
        int numberOfPlayers = driver.findElements(By.tagName("tr")).size() - 1;
        assertEquals(2, numberOfPlayers);
    }

    @Test
    void testFirstPlayerNameIsDisplayed() {
        driver.get("http://localhost:8080/players");
        WebElement playerName = driver.findElement(By.cssSelector("tr:nth-child(2) td"));
        assertTrue(playerName.isDisplayed());
    }

    @Test
    void testPageTitleMatchesExpected() {
        driver.get("http://localhost:8080/players");
        assertEquals("Players List", driver.getTitle());
    }

    @Test
    void testLoginButtonHasTextLoggaIn() {
        driver.get("http://localhost:8080/players");
        WebElement button = driver.findElement(By.tagName("button"));
        assertEquals("Logga in", button.getText());
    }
}