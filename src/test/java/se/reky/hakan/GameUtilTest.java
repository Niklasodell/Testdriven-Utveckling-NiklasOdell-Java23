package se.reky.hakan;

import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;
import se.reky.hakan.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class GameUtilTest {
    @Test
    void testToLowerCaseButFirstLetterCapitalizedThrowsExceptionOnNull() {
        GameUtil util = new GameUtil();
        assertThrows(GameException.class, () -> util.toLowerCaseButFirstLetterCapitalized(null));
    }
}