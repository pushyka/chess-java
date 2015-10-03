package chess.view;

import chess.base.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gareth on 02-Oct-15.
 */
public class Display implements ActionListener
{
    // provide a reference of the game to the display
    // gui needs to listen for changes to the game.getIsWaitingOnInput
    // if >true< draw the gui based on the game.c.getBoard()
    // and game.c.getPlayer()
    // when certain conditions are met gui needs to be able to send data
    // to the game object (game.setExternalInput)
    private Game game;
    // swing stuff
    JFrame frame;
    JPanel contentPane;
    JMenuBar menuBar;




    public Display(Game game)
    {
        this.game = game;
        initialiseComponents();
        // now add the property listenner to game.asdasd

    }

    public void initialiseComponents()
    {
        frame = new JFrame();
        contentPane = new JPanel(new GridBagLayout());
        initialiseMenu();

        JPanel tiles = initialiseBoard();
        tiles.setVisible(true);
        contentPane.add(tiles);

        frame.setSize(500, 500);
        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // adds menu to the content pane
    public void initialiseMenu()
    {
        menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem quitItem = new JMenuItem("Quit");
        quitItem.addActionListener(this); // since this class implements the action listender


        fileMenu.add(quitItem);
        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);

    }

    public JPanel initialiseBoard()
    {
        // move the actual board code into here so it can be listend to by mylistnere
        Board b = new Board();
        return b.getTiles();
    }

    public void actionPerformed(ActionEvent e)
    {
        System.out.println("I HAVE RECEIVED AN ACTION, NOW TO INTERPRET IT: " + e.getSource().toString());

    }




    public void start()
    {

    }
}
