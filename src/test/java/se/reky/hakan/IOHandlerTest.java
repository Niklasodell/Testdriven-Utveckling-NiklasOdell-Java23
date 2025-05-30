package se.reky.hakan;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

public class IOHandlerTest {
    private IOHandler createIOHandler(String input) {
        return new IOHandler(new Scanner(input));
    }

    @Test
    void testHasNextInt() {
        IOHandler handler = createIOHandler("42");
        assertTrue(handler.hasNextInt());
    }
}