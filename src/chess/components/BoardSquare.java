package chess.components;

/**
 * Created by Gareth on 02-Oct-15.
 */
public class BoardSquare {

    private char piece;
    private boolean movedOnce;
    private boolean canBeEnPassant;

    public BoardSquare(char piece)
    {
        this.piece = piece;
        this.movedOnce = false;
        this.canBeEnPassant = false;
    }

    public char getPiece()
    {
        return this.piece;
    }

    public boolean getMovedOnce()
    {
        return this.movedOnce;
    }

    public boolean getCanBeEnPassant()
    {
        return this.canBeEnPassant;
    }



}
