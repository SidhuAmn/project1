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
        /*
        For suit in Suits
          For rank in Rank
               SET card to card with rank & suit
               CALL cards.add with card
          END FOR 
        END FOR
        */
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
            int loc=(int)(Math.random()*cards.size());
            temp.add(cards.get(loc));
            cards.remove(loc);   
        }
        cards=temp;
           
        }
    public  void deal(Hand[] hands,int perHand){
        for(int i=0; i<perHand;i++){
            for(int j = 0; j<hands.length;j++){
                this.give(cards.get(0),hands[j]);
            }
        }
    }
    
    public void deal(Hand hand, int perHand){
        //Deal to a single hand
        for(int i=0;i<perHand;i++){
            this.give(cards.get(0),hand);
        }
    }
    
    public void flipCard(Card c){
        c.flipCard();
    }
    
    
    
}
