import java.io.*;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.math.*;

public class Guess
{
    // instance variables - replace the example below with your own
    private String playStatus;
    private String playerName;
    private int randNum;
    private int playerGuess;

    /**
     * Constructor for objects of class Guess
     */
    public void Setup()
    {
        // initialise instance variables
        playStatus = "";
        playerName = "";
        randNum = 0;
        playerGuess = 0;
    }

    public void displayOpeningMessage(){
        System.out.println ("Hello, welcome to number guess!");
    }

    public void playGame(){
        playerName = JOptionPane.showInputDialog("Please enter your name");//Enter player name
        playStatus = JOptionPane.showInputDialog("Hello welcome to number geusser, please type 'P' in the next box if you wish to play. Type in anything else if you wish not to play");
        if (playStatus.equals("P")) {
            Random rn = new Random();
            randNum = rn.nextInt(50); //Computer generates a number between 1 and 50
            playerGuess = Integer.parseInt (JOptionPane.showInputDialog("Please enter your guess"));
            if (){
                System.out.println ("Well done, you guessed the number! Have a great life.");
            }
            
            else{
                System.out.prnitln ("You got it wrong. Don't worry, if you want to know it was " + randNum);
            }

        }
        else {

        }
        
             	
        //3.5               	While found equals false do
        //3.6   	        	        	enter lucky guess from player
        //3.7               	        	if guess equals random number then
        //3.8                           	        	set found to true
        //3.9               	        	else if guess is less than random number then
        //3.10             	        	        	display a less than message
        //3.11 	        	        	else
        //3.12             	        	        	display a more than message
        //3.13             	        	end if
        //3.14 	        	end while
        //3.15             	Display results
        //3.16 	else
        //3.17             	quit game
        //3.18 	end if

    }

    public void displayClosingMessage(){
        System.out.prnitln ("You got it wrong. Don't worry, if you want to know it was " + randNum);

    }
}