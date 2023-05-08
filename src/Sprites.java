import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

public class Sprites
{
    private int x;              // Center x
    private int y;              // Center y
    private int dx;             // delta x in one time unit
    private int dy;             // delta y in one time unit
    private Image image;

    public Sprites()
    {

    }
    public void setCenter(int xIn, int yIn)
    {
        x = xIn;
        y = yIn;
    }
}
