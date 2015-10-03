package chess.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Created by Gareth on 03-Oct-15.
 */
public class Board extends JPanel
{

    private JPanel panel;

    public Board()
    {

        panel = new JPanel(new GridLayout(8,8));
        initialiseBoard();

    }

    private void initialiseBoard()
    {
        for (int row = 0; row < 8; row ++)
        {
            for (int col = 0; col < 8; col ++)
            {
                JPanel tile = new JPanel();
                // addlistender
                tile.setName("" + row + col);
                tile.setBackground(Color.RED);
                panel.add(tile);
            }
        }
    }

    public JPanel getTiles()
    {
        return this.panel;
    }
}
