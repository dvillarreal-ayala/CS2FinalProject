import javax.swing.*;
import java.awt.*;

public class Exit extends Rectangle
{
    private int x;              // Center x
    private int y;              // Center y
    private Image image;
    public Exit()
    {
        image = new ImageIcon("Resources/Cards/back.png").getImage();
    }
    public void draw(Graphics g, GameViewer viewer)
    {

        g.drawImage(image, x, y, 100, 150, viewer);

    }
}
