package edu.up.cs301.game.infoMsg;

public class PigGameState extends GameState{
    boolean playerId;
    int p0score;
    int p1score;
    int runningTotal;
    int currentVal;

    public PigGameState(){
        playerId = true;
        p0score = 0;
        p1score = 0;
        runningTotal = 0;
        currentVal = 0;
    }
    public PigGameState(PigGameState pgs){
        playerId = pgs.playerId;
        p0score = pgs.p0score;
        p1score = pgs.p1score;
        runningTotal = pgs.runningTotal;
        currentVal = pgs.currentVal;
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
