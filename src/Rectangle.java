import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

public class Rectangle
{
    private int x;              // Center x
    private int y;              // Center y
    private int width;
    private int height;

    public Rectangle()
    {
        width = 100;
        height = 100;
    }
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    public void setCenter(int xIn, int yIn)
    {
        x = xIn;
        y = yIn;
    }

    public void draw(Graphics g, GameViewer viewer)
    {
        g.setColor(Color.blue);
//        g.drawImage(image, x, y, 100, 150, viewer);

        g.fillRect(x, y, 100, 100);
    }
}
