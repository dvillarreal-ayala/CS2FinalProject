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
    private Point topLeft;
    private Point bottomRight;


    public Rectangle()
    {
        width = 100;
        height = 100;
        topLeft = new Point(x, y);
        bottomRight = new Point(x + width, y + height);
    }
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    public void setNewCords(int xIn, int yIn)
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

    public Point getBottomRight() {
        return bottomRight;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public boolean isOverlapping(Rectangle other) {
        if (this.topLeft.getY() < other.bottomRight.getY()
                || this.bottomRight.getY() > other.topLeft.getY()) {
            return true;
        }
        if (this.topLeft.getX() < other.bottomRight.getX()
                || this.bottomRight.getX() > other.topLeft.getX()) {
            return true;
        }
        return false;
    }
}