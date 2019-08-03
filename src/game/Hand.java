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
public class Hand {
     public ArrayList<Card> cards;
    //
    public Hand(){
        cards = new ArrayList<Card>();
    }
    public void clear(){
        cards.clear();
    }
    public void add(Card card){
        cards.add(card);
    }
    public String showHand(){
        /*
        show cards only if all cards are face up
        */
        boolean allFaceUp = true;
        String str = "";
        for(Card c: cards){
            str+= c.toString()+"\n";
            if(!c.isFaceUp){
                allFaceUp=false;
            }
        }
        // if all face up show total
        if(allFaceUp){
            str+="Total points = " + getTotal()+"\n";        
        }
        return str; 
    }
    public void flipCard(){
        for(Card c : cards){
            c.flipCard();
        }
    }
    
    //Return total points of a hand
    public int getTotal(){
        int totalPts = 0;
         boolean hasAce = false;
         //get total point; any aces by default = 1
         for(int i=0; i<cards.size();i++){
             totalPts+= cards.get(i).getRank();
             //check to see if card is an ace
             if(cards.get(i).printRank()=="Ace"){
                 hasAce = true;
             }
             // make ace worth if total points <= 11
             if(hasAce && totalPts <=11){
                 totalPts += 10; //add 10 more i.e ace = 11
             }
         }
        return totalPts;
    }
    
    public boolean give(Card card,Hand otherHand){
         if(!cards.contains(card)){
             return false;
         }        
         else{
             cards.remove(card);
             otherHand.add(card);
             return true;
         }
    } 
    
}
