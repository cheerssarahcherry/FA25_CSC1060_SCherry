
public class Card {
	private int suit;
	private int rank;
	
	private static final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private static final String[] SUITS = { "clubs", "diamonds", "hearts", "spades"};
	
	public Card(int rank, int suit) {
		this.suit = suit;
		this.rank = rank;
	}

	public boolean equals(Card that)
	{
		return this.rank == that.rank && this.suit == that.suit;
	}
	
	public int compareTo(Card that)
	{
		if(this.suit<that.suit) return -1;
		if(that.suit<this.suit) return +1;
		if(this.rank<that.rank) return -1;
		if(that.rank<this.rank) return +1;
		
		return 0;
	}
	
	
	public int getSuit() {
		return suit;
	}

	public void setSuit(int suit) {
		this.suit = suit;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		String[] ranks = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

		
		String[] suits = { "clubs", "diamonds", "hearts", "spades"};
		
		return ranks[this.rank] + " of " + suits[this.suit];		
	}
	
	
	
	
}
