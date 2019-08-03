/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class Deck extends Hand {
    
    public void  populate(){
      
        for(Suit suit: Suit.values()){
            for(Rank rank:Rank.values()){
                Card card = new Card(rank,suit);
                // card.flipCard();
                this.add(card);
            }
        }
    }
    
    public void shuffle(){
        
        ArrayList<Card> temp = new ArrayList<Card>();
        while(!cards.isEmpty()) {
            int rand=(int)(Math.random()*cards.size());
            temp.add(cards.get(rand));
            cards.remove(rand);   
        }
        cards=temp;
           
        }
   
    
    public void flipCard(Card c){
        c.flipCard();
    }
    
    
    
}
