package chess.view;

import chess.base.Game;

/**
 * Created by Gareth on 02-Oct-15.
 */
public class Display
{
    // provide a reference of the game to the display
    // gui needs to listen for changes to the game.getIsWaitingOnInput
    // if >true< draw the gui based on the game.c.getBoard()
    // and game.c.getPlayer()
    // when certain conditions are met gui needs to be able to send data
    // to the game object (game.setExternalInput)
    private Game game;
    // swing stuff
    public Display(Game game)
    {
        this.game = game;
    }
}
