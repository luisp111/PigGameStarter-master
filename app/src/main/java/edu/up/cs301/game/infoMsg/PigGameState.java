package edu.up.cs301.game.infoMsg;

public class PigGameState extends GameState{
    int playerId;
    int p0score;
    int p1score;
    int runningTotal;
    int currentVal;

    public PigGameState(){
        playerId = 0;
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
        return currentVal;
    }

    public int isPlayerId() {
        return playerId;
    }

    public int getPlayer0Score() {
        return p0score;
    }

    public int getPlayer1Score() {
        return p1score;
    }

    public int getRunningTotal() {
        return runningTotal;
    }

    public void setCurrentValue(int currentValue) {
        this.currentVal = currentValue;
    }

    public void setPlayer0Score(int player0Score) {
        this.p0score = player0Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.p1score = player1Score;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void setRunningTotal(int runningTotal) {
        this.runningTotal = runningTotal;
    }

    //@Override
    //public void setGame(Game g) {
        //super.setGame(g);
    }

