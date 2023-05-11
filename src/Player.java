import javax.swing.*;
import java.awt.*;

public class Player extends Rectangle
{
    private int x;              // Center x
    private int y;              // Center y
    private Image image;
    public Player()
    {
        image = new ImageIcon("Resources/Cards/1.png").getImage();
    }
    public void draw(Graphics g, GameViewer viewer)
    {
        g.drawImage(image, x, y, 100, 150, viewer);
    }
    public void setCenter(int xIn, int yIn)
    {
        x = xIn;
        y = yIn;
    }
}
