/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GinRummy;

/**
 *
 * @author Owner
 */
import java.util.Random;
import java.util.Scanner;

import GinRummy.Deck;
import GinRummy.Discard;
import GinRummy.Player;
public class Play {
    public static boolean declare = false;
	public static Deck deck = new Deck();
	public static Player player = new Player();
	public static Player computer = new Player();
	
	public static void main(String[] args) {
		Counter counter = new Counter();
		deck.shuffle();
		deck.distribute(player, computer);
		startGame();
		if(counter.calculateResult(player.getHand())<
				counter.calculateResult(computer.getHand()))
		System.out.println("Congratulations....YOU WON");
		else
			System.out.println("Sorry you lose..Better luck next time");
	}
	public static void startGame() {
		Discard discard = new Discard();
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		discard.add(deck.getTopCard());
		boolean declare=false;
		while(!declare) {
			playerTurn(discard);
			System.out.println("press 3 to declare or other numeric key to proceed");
			if(in.nextInt()==3) {
				declare=true;
				break;
			}
				
			computerTurn(discard);
		}
	}
	public static void playerTurn(Discard discard) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Your hand: \n"+ player.getHand());
		System.out.println("Top of discard pile : "+discard.getTopCard());
		System.out.println("1. Draw from deck\n2. Draw from discard pile"
				+ "\n3. Declare");
		switch(in.nextInt()) {
		case 1:
			player.getHand().add(deck.draw()); //draw from deck
			break;
		case 2:
			player.getHand().add(discard.draw()); // draw from discard pile
			break;
		case 3:
			declare=true;
			return;
		default:
			System.out.println("Invalid option");
		}
		System.out.println("Your hand : \n"+player.getHand());
		System.out.println("Enter index value of card to be discarded");
		discard.add(player.getHand().remove(in.nextInt()));
		//in.close();
	}
	public static void computerTurn(Discard discard) {
		Random rand = new Random();
		int r = rand.nextInt(2);
		if(r==1) {
			computer.getHand().add(deck.draw()); //draw from deck
		}
		else {
			computer.getHand().add(discard.draw()); //draw from discard
		}
		r= rand.nextInt(10); // computer discard index
		discard.add(computer.getHand().remove(r));
	}
}
