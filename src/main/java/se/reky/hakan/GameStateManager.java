package se.reky.hakan;

public interface GameStateManager {
    void executeTownGate();
    void executeFight(Actor opponent);
    void executeCrossRoad();
    void executeNorth();
    void executeEast();
    void executeWest();
    Player getPlayer();
    void setPlayer(Player player);
}

