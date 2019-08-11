
public class Card {
	
	private Rank rank;
	private Suit suit;
	
	public Card(){}
	
	Card(Rank rank, Suit suit){
		
		this.rank = rank;
		this.suit = suit;
	}
	
	Card(int rankNum, int suitNum){
		
		for (Rank r : Rank.values()){
			if(r.ordinal() == rankNum)
				this.rank = r;
		}
		for (Suit s : Suit.values()){
			if(s.ordinal() == suitNum)
				this.suit = s;
		}
	}

	public int getPoints(){
		return this.rank.points;
	}
	
	public int getOrder(){
		return this.suit.order;
	}
	
	public Rank getRank(){
		return this.rank;
	}
	
	public Suit getSuit(){
		return this.suit;
	}

	@Override
	public String toString() {
		return "Card [rank=" + rank + ", suit=" + suit + "]";
	}
}

