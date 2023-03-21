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



}
