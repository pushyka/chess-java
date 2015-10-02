package chess.components;

import chess.components.BoardSquare;

/**
 * Created by Gareth on 02-Oct-15.
 */
public class ChessBoard {

    private BoardSquare[][] board;
    private char player;

    public ChessBoard()
    {
        this.board = new BoardSquare[8][8];
    }


    public void populate()
    {
        // black row 2
        this.board[0][0] = new BoardSquare('R'); // top left origin
        this.board[0][1] = new BoardSquare('N');
        this.board[0][2] = new BoardSquare('B');
        this.board[0][3] = new BoardSquare('Q');
        this.board[0][4] = new BoardSquare('K');
        this.board[0][5] = new BoardSquare('B');
        this.board[0][6] = new BoardSquare('N');
        this.board[0][7] = new BoardSquare('R');


        // black row 3 (pawns)
        for (int col = 0; col < 8; col ++)
        {
            this.board[1][col] = new BoardSquare('P'); ; // pawns have 2 additional properties {movedOnce=false : used to allow +1/+2 advance for FIRST move}
            //                                    {canBeCapEnPassant=false : set=true if pawn advances +2, function
            //to set=false for every pawn of oposite player at the end of current players turn.
            //seems naive, implement last anyway
        }

        // empty rows
        for (int row = 2; row < 6; row ++)
        {
            for (int col = 0; col < 8; col ++)
            {
                this.board[row][col] = new BoardSquare('e'); // empty
            }
        }

        // white row 8 (pawns)
        for (int col = 0; col < 8; col ++)
        {
            this.board[6][col] = new BoardSquare('p'); ; // as above
        }

        // white row 9
        this.board[7][0] = new BoardSquare('r');
        this.board[7][1] = new BoardSquare('n');
        this.board[7][2] = new BoardSquare('b');
        this.board[7][3] = new BoardSquare('q');
        this.board[7][4] = new BoardSquare('k');
        this.board[7][5] = new BoardSquare('b');
        this.board[7][6] = new BoardSquare('n');
        this.board[7][7] = new BoardSquare('r'); // 9,9 the bottomright (rather than 7,7) due to the 2x off board buffer
    }

    public void display()
    {
        for (int row = 0; row < 8; row ++)
        {
            for (int col = 0; col < 8; col ++)
            {
                // not sure if this is correct
                System.out.format("%2s", this.board[row][col].getPiece());
            }
            System.out.println('\n');
        }
    }




    public char getPlayer()
    {
        return this.player;
    }
    public void setPlayer(char player)
    {
        this.player = player;
    }

    public BoardSquare[][] getBoard()
    {
        return this.board;
    }

}
