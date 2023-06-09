import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class GameViewer extends JFrame implements MouseListener, MouseMotionListener
{
    private Game game;
    private final int WINDOW_WIDTH = 800;
    private final int WINDOW_HEIGHT = 600;
    private Image background;

    public GameViewer(Game game)
    {
        this.game = game;

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Game Screen");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        addMouseListener(this);         // # 5: Required for MouseListeners
        addMouseMotionListener(this);   // # 6: Required for MouseMotionListeners

        // setVisible calls on paint()
        this.setVisible(true);
    }
    public void paint(Graphics g)
    {
        //Reset Canvas
//        g.drawImage(background,0,20,WINDOW_WIDTH, WINDOW_HEIGHT, this);
            g.setColor(Color.white);
            g.fillRect(0,20,WINDOW_WIDTH,WINDOW_HEIGHT);
            game.getExit().draw(g, this);
            game.getPlayer().draw(g, this);

        //If game is over print winning message.

    }

    // Mouse controls
    @Override
    public void mouseClicked(MouseEvent e) {
        //
        System.out.println("mousePressed event handler executed.");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.printf("mouseClicked event handler executed.");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased event handler executed.");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered event handler executed.");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited event handler executed.");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("\t\t\texecuting mouseDragged event handler");

        // Ask the input event the current location (x and y position on the Frame) of the mouse
//        int x = e.getX();
//        int y = e.getY();
//
//        game.getPlayer().setNewCords(x, y);
//        if(game.getPlayer().isOverlapping(game.getExit()))
//        {
//            game.getPlayer().setNewCords(0,20);
//            System.out.println("/n/n/nOverlapping/n/n/n");
//        }
//        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        System.out.println("\t\t\texecuting mouseMoved event handler");
        // Ask the input event the current location (x and y position on the Frame) of the mouse
        int x = e.getX();
        int y = e.getY();


        if(game.getExit().isOverlapping(x, y, game.getPlayer().getWidth(), game.getPlayer().getHeight()))
        {
            game.getPlayer().setNewCords(0,20);
            System.out.println("/n/n/nOverlapping/n/n/n");
        }
        game.getPlayer().setNewCords(x, y);
        repaint();
    }
}
