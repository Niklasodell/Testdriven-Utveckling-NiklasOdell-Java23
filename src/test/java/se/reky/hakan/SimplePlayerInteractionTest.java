package se.reky.hakan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimplePlayerInteractionTest {
    private Player player;

    @BeforeEach
    void setUp() {
        player = new Player();
    }

    private PlayerInteraction createPlayerInteraction(String input) {
        IOHandler handler = new IOHandler(new java.util.Scanner(input));
        return new SimplePlayerInteraction(handler);
    }

    @Test
    void testSetupPlayerSetsNameCorrectly() {
        PlayerInteraction interaction = createPlayerInteraction("TestName\n");
        interaction.setupPlayer(player);
        assertEquals("TestName", player.getName());
    }

    @Test
    void testUpdatePlayerHealth() {
        player.setHp(5);
        PlayerInteraction interaction = createPlayerInteraction("");
        interaction.updatePlayerHealth(player, 3);
        assertEquals(8, player.getHp());
    }
}