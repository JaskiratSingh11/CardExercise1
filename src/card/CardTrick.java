/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Name- Jaskirat Singh
Student ID- 991754233
*/
package card;

import java.util.Scanner;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Jaskirat Singh - 991754233
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        
        Card[] magicHand = new Card[7];
        Random random= new Random();// random variable created for genrating random numbers
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1);  // This would select a random number between 1 and 13. I added 1 because if it generates 0 as number, 1 rould be added to it.
            c.setSuit(Card.SUITS[random.nextInt(4)]);  // This would genrate random integer between 0 and 3. 4 would not be included/
            magicHand[i] = c;  
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
         System.out.println("Magic Hand Cards:");
        for (Card card : magicHand) {
            System.out.println(card.getSuit() + " " + card.getValue());
        }
         Scanner k = new Scanner(System.in);
          System.out.print("Enter a card value (1-13): ");
        int UserEnteredValue = k.nextInt();
         System.out.print("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades): ");
        int UserSuitIndex = k.nextInt();
        
        Card UserCard = new Card();// new instance UserCard is created. This would contain the value entered by user
        UserCard.setValue(UserEnteredValue);
        UserCard.setSuit(Card.SUITS[UserSuitIndex]);
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        boolean cardFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == UserCard.getValue() && card.getSuit().equals(UserCard.getSuit())) {
                cardFound = true;
                break;
            }
        }

        if (cardFound==true) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
        //Then report the result here
        // add one luckcard hard code 2,clubs
       
}
}