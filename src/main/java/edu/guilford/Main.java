package edu.guilford;
//Dara Adegoroye (SeaOreos) 09/19/24
import java.util.Random; //IMPORTS THE LIBRARY WITH THE RANDOM COMMANDS
import java.util.Scanner; //IMPORTS THE LIBRARY WITH THE SCANNER COMMANDS

public class Main {
    private static final Random rand = new Random(); //DECLARES A NEW VARIABLE FOR RANDOM NUMBERS CALLED RANDOM
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //DECLARES A NEW VARIABLE FOR THE SCANNER CALLED SCAN
        System.out.print("HOWDY TRAVELER! YOU MUST ROLL TEN DIE OR YOU WILL ROLL AND D13! HOW MANY SIDES? ");
        int sides = scan.nextInt(); //WHENEVER SIDES IS USED LATER IN THE CODE, IT USES THE NUMBER INPUTTED BY THE PLAYER
        System.out.print("HOW MANY DIE ARE YOU ROLLING??? ");
        int number = scan.nextInt(); //WHENEVER NUMBER IS USED LATER IN THE CODE, IT USES THE NUMBER INPUTTED BY THE PLAYER
        int sum = 0; //THE SUM STARTS AT ZERO BEFORE THE OTHER RESULTS ARE ADDED
        // default for loop, prints loop variable as it counts up
        for (int i = 0; i < number; i++) { //CONDITIONS FOR THE FOR LOOP; i IS DECLARED TO START AT ZERO; i MUST BE LESS THAN THE NUMBER THAT THE PLAYER INPUTTED FOR NUMBER OF DIE BEING ROLLED; KEEPS ADDING ONE VALUE TO i UNTIL IT EXCEEDS NUMBER
            int diceRoll = rand.nextInt(1, sides);
           sum += diceRoll; //ADDS UP ALL OF THE DIE BEFORE THIS POINT
           System.out.println("You rolled a " + diceRoll); //HI I WANTED THIS HERE TO CHECK IF THE ADDING THING WAS RIGHT 💃
           //System.out.println("sum of " + i + "d" + sides + " = " + sum);
           
        }
        System.out.println(number + "d" + sides + "=" + sum); 
        scan.close(); 
    }
    
}