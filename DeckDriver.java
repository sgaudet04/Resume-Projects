
public class DeckDriver 
{
	public static void main(String [] args)
	{
		Deck myDeck = new Deck();
		
		myDeck.shuffleDeck();
		
		myDeck.displayDeck();
		
		myDeck.dealXCards(10);
		
		myDeck.displayCardsDealt();
		
	
	}
}
