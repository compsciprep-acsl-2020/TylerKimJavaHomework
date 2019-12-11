import java.lang.reflect.Array;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class NinetyNine {

    public static void main(String[] args) {
        //Declaration
        Random randomizer = new Random();
        Scanner input = new Scanner(System.in);
        int finalScore = 0;
        int initialPlayerScore = 0;
        ArrayList<Integer> availableCards = new ArrayList<>();
        ArrayList<String> playerDisplayedCards = new ArrayList<>();
        ArrayList<String> playerStartingCards = new ArrayList<>();
        ArrayList<Integer> tempValueCards = new ArrayList<>();
        ArrayList<Integer> playerNumberValueCards = new ArrayList<>();


        //Initiation
        System.out.println("Are you ready to play?");
        input.next();

        //Setup the game
        //Set up the available cards
       availableCards = createStandardDeck();

        //Set up the Initial Scores
        initialPlayerScore = randomizer.nextInt(99);
       playerDisplayedCards.add(Integer.toString(initialPlayerScore));


       //Pick Three Random Numbers
        for(int i = 0; i < 3; i++) {
            playerNumberValueCards.add(randomizerValue(availableCards));
            int nameValue = playerNumberValueCards.get((i));
            availableCards.remove(new Integer(nameValue));
        }

        System.out.println(availableCards);
        System.out.println(playerNumberValueCards);
    }

    //create available cards
    public static ArrayList<Integer> createStandardDeck() {
        ArrayList<Integer> availableCards = new ArrayList<>();
        availableCards.add(2);
        availableCards.add(2);
        availableCards.add(3);
        availableCards.add(3);
        availableCards.add(4);
        availableCards.add(4);
        availableCards.add(5);
        availableCards.add(5);
        availableCards.add(6);
        availableCards.add(6);
        availableCards.add(7);
        availableCards.add(7);
        availableCards.add(8);
        availableCards.add(8);
        availableCards.add(9);
        availableCards.add(9);
        availableCards.add(10);
        availableCards.add(10);
        availableCards.add(11);
        availableCards.add(11);
        availableCards.add(12);
        availableCards.add(12);
        availableCards.add(13);
        availableCards.add(13);
        availableCards.add(14);
        availableCards.add(14);
        availableCards.add(2);
        availableCards.add(2);
        availableCards.add(3);
        availableCards.add(3);
        availableCards.add(4);
        availableCards.add(4);
        availableCards.add(5);
        availableCards.add(5);
        availableCards.add(6);
        availableCards.add(6);
        availableCards.add(7);
        availableCards.add(7);
        availableCards.add(8);
        availableCards.add(8);
        availableCards.add(9);
        availableCards.add(9);
        availableCards.add(10);
        availableCards.add(10);
        availableCards.add(11);
        availableCards.add(11);
        availableCards.add(12);
        availableCards.add(12);
        availableCards.add(13);
        availableCards.add(13);
        availableCards.add(14);
        availableCards.add(14);


        return availableCards;
    }

    //find random Value
    public static int randomizerValue(ArrayList<Integer> dataSet){
        Random randomizer = new Random();
        int index = 0;
        int outputValue = 0;

        index = randomizer.nextInt(dataSet.size());
        outputValue = dataSet.get(index);

        return outputValue;
    }

    //using the random value find the string
    public static String randomizerString(int givenValue) {

        if(givenValue < 10) {
            return Integer.toString(givenValue);
        }

        switch(givenValue) {
            case 10:
                return "T";

            case 11:
                return "J";

            case 12:
                return "Q";

            case 13:
                return "K";

            case 14:
                return "A";
        }

        return null;
    }


}
