package se.reky.hakan;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ActorTest {
    @Test
    void testAttackLowersOpponentHp() {
        Player attacker = new Player("Hero", 10, 5);
        Goblin defender = new Goblin("Gobbo", 10, 2);

        attacker.attack(defender);
        assertEquals(5, defender.getHp());
    }
}