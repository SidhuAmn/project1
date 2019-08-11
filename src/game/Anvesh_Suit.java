
public enum Suit {
	
	CLUBS(1),
	DIAMONDS(2),
	HEARTS(3),
	SPADES(4);
	
	public final int order; // for organizing hand

	Suit(int order){
		this.order = order;
	}
}
