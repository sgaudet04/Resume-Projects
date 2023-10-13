
public class Deck 
{
	private Card [] deck = new Card[52];
	private int cardsDealt;
	
	//constructors
	public Deck()
	{
		this.setCardsDealt(0);
		for (int i = 0; i < deck.length; ++i)
		{
			deck[i] = new Card(Card.ranks[i%13], Card.suits[i/13]);
		}
	}
	
	//accessor for cardsDealt
	public int getCardsDealt()
	{
		return this.cardsDealt;
	}
	
	//mutator for cardsDealt
	private void setCardsDealt(int cardsDealt)
	{
		if (this.getCardsDealt() >= 0)
		{
			this.cardsDealt = cardsDealt;
		}
	}
	
	//method to check if all the cards have been dealt
	public boolean isEmptyDeck()
	{
//		if (this.getCardsDealt() == 52)
//		{
//			return true;
//		}
//		
//		return false;
		return this.getCardsDealt() == 52;
	}
	
	//method to reform an undealt deck, setting cardsDealt to 0 again
	public void collectAllCards()
	{
		this.setCardsDealt(0);
	}
	
	//method to deal one card
	public Card dealCard()
	{
		if (this.isEmptyDeck() == false)
		{
			Card c = deck[getCardsDealt()];
			
			this.setCardsDealt(this.getCardsDealt() + 1);
			
			
			return c;
		}
		
		else
		{
			return null;
		}
	}
	
	//method to deal a user specified amount of cards
	public void dealXCards(int x)
	{
		for (int i = 0; i < x; ++i)
		{
			this.dealCard();
		}
	}
	
	//shuffle method with user specified number of shuffles
	public void shuffleDeck(int swapCnt)
	{
		for (int i = 1; i <= swapCnt; ++i)
		{
			int a = (int)(Math.random() * 52);
			int b = (int)(Math.random() * 52);
				
			Card temp = deck[a];
				
			deck[a] = deck[b];
			deck[b] = temp;
		}
	}
	
	//shuffle method with preset number of shuffles
	public void shuffleDeck()
	{
		for (int i = 1; i <= 100; ++i)
		{
			int a = (int)(Math.random() * 52);
			int b = (int)(Math.random() * 52);
				
			Card temp = deck[a];
				
			deck[a] = deck[b];
			deck[b] = temp;
		}
	}
	
	//display deck method
	public void displayDeck()
	{
		System.out.println("\nCurrent Deck in undealt form: ");
		
		int cardsThisRow = 1;
		for (int i = 0; i < deck.length; ++i)
		{
			final int CardsPerRow = 8;
			
			if (cardsThisRow < CardsPerRow)
			{
			System.out.print(this.deck[i]);
			System.out.print(" ");
			cardsThisRow++;
			}
			
			else if (cardsThisRow == CardsPerRow)
			{
				System.out.println(this.deck[i]);
				cardsThisRow = 1;
				
			}
			
			
		}
	}
	
	//display the deck... but only the cards that have been dealt
	public void displayCardsDealt()
	{
		System.out.println("\n\nCards dealt: ");
			
		int cardsThisRow = 1;
		for (int i = 0; i < this.getCardsDealt(); ++i)
		{
			final int CardsPerRow = 8;
				
			if (cardsThisRow < CardsPerRow)
			{
			System.out.print(this.deck[i]);
			System.out.print(" ");
			cardsThisRow++;
			}
				
			else if (cardsThisRow == CardsPerRow)
			{
				System.out.println(this.deck[i]);
				cardsThisRow = 1;
					
			}
				
				
		}
	}
	
}
