

public class Player {
	private Hand hand=new Hand();
	
	@Override
	public String toString() {
		return "Player [hand=" + hand + "]";
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public Player(){};
	
}
