import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Game extends JFrame
{
    private GameViewer gameViewer;
    private boolean gameWon;
    private Deck deck1;

    public Game()
    {
        gameWon = false;

        deck1 = new Deck();
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
}
