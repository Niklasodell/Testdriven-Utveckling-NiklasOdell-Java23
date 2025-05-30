package se.reky.hakan;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.*;
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
        List<WebElement> playerItems = driver.findElements(By.cssSelector("li"));
        assertTrue(playerItems.size() >= 1, "Minst en spelare borde visas i listan");
    }

    @Test
    void testFirstPlayerNameIsDisplayed() {
        driver.get("http://localhost:8080/players");
        List<WebElement> playerItems = driver.findElements(By.cssSelector("li"));
        assertFalse(playerItems.isEmpty(), "Det finns inga spelare i listan");

        WebElement firstPlayer = playerItems.get(0);
        assertTrue(firstPlayer.isDisplayed(), "Första spelaren är inte synlig");
        assertTrue(firstPlayer.getText().contains("niklas"), "Första spelaren borde innehålla namnet 'niklas'");
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
