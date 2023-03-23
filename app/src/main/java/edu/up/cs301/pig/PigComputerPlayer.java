package edu.up.cs301.pig;

import java.util.Random;

import edu.up.cs301.game.GameComputerPlayer;
import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.actionMsg.GameAction;
import edu.up.cs301.game.actionMsg.PigHoldAction;
import edu.up.cs301.game.actionMsg.PigRollAction;
import edu.up.cs301.game.infoMsg.GameInfo;
import edu.up.cs301.game.infoMsg.PigGameState;
import edu.up.cs301.game.util.Tickable;

/**
 * An AI for Pig
 *
 * @author Andrew M. Nuxoll
 * @version August 2015
 */
public class PigComputerPlayer extends GameComputerPlayer {

    /**
     * ctor does nothing extra
     */
    public PigComputerPlayer(String name) {
        super(name);
    }

    /**
     * callback method--game's state has changed
     *
     * @param info
     * 		the information (presumably containing the game's state)
     */
    @Override
    protected void receiveInfo(GameInfo info) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        PigGameState pigs = (PigGameState) info;
        PigHoldAction pha = new PigHoldAction(this);
        PigRollAction pra = new PigRollAction(this);
        if(pigs.isPlayerId() != playerNum){
            return;

        }
        else{
            Random rand = new Random();
            int num = rand.nextInt(2);
            if(num == 0){
                super.game.sendAction(pha);
            }
            else{
                super.game.sendAction(pra);

            }
        }
    }

}
