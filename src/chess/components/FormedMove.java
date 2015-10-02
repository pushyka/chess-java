package chess.components;


import chess.components.Coord;

/**
 * Created by Gareth on 02-Oct-15.
 */
public class FormedMove {

    private Coord posA;
    private Coord posB;
    private boolean isCompletelyFormed;
    private boolean isValidNow;

    public FormedMove()
    {
        this.posA = null;
        this.posB = null;
        this.isCompletelyFormed = false;
        this.isValidNow = false;
    }

    public void add(Coord c)
    {
        if (this.posA == null)
        {
            this.posA = c;
        }
        else
        {
            this.posB = c;
            this.isCompletelyFormed = true;
        }
    }

    public boolean getIsCompletelyFormed()
    {
        return this.isCompletelyFormed;
    }

    public boolean getIsValidNow()
    {
        return this.isValidNow;
    }


    @Override
    public String toString()
    {
        return this.posA.toString() + this.posB.toString();
    }
}
