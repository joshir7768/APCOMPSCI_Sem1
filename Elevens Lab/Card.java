/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card 
{

	/**
	 * String value that holds the suit of the card
	 */
	private String suit;

	/**
	 * String value that holds the rank of the card
	 */
	private String rank;

	/**
	 * int value that holds the point value.
	 */
	private int pointValue;


   /**
	 * Creates a new <code>Card</code> instance.
	 *
	 * @param cardRank  a <code>String</code> value
	 *                  containing the rank of the card
	 * @param cardSuit  a <code>String</code> value
	 *                  containing the suit of the card
	 * @param cardPointValue an <code>int</code> value
	 *                  containing the point value of the card
	 */
	public Card(String cardRank, String cardSuit, int cardPointValue)
	{
		this.suit = cardSuit;
        this.rank = cardRank;
        this.pointValue = cardPointValue;
    }
	
	public String suit() 
	{
	
		return this.suit;
		
    }

	public String rank() 
	{
		
        return this.rank;
	}

	public int pointValue() 
	{
		return this.pointValue;
	}

	public boolean matches(Card otherCard) 
	{
		if (this.suit.equals(otherCard.suit) && this.rank.equals(otherCard.rank) && this.pointValue == otherCard.pointValue) 
		{
           return true;
        }
        return false;
	}


	public String toString() 
	{
		return this.rank + " of " + this.suit + " (point value = " + this.pointValue + ")";
	}

}