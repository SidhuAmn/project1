/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GinRummy;

/**
 *
 * @author Owner
 */
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
