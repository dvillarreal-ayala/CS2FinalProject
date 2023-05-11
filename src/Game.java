import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


public class Game extends JFrame
{
    private GameViewer gameViewer;
    private boolean gameWon;
    private Deck deck1;
    private Rectangle player, wall1, wall2, wall3, wall4, obstacle1, obstacle2, obstacle3, exit;


    public Game()
    {
        gameWon = false;

        deck1 = new Deck();
        player = new Player();
        exit = new Exit();

        gameViewer = new GameViewer(this);
    }
    public static void main(String[] args)
    {
        Game game = new Game();
        game.run();
    }

    public void run()
    {
        gameViewer.repaint();
    }
    public Deck getDeck()
    {
        return deck1;
    }
    public Rectangle getPlayer()
    {
        return player;
    }
    public Rectangle getExit() {
        return exit;
    }
}
