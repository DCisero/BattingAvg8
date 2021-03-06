/**
 * Created by D.Cisero on 7/19/17.
 */

import java.util.Scanner;

public class BatterUp {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        String answer = "Y";

    do {
        int userInput = 0;
        int hits = 0;
        double avgBat;
        int bases = 0;
        double avgSlug = 0;


            System.out.println("Welcome to Batting Average Calculator!");
            System.out.println();

            //ask for user input for number of bats
            System.out.println("Enter number of times at bat: ");
            userInput = scan.nextInt();
            scan.nextLine();

            //declare and initialize array
            int[] atBat = new int[userInput];
            System.out.println();


            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");


            //create a loop for number of bases earned by the batter
            for (int i = 0; i < atBat.length; i++) {
                System.out.println("Result for at-bat: ");
                atBat[i] = scan.nextInt(); //slotting in the # for as many times as user input
                System.out.println();
            }
            //calculate the average batting average- display 3 deci.
            //create for loop < 0 to count # of times not equal to 0
            for (int i = 0; i < atBat.length; i++) {
                if (atBat[i] >= 1) {
                    hits+=i;
                    bases += atBat[i];
                }
            }
            avgBat = hits / userInput;
            String avg = String.format("%.3f",avgBat);
            System.out.println("Player batting average: " + avg);

            //calculate the slugging average- display 3 dec.
            avgSlug = bases/userInput;
            String slug = String.format("%.3f", avgSlug);
            System.out.println("Player slugging percentage: " + slug);
            System.out.println();

            System.out.println("Another batter? (y/n): ");
            answer = scan.next();
            System.out.println();

        } while (answer.equalsIgnoreCase("y"));

    }
}



