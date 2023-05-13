import javax.swing.*;
import java.awt.*;

public class Player extends Rectangle
{
    private int x;              // Center x
    private int y;              // Center y
    private Image image;
    private Point topLeft;
    private Point bottomRight;
    private final int WIDTH = 100;
    private final int HEIGHT = 150;
    public Player()
    {
        image = new ImageIcon("Resources/Cards/1.png").getImage();
        topLeft = new Point(x, y);
        bottomRight = new Point(x + WIDTH, y + HEIGHT);
    }
    public void draw(Graphics g, GameViewer viewer)
    {
        g.drawImage(image, x, y, WIDTH, HEIGHT, viewer);
    }
    public void setNewCords(int xIn, int yIn)
    {
        x = xIn - WIDTH / 2;
        y = yIn - HEIGHT / 2;
    }
    public boolean isOverlapping(Rectangle other) {
        //Find out if one rectangle is above or below another, return
        if (this.topLeft.getY() > other.getBottomRight().getY()
                || this.bottomRight.getY() < other.getTopLeft().getY()) {
            return false;
        }
        //Find out if one rectangle is to the left or right
        if (this.topLeft.getX() > other.getBottomRight().getX()
                || this.bottomRight.getX() < other.getTopLeft().getX()) {
            return false;
        }
        return false;
    }

}
