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
           
    }
    public void flipCard(){
        for(Card c : cards){
            c.flipCard();
        }
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
