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

import GinRummy.Card;
import GinRummy.Hand;

public class Counter {
	 ArrayList<Card> clubs = new ArrayList<Card>();
	 ArrayList<Card> diamonds = new ArrayList<Card>();
	 ArrayList<Card> hearts = new ArrayList<Card>();
	 ArrayList<Card> spades = new ArrayList<Card>();
	
	public Hand organizeHand(Hand hand){
		Hand h=new Hand();
		Card temp = new Card();
		for(int i=0; i < 10; i++){
			for(int j = 0; j < 10; j++){
				if(hand.getHand().get(i).getRank().ordinal() <hand.getHand().get(j).getRank().ordinal()){
					temp = hand.getHand().get(i);
					hand.getHand().set(i, hand.getHand().get(j));
					hand.getHand().set(j, temp);
				}
				else if((hand.getHand().get(i).getRank().ordinal() == hand.getHand().get(j).getRank().ordinal()) 
						&& (hand.getHand().get(i).getSuit().ordinal() < hand.getHand().get(j).getSuit().ordinal()))
				{
					temp = hand.getHand().get(i);
					hand.getHand().set(i, hand.getHand().get(j));
					hand.getHand().set(j, temp);
				}
					
			}
		}
		
		for (Card card : hand.getHand()) {
			if(card.getSuit().order==1) {
				h.add(card);
				clubs.add(card);
			}
		}
		for (Card card : hand.getHand()) {
			if(card.getSuit().order==2) {
				h.add(card);
				diamonds.add(card);
			}
		}
		for (Card card : hand.getHand()) {
			if(card.getSuit().order==3) {
				h.add(card);
				hearts.add(card);
			}
		}
		for (Card card : hand.getHand()) {
			if(card.getSuit().order==4) {
				h.add(card);
				spades.add(card);
			}
		}
		hand.getHand().removeAll(hand.getHand());
		hand.getHand().addAll(h.getHand());
		return hand;
	}
	
	
	public int calculateResult(Hand hand) {
		int result=0;
		int i=0;
		organizeHand(hand);
		for (int j = 0; j < hand.getHand().size(); j++) {
			result+=hand.getHand().get(j).getPoints();
		}
		if(clubs.size()>2)
			if (clubs.get(1).getRank().ordinal()==
			clubs.get(0).getRank().ordinal()+1 &&
			clubs.get(1).getRank().ordinal()+1==
			clubs.get(2).getRank().ordinal())
			{
				for(i=2;i<clubs.size();i++) {
					if(clubs.get(i-1).getRank().ordinal()+1==
			clubs.get(i).getRank().ordinal())
						result+=0;
					else
						result+=clubs.get(i).getPoints();
				}
			}
		return result;
	}
}