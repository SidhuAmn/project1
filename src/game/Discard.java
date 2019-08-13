/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GinRummy;

import java.util.ArrayList;

/**
 *
 * @author Timur Sadykhov
 * @modified by Group GinRummy
 */
public class Discard {
    private ArrayList<Card> discardpile;
	public Discard() {
		this.discardpile = new ArrayList<Card>();
	}
	public Card getTopCard() {
		return discardpile.get(discardpile.size()-1);
	}
	public Card draw() {
		return discardpile.remove(discardpile.size()-1);
	}
	public void add(Card c) {
		this.discardpile.add(c);
	}
	@Override
	public String toString() {
		return "Discard [discardpile=" + discardpile + "]";
	}
}
