import javax.swing.*;
import java.awt.*;

public class Exit extends Rectangle
{
    private int x;              // Center x
    private int y;              // Center y
    private Image image;
    private Point topLeft;
    private Point bottomRight;
    private final int WIDTH = 100;
    private final int HEIGHT = 150;
    public Exit()
    {
        image = new ImageIcon("Resources/Cards/back.png").getImage();
        topLeft = new Point(x, y);
        bottomRight = new Point(x + WIDTH, y + HEIGHT);
    }
    public Exit(int x, int y)
    {
        image = new ImageIcon("Resources/Cards/back.png").getImage();
        this.x = x;
        this.y = y;
        topLeft = new Point(x, y);
        bottomRight = new Point(x + WIDTH, y + HEIGHT);
    }
    public void draw(Graphics g, GameViewer viewer)
    {

        g.drawImage(image, x, y, 100, 150, viewer);

    }

}
