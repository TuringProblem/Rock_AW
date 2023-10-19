import java.util.Scanner;
import java.util.Random;

public class Rock_AW {
    public static void main(String[] args) throws Exception {
        char userInput, computerRandom;
        int computerInput;
        char[] computerCovert = {'R', 'P', 'S', 'L', 'K'};

        Scanner keyboard = new Scanner(System.in);
        Random computer = new Random();

        computerInput = (char)(computer.nextInt(computerCovert.length));
        computerRandom = computerCovert[computerInput];
        System.out.println(computerRandom);

        System.out.println("Please enter R for (Rock), P for (Paper), S for (Scissors), L for (Lizards), and K for (Spock): ");

        userInput = (char)System.in.read();

        keyboard.nextLine();

        //nested if

        if (userInput != 'R')
            if (userInput != 'P')
                if (userInput != 'S')
                    if (userInput != 'L')
                        if (userInput != 'K')
                            System.out.println("You have entered an invalid Character.");

        //if-else statement for calculations

        if (userInput == computerRandom) {
            System.out.println("You have tied with the computer! ");
        } else if (userInput == 'R' && computerRandom == 'L' || userInput == 'R' && computerRandom == 'S' || userInput == 'S' && computerRandom == 'P' || userInput == 'S' && computerRandom == 'L' || userInput == 'K' && computerRandom == 'S' || userInput == 'K' && computerRandom == 'R' || userInput == 'L' && computerRandom == 'K' || userInput == 'L' && computerRandom == 'P' || userInput == 'P' && computerRandom == 'R' || userInput == 'P' && computerRandom == 'K') {
            System.out.printf("You have won! you beat them with (%c)", userInput);
        } else if (userInput == 'R' && computerRandom == 'P' || userInput == 'R' && computerRandom == 'K' || userInput == 'S' && computerRandom == 'K' || userInput == 'S' && computerRandom == 'R' || userInput == 'K' && computerRandom == 'P' || userInput == 'K' && computerRandom == 'L' || userInput == 'L' && computerRandom == 'S' || userInput == 'L' && computerRandom == 'R' || userInput == 'P' && computerRandom == 'K' || userInput == 'P' && computerRandom == 'L'){
            System.out.printf("You have lost using (%c)", userInput);
        } else
            System.out.println("No one wins... try again");

    }//end main
}//end class