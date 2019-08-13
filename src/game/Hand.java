/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GinRummy;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Hand {
    private ArrayList<Card> hand;
	public Hand() {
		this.hand=new ArrayList<Card>();
	}

	public Hand(ArrayList<Card> hand) {
		super();
		this.hand = hand;
	}
	
	public ArrayList<Card> getHand() {
		return hand;
	}

	public void add(Card c) {
		this.hand.add(c);
	}
	public Card remove(int index) {
		return this.hand.remove(index-1);
	}

	@Override
	public String toString() {
		return "Hand [hand=" + hand + "]";
	}
}
