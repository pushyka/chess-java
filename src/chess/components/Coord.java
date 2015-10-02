package chess.components;

/**
 * Created by Gareth on 02-Oct-15.
 */
public class Coord {

    private int row;
    private int col;

    public Coord(int x, int y)
    {
        this.row = y;
        this.col = x;

    }

    @Override
    public String toString()
    {
        return "(" + this.row + "," + this.col + ")";
    }
}
