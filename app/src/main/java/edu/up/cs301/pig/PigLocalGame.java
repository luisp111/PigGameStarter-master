package edu.up.cs301.pig;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.actionMsg.PigHoldAction;
import edu.up.cs301.game.actionMsg.PigRollAction;
import edu.up.cs301.game.infoMsg.GameState;
import edu.up.cs301.game.infoMsg.PigGameState;

import android.util.Log;

import java.util.Random;

// dummy comment, to see if commit and push work from srvegdahl account

/**
 * class PigLocalGame controls the play of the game
 *
 * @author Andrew M. Nuxoll, modified by Steven R. Vegdahl
 * @version February 2016
 */
public class PigLocalGame extends LocalGame {
    PigGameState pgs = new PigGameState();
    /**
     * This ctor creates a new game state
     */
    public PigLocalGame(PigGameState initPGS) {
        pgs = initPGS;
    }

    /**
     * can the player with the given id take an action right now?
     */
    @Override
    protected boolean canMove(int playerIdx) {
        if(pgs.isPlayerId() == playerIdx) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * This method is called when a new action arrives from a player
     *
     * @return true if the action was taken or false if the action was invalid/illegal.
     */
    @Override
    protected boolean makeMove(GameAction action) {
        if (action instanceof PigHoldAction) {
            if (pgs.isPlayerId() == 0) {
                pgs.setPlayer0Score(pgs.getCurrentValue() + pgs.getRunningTotal());
                pgs.setRunningTotal(0);
                if (players.length == 2) {
                    pgs.setPlayerId(1);
                }
            }
            if (pgs.isPlayerId() == 1) {
                pgs.setPlayer1Score(pgs.getCurrentValue() + pgs.getRunningTotal());
                pgs.setRunningTotal(0);
                if (players.length == 2) {
                    pgs.setPlayerId(0);
                }
            }
            return true;

        } else if (action instanceof PigRollAction) {
            Random rand = new Random();
            int random = 1 + rand.nextInt(5);
            if (random != 1) {
                pgs.setRunningTotal(pgs.getRunningTotal() + random);
            }
            if (random == 1) {
                pgs.setRunningTotal(0);
            }
            if (players.length == 2) {
                pgs.setPlayerId(1);
            }

        }
        return true;
    }
    //makeMove

    /**
     * send the updated state to a given player
     */
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {
        PigGameState gs = new PigGameState(pgs);
        p.sendInfo(gs);
    }//sendUpdatedSate

    /**
     * Check if the game is over
     *
     * @return
     * 		a message that tells who has won the game, or null if the
     * 		game is not over
     */
    @Override
    protected String checkIfGameOver() {
        //TODO  You will implement this method

            if (pgs.getPlayer0Score() >= 50) {
                return pgs.isPlayerId()+ " wins with a score of " + pgs.getPlayer0Score() + "!";
            } else if (pgs.getPlayer1Score()>= 50) {
                return pgs.isPlayerId() + " wins with a score of " + pgs.getPlayer1Score() + "!";
            } else {
                return "The game is not over yet.";
            }
        }

    }

}// class PigLocalGame
