import javax.swing.*;
import java.awt.event.*;


public class Game extends JFrame
{
    private GameViewer gameViewer;
    private boolean gameWon;

    private Rectangle player, wall1, wall2, wall3, wall4, obstacle1, obstacle2, obstacle3, exit;


    public Game()
    {
        gameWon = false;

        player = new Player();
        exit = new Exit(700, 400);

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
    public Rectangle getPlayer()
    {
        return player;
    }
    public Rectangle getExit() {
        return exit;
    }
}
