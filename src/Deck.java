import javax.swing.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Created by Damian Villarreal-Ayala on Dec 1, 2022 for CS2.
 */
public class Deck
{
    private int x;              // Center x
    private int y;              // Center y
    private int dx;             // delta x in one time unit
    private int dy;             // delta y in one time unit
    private ArrayList<Card> cards;
    private int cardsLeft;
    private int dealer;

    public Deck()
    {
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};
        cards = new ArrayList<Card>();
        int file = 1;
        for(int i = 0; i < suits.length; i++)
        {
            for(int j = 0; j < ranks.length; j++)
            {
                Card card = new Card(suits[i], ranks[j], values[j], new ImageIcon("Resources/Cards/" + file + ".png").getImage());
                cards.add(card);
                cardsLeft++;
            }
        }
        dealer = cardsLeft - 1;

    }

    public boolean isEmpty()
    {
        if(cardsLeft > 0)
        {
            return false;
        }
        return true;
    }
    public int getCardsLeft()
    {
        return cardsLeft;
    }

    public Card deal()
    {
        if(cards.isEmpty())
        {
            return null;
        }
        return cards.get(dealer--);
    }

    public void shuffle()
    {
        dealer = cardsLeft - 1;
        for(int i = cardsLeft - 1; i > 0; i--)
        {
            int rnum = (int) (Math.random() * i);
//            Card temp = cards.remove(i);
            cards.add(rnum + 1, cards.remove(i));
            cards.add(i, cards.remove(rnum));
        }
    }
    public void draw(Graphics g, GameViewer viewer)
    {

        g.drawImage(cards.get(0).getImage(), x, y, 100, 150, viewer);

//        g.fillRect(x, y, 100, 100);
    }
    public void setCenter(int xIn, int yIn)
    {
        x = xIn;
        y = yIn;
    }

//    public boolean isTouching(Deck otherDeck)
//    {
//
//    }
}
