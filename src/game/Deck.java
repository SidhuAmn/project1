/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GinRummy;

/**
 *
 * @author Timur Sadykhov
 * @modified by Group GinRummy
 */

import java.util.ArrayList;
import java.util.Collections;

public class Deck{
    private ArrayList<Card> deck = new ArrayList<Card>();
	//private Card[] deck = new Card[52];
	public int cardsInPlay = 0;
	
	public Deck(){
		
		for(Suit s : Suit.values()){
			for(Rank r : Rank.values()){
				deck.add(new Card(r,s));
				
			}
		}
	}
	
	public void distribute(Player p1,Player p2) {
		for (int i = 0; i < 10; i++) {
			p1.getHand().add(deck.get(i));
		}
		for (int i = 0; i < 10; i++) {
			deck.remove(0);
		}
		for (int i = 0; i < 10; i++) {
			p2.getHand().add(deck.get(i));
		}
		for (int i = 0; i < 10; i++) {
			deck.remove(0);
		}
	}
	
	public ArrayList<Card> getDeck(){
		return this.deck;
	}
	
	public Card getTopCard(){
		//this.deck[cardsInPlay].setInPlay(true);
		return this.deck.remove(deck.size()-1);
	}
	
	public void shuffle(){
		Collections.shuffle(this.deck);
	}
    public Card draw() {
    	return this.deck.remove(deck.size()-1);
    }
	@Override
	public String toString() {
		return "Deck [deck=" + deck + "]";
	}
	
}
