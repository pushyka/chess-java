package chess.base;

import chess.components.ChessBoard;
import chess.components.FormedMove;
import chess.util.Evaluator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Gareth on 02-Oct-15.
 */
public class Game {

    // default constructor

    private String externalInput;
    private boolean isWaitingOnInput; // can be changed to a more general status (display info on the gui)
    public Game()
    {
        this.externalInput = null;
    }

    public void start()
    {
        ChessBoard c = new ChessBoard();
        Evaluator e = new Evaluator();

    }

    public void test()
    {
        ChessBoard c = new ChessBoard();
        Evaluator e = new Evaluator();

        // create gui -> new Gui(this)
        // from gui: register a listener to game.c.getBoard() (when the object changes, update the gui)
        // from gui: when the gui code has received 2 clicks, it will call game.setExternalInput(string input)
        // startupgui

        c.populate();

        // folllowing code in startGame()



        c.setPlayer('b');
        // isWaitingOnInput = true;


        while (true)
        {
            c.display();
            String input = null;

            if (this.externalInput != null)
            {
                // setWaitingOnInput = false // gui sees this and can relax / disable
                //foramat
                //evaluate etc
                //apply turn
                // if actually applies do:
                // change player
                // reset the input back to null
                // set waitingOnInput = true; / /state cahnge
                // else : dont change player, reset input back to null, set waitingOnInput+NOCHANGE? --state
            }

            try
            {
                // or input sent from gui
                input = readLine();
            }
            catch(IOException er)
            {
                System.err.print("input error " + er.toString());
            }
            FormedMove move = e.formatMove(input);
            if (move.getIsCompletelyFormed())
            {
                System.out.println("move successfully formed with coords: " + move.toString());

                boolean result = e.evaluateMove(move, c.getBoard(), c.getPlayer());
                System.out.println("is move valid on board: " + result);
            }



        }
    }
    private String readLine() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        return input;
    }


    public boolean setExternalInput(String input)
    {
        this.externalInput = input;
        return true;
    }

    public boolean getIsWaitingOnInput()
    {
        return this.isWaitingOnInput;
    }
}
