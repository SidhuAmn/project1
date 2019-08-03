/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Owner
 */
public class Card {
     //Private fileds
    private Suit suit;
    private Rank rank;
    public boolean isFaceUp;
    
    //Constructor
    
    public Card(Rank rank,Suit suit){
        this.rank = rank;
        this.suit = suit;
        
        isFaceUp = false;
    }
    
    //public methods
    public String getSuit(){
        return suit.printSuit();
    }
    
    public int getRank(){
        return rank.getRank();
    }
    
    public String printRank(){
        //get rank as string (primarily for aces)
        return rank.printRank();
    }
    public void flipCard(){
        isFaceUp = ! isFaceUp;
    }
    
    
    public String toString(){
        String str = "";
        if(isFaceUp){
        str += rank.printRank() + " of "+suit.printSuit();
        
    }
        else{
            str= "Face down (nothing to see here)";
        }
       return str;
}
}
