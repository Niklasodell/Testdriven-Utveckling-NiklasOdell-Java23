package se.reky.hakan;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScannerTest {
    @Test
    void testScannerNextLineReturnsCorrectInput() {
        Scanner scanner = new Scanner("TestInput");
        String input = scanner.nextLine();
        assertEquals("TestInput", input);
    }
}