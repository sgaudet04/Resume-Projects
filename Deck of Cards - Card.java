
public class Card 
{
	private String rank;
	private String suit;
	
	public static String [] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; 
	public static String [] suits = {"C", "S", "H", "D"};
	
	//specifying constructor
	public Card(String r, String s)
	{
		this.setRank(r);
		this.setSuit(s);
	}
	
	//default constructor
	public Card()
	{
		this("A", "C");
	}
	
	//card clone method
	public Card clone()
	{
		Card c = new Card(this.rank, this.suit);
		
		return c;
	}
	
	//equals method
	public boolean equals(Card guest)
	{
		if (this.getRank().equals(guest.getRank()) && this.getSuit().equals(guest.getSuit()))
		{
			return true;
		}
		
		return false;
	}
	
	//rank accessor
	public String getRank()
	{
		return this.rank;
	}
	
	//rank mutator
	private void setRank(String r)
	{
		if (isValidRank(r))
		{
			this.rank = r;
		}
	}
	
	//suit accessor
	public String getSuit()
	{
		return this.suit;
	}
	
	//suit mutator
	private void setSuit(String s)
	{
		if (isValidSuit(s))
		{
			this.suit = s;
		}
	}
	
	//method to check if suit is in suits array list
	private static boolean isValidSuit(String s)
	{
		for (int i = 0; i <= suits.length; ++i)
		{
			if (s.equals(suits[i]))
			{
				return true;
			}
		}
		
		return false;
	}
	
	//method to check if rank is in ranks array list
	private static boolean isValidRank(String r)
	{
		for (int i = 0; i <= ranks.length; ++i)
		{
			if (r.equals(ranks[i]))
			{
				return true;
			}
		}
		
		return false;
	}
	
	//to String method
	public String toString()
	{
		return this.rank + this.suit;
	}
	
	//display method
	public void displayCard()
	{
		System.out.println(this.toString());
	}
}
