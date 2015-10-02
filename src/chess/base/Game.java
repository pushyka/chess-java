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
    public Game(){}

    public void start()
    {
        ChessBoard c = new ChessBoard();
        Evaluator e = new Evaluator();

    }

    public void test()
    {
        ChessBoard c = new ChessBoard();
        Evaluator e = new Evaluator();

        c.populate();
        c.setPlayer('b');
        while (true)
        {
            c.display();
            String input = null;
            try
            {
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
}
