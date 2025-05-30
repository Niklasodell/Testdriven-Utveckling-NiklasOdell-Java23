package se.reky.hakan;

public interface PlayerInteraction {
    void setupPlayer(Player player);
    void updatePlayerHealth(Player player, int hp);
    void greetPlayer(Player player);

}