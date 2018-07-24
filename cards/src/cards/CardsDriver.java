/**
 * ---------------------------------------------------------------------------
 * File name: CardsDriver.java
 * Project name: cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 25, 2016
 * ---------------------------------------------------------------------------
 */

package cards;

import java.util.Scanner;

/**
 * Use Different Programs To Simulate A Deck Of Cards
 *
 * <hr>
 * Date created: Feb 25, 2016
 * <hr>
 * @author Justin Adams
 */
public class CardsDriver
{

	/**
	 * Driver Program Deal A Head Of Cards         
	 *
	 * <hr>
	 * Date created: Feb 25, 2016
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args)
	{
		Deck deck = new Deck(); //Deck Of Cards
		int iHand; //Number In Hand
		int iPlayers; //Number Of Players
		int iCount; //Counter For Players And Cards Dealt
		Scanner kb = new Scanner(System.in);
		deck.shuffle ( );
		
		do
		{
			System.out.println ("How many cards are in one hand? ");
			try
			{
				iHand = kb.nextInt ( );
				
			}
			catch (Exception e)
			{
				System.out.println ("Try Again");
				iHand = -1;
			}
			System.out.println ("How many players are playing? ");
			iPlayers = kb.nextInt ( );
			if (iHand * iPlayers > 52)
			{
				System.out.println ("Try Again\n\n");
				iHand = -1;
				iPlayers = -1;
			} 
		}
		while (iHand < 1&&iPlayers < 1);
		iCount = iPlayers;
		for (int index = 0;index<iPlayers;index++)
		{
			System.out.println ("\nPlayer: " + iCount + deck.dealAHand (iHand));
			iCount--;
		}
	}//End main(String)

}//End CardDriver
