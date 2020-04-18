import java.util.ArrayList;

public class TylerKim_INTc4Patolli {

    public static void main(String args[]) {
        //get starting location
        String testInput = "4 14 24 1 8 12 6 6 3 5 1 5 6";

        int[][] board = createBoard();
        ArrayList<int[]> inputValues = findInput(testInput);
        int[] player1MarkerLocation = inputValues.get(0);
        int[] player2MarkerLocation = inputValues.get(1);
        int[] moveList = inputValues.get(2);
        ArrayList<Integer> output = new ArrayList<>();


        //run until there are no more moves left
        for (int i = 0; i < moveList.length; i++) {
            //differentiate between player and opponent moves

            outerloop:
            if (isEvenNumber(i)) { // player turn


            } else { // opponent turn

            }
        }
    }

    public static int[] moveMarkers(int[] playerMarker, int[] opponentMarker, int diceRoll) {
        int lowestValue = indexOfLowestValue(playerMarker);


        //if move lands on same space as another marker
        if(doesMarkerLandInOccupiedPosition(playerMarker, opponentMarker, diceRoll, playerMarker[lowestValue])) {
            return playerMarker;
        }

        int tempVal =

    }



    //initialization
    public static ArrayList<int[]> findInput(String inputValue) {
        String[] inputArray = inputValue.split(" ");

        int[] player1MarkerLocation = new int[3];
        int[] player2MarkerLocation = new int[3];
        int[] moveList = new int[inputArray.length - 6];
        ArrayList<int[]> finalArray = new ArrayList<>();

        //marker 2
        for (int i = 0; i < 3; i++) {
            player2MarkerLocation[i] = Integer.parseInt(inputArray[i]);
        }

        //marker 1
        for (int i = 0; i < 3; i++) {
            player1MarkerLocation[i] = Integer.parseInt(inputArray[i + 3]);
        }

        //moveList
        for (int i = 0; i < inputArray.length - 6; i++) {
            moveList[i] = Integer.parseInt(inputArray[i + 6]);
        }

        finalArray.add(player1MarkerLocation);
        finalArray.add(player2MarkerLocation);
        finalArray.add(moveList);

        return finalArray;

    }

    //if it is prime move 6 forward unless unable to
    public static int primeRule(int[] playerMoving, int[] playerCapturing, int tempValue) {

        for(int x = 0; x < 6; x++) {
            for(int i = 0; i < playerMoving.length; i++) {

                for(int j = 0; j < playerCapturing.length; j++) {

                    if((tempValue + 1) == playerCapturing[j] || (tempValue + 1) == playerMoving[i]) {
                        return tempValue;
                    } else {
                        tempValue++;
                    }

                }

            }
        }
        return tempValue;
    }

    //if it is perfect square move 6 back unless unable to
    public static int perfectSquareRule(int[] playerMoving, int[] playerCapturing, int tempValue) {


        for(int i = 0; i < 6; i++) {
            for(int x = 0; x < playerMoving.length; x++) {

                for(int j = 0; j < playerCapturing.length; j++) {

                    if((tempValue - 1) == playerCapturing[j] || (tempValue - 1) == playerMoving[x]) {
                        return tempValue;
                    } else {
                        tempValue--;
                    }

                }

            }
        }

        return tempValue;

    }

    //does marker land in occupied position
    public static boolean doesMarkerLandInOccupiedPosition(int[] playerMoving, int[] playerCapturing, int diceRoll, int markerValue) {
        for(int i = 0; i < playerMoving.length; i++) {
            if((markerValue += diceRoll) == playerMoving[i]) {
                return true;
            }

            if((markerValue += diceRoll) == playerCapturing[i]) {
                return true;
            }

        }
        return false;
    }



    //find lowest value
    public static int indexOfLowestValue(int[] initialLocations) {

        int minValue = initialLocations[0];

        for (int i = 1; i < initialLocations.length; i++) {
            if (minValue > initialLocations[i]) {
                minValue = initialLocations[i];
            }
        }

        return indexOfNumberInArr(minValue, initialLocations);
    }

    //find index of a number in an array
    public static int indexOfNumberInArr(int x, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }

        return 0;
    }


    //create board
    public static int[][] createBoard() {
        int[][] board = {
                {0, 0, 0, 0, 1, 52, 0, 0, 0, 0},
                {0, 0, 0, 0, 2, 51, 0, 0, 0, 0},
                {7, 6, 5, 4, 3, 50, 49, 48, 47, 46},
                {8, 9, 10, 11, 12, 41, 42, 43, 44, 45},
                {17, 16, 15, 14, 13, 40, 39, 38, 37, 36},
                {18, 19, 20, 21, 22, 31, 32, 33, 34, 35},
                {0, 0, 0, 0, 23, 30, 0, 0, 0, 0},
                {0, 0, 0, 0, 24, 29, 0, 0, 0, 0},
                {0, 0, 0, 0, 25, 28, 0, 0, 0, 0,},
                {0, 0, 0, 0, 26, 27, 0, 0, 0, 0}};

        return board;
    }

    //prime number tester
    public static boolean isPrimeNumber(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    //perfect square number tester
    public static boolean isPerfectNumber(int x) {
        if ((x % Math.sqrt(x) == 0) && x > 6) {
            return true;
        }
        return false;
    }

    //detect if one horizontal followed by a vertical move has occurred
    public static boolean movedHorizontalToVertical(int previousValue, int finalValue, int[][] board, int diceValue) {
        int changeInI = Math.abs(indexOfNumber(previousValue, board)[0] - indexOfNumber(finalValue, board)[0]);
        int changeInJ = Math.abs(indexOfNumber(previousValue, board)[1] - indexOfNumber(finalValue, board)[1]);

        if (diceValue > 1) {
            //first detect if there is a change in the i and j value and did not touch 2 or 31
            if (changeInI > 0 && previousValue > 3 && finalValue < 3 && previousValue > 31 && finalValue < 31) {
                return true;
            }
        }

        return false;


    }

    //get location of number
    public static int[] indexOfNumber(int number, int[][] board) {
        int[] output = new int[2];

        outerloop:
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == number) {
                    output[0] = i;
                    output[1] = j;
                    break outerloop;
                }
            }
        }

        return output;
    }

    //test if a number is odd
    public static boolean isEvenNumber(int x) {
        if (x % 2 == 0) {
            return true;
        }

        return false;
    }
}
