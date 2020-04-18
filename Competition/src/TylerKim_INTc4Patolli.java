import java.util.ArrayList;

public class TylerKim_INTc4Patolli {

    public static void main(String args[]) {
        //get starting location
        String testInput = "4 14 24 1 8 12 6 6 3 5 1 5 6";

        int[][] board = createBoard();
        ArrayList<int[]> inputValues = findInput(testInput);
        int[] player1MarkerLocation = inputValues.get(0);
        int[] capturedMarkerLocation = inputValues.get(1);
        int numberOfDiceMoves = inputValues.get(2)[0];
        int[] diceResults = inputValues.get(3);

        ArrayList<Integer> output = new ArrayList<>();

        //run until there are no more moves left
      for(int i = 0; i < numberOfDiceMoves; i++) {

      }
    }



    //setup methods
        //initialization
    public static ArrayList<int[]> findInput(String inputValue) {
        String[] inputArray = inputValue.split(" ");

        int[] player1MarkerLocation = new int[3];
        int[] capturedMarkerLocation = new int[3];
        int[] diceResults = new int[inputArray.length - 7];
        int[] numberOfDiceMoves = new int[1];

        ArrayList<int[]> finalArray = new ArrayList<>();

        //marker 2
        for (int i = 0; i < 3; i++) {
            capturedMarkerLocation[i] = Integer.parseInt(inputArray[i]);
        }

        //marker 1
        for (int i = 0; i < 3; i++) {
            player1MarkerLocation[i] = Integer.parseInt(inputArray[i + 3]);
        }

        numberOfDiceMoves[0] = Integer.parseInt(inputArray[6]);

        //moveList
        for (int i = 0; i < inputArray.length - 7; i++) {
            diceResults[i] = Integer.parseInt(inputArray[i + 7]);
        }


        finalArray.add(player1MarkerLocation);
        finalArray.add(capturedMarkerLocation);
        finalArray.add(numberOfDiceMoves);
        finalArray.add(diceResults);

        return finalArray;

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




    //game mechanics
        //move markers
    public static int[] moveMarkers(int[] playerMarkers, int[] capturedMarkers, int diceRoll, int[][] board) {
        int lowestValueIndex = indexOfLowestValue(playerMarkers);
        int lowestValue = playerMarkers[lowestValueIndex];

            //if move lands on same space as another marker
        if(doesMarkerLandInOccupiedPosition(playerMarkers, capturedMarkers, diceRoll, playerMarkers[lowestValueIndex])) {
            return playerMarkers;
        }

        int tempVal = playerMarkers[lowestValueIndex] += diceRoll;

             //testing cases
        if(isPrimeNumber(tempVal)) {
            playerMarkers[lowestValueIndex] = primeRule(playerMarkers, capturedMarkers, tempVal);

        } else if(isPerfectNumber(tempVal)) {
            playerMarkers[lowestValueIndex] = perfectSquareRule(playerMarkers, capturedMarkers, tempVal);

        } else {
            if(movedHorizontalToVertical(lowestValue, tempVal, board, diceRoll)) {
                playerMarkers[lowestValueIndex] = findMultipleOfNumber(lowestValue, diceRoll, tempVal);
            }

        }
        return playerMarkers;
    }


        //if it is prime move 6 forward unless unable to
    public static int primeRule(int[] playerPositions, int[] capturedPositions, int tempValue) {

        for(int x = 0; x < 6; x++) {
            for(int i = 0; i < playerPositions.length; i++) {

                for(int j = 0; j < capturedPositions.length; j++) {

                    if((tempValue + 1) == capturedPositions[j] || (tempValue + 1) == playerPositions[i]) {
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
    public static int perfectSquareRule(int[] playerPositions, int[] capturedPositions, int tempValue) {

        for(int i = 0; i < 6; i++) {
            for(int x = 0; x < playerPositions.length; x++) {

                for(int j = 0; j < capturedPositions.length; j++) {

                    if((tempValue - 1) == capturedPositions[j] || (tempValue - 1) == playerPositions[x]) {
                        return tempValue;
                    } else {
                        tempValue--;
                    }
                }
            }
        }return tempValue;
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


        //does marker land in occupied position
    public static boolean doesMarkerLandInOccupiedPosition(int[] playerPositions, int[] capturedPositions, int diceRoll, int markerValue) {
        for(int i = 0; i < playerPositions.length; i++) {
            if((markerValue += diceRoll) == playerPositions[i]) {
                return true;
            }

            if((markerValue += diceRoll) == capturedPositions[i]) {
                return true;
            }

        }
        return false;
    }




    //supplementary
        //find multiple of number
    public static int findMultipleOfNumber(int markerValue, int multipleValue, int tempVal) {
        for(int i = markerValue; i < tempVal; i++) {
            if(i % multipleValue == 0) {
                return i;
            }
        }

        return markerValue;
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

        //convert array to arraylist
    public static ArrayList<Integer> convertArrToArrayList(int[] arr) {
        ArrayList<Integer> output = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            output.add(arr[i]);
        }

        return output;
    }
}
