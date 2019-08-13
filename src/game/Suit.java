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
public enum Suit {
    
	CLUBS(1),
	DIAMONDS(2),
	HEARTS(3),
	SPADES(4);
	
	public final int order; // for organizing hand

	Suit(int order){
		this.order = order;
	}
}
