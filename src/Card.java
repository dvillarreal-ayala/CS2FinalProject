import java.awt.*;

public class Card
{
    private int x;              // Center x
    private int y;              // Center y
    private int dx;             // delta x in one time unit
    private int dy;             // delta y in one time unit
    private String suit;
    private String rank;
    private int values;
    private Image image;

    public Card(String suits, String ranks, int value, Image picture)
    {
        suit = suits;
        rank = ranks;
        values = value;
        image = picture;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValues(int values) {
        this.values = values;
    }

    public int getValues() {
        return values;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public void draw(Graphics g, GameViewer viewer)
    {

        g.drawImage(getImage(), x, y, 100, 150, viewer);

//        g.fillRect(x, y, 100, 100);
    }
    public void setCenter(int xIn, int yIn)
    {
        x = xIn;
        y = yIn;
    }

    public Image getImage() {
        return image;
    }

    public String toString() {
        return getRank() + " of " + getSuit();
    }
}
