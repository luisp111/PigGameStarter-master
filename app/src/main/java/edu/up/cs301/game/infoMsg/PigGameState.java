package edu.up.cs301.game.infoMsg;

import edu.up.cs301.game.Game;

public class PigGameState extends GameState {
    public boolean playerId;
    public int player0Score;
    public int player1Score;
    public int runningTotal;
    public int currentValue;
    public PigGameState(){
        playerId = true; //true = player 1 , false = player 2

    }

    public int getCurrentValue() {
        return currentValue;
    }

    public boolean isPlayerId() {
        return playerId;
    }

    public int getPlayer0Score() {
        return player0Score;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public int getRunningTotal() {
        return runningTotal;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }

    public void setPlayer0Score(int player0Score) {
        this.player0Score = player0Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public void setPlayerId(boolean playerId) {
        this.playerId = playerId;
    }

    public void setRunningTotal(int runningTotal) {
        this.runningTotal = runningTotal;
    }

    @Override
    public void setGame(Game g) {
        super.setGame(g);
    }
}
