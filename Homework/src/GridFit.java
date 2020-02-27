import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GridFit {

    public static void main(String args[]) throws FileNotFoundException {

        //Initialization
        Scanner input = new Scanner(new File("/Users/elitetazering935/dev/TylerKimJavaHomework/Homework/src/GridFitInput"));

        while(input.hasNext()) {
            //blocked
            String tempText = input.nextLine();
            ArrayList<Integer> blockedNumbersList = getListOfBlockedNumber(tempText);
            ArrayList<Integer> locations = new ArrayList<>();
            ArrayList<int[][]> tempArrayList = new ArrayList<>();
            int[][] tempArr = new int[1][1];

            System.out.println(blockedNumbersList);

            //create grid
            int[][] grid = createGrid();

            //block numbers
            grid = blockNumbersOnGrid(grid, blockedNumbersList);

            //first pattern
            tempArrayList = firstPattern(grid);
            tempArr = tempArrayList.get(0);
            locations.add(tempArr[0][0]);
            grid = tempArrayList.get(1);

            for(int x = 0; x < grid.length; x++) {
                for(int y = 0; y < grid.length; y++) {
                    System.out.println(grid[x][y]);
                }
            }

            System.out.println(locations);
        }
        
    }

    //creates the grid
    public static int[][] createGrid() {
        int[][] grid =  {{21, 22, 23, 24, 25},
                         {16, 17, 18, 19, 20},
                         {11, 12, 13, 14, 15},
                         {6, 7, 8, 9, 10},
                         {1, 2, 3, 4, 5} };
        return grid;
    }

    //creates the list of blocked numbers
    public static ArrayList<Integer> getListOfBlockedNumber(String text) {
        String[] arrOfString = text.split(", ");
        ArrayList<Integer> blockedNumber = new ArrayList<>();

        for(int i = 0; i  < arrOfString.length; i++) {
            blockedNumber.add(Integer.parseInt(arrOfString[i]));
        }

        blockedNumber.remove(0);

        return blockedNumber;
    }

    //block numbers of grid
    public static int[][] blockNumbersOnGrid(int[][] grid, ArrayList<Integer> blockedNumbers) {

        //act of blocking
        for(int i = 0; i < blockedNumbers.size(); i++) {
            for(int x = 0; x < grid.length; x++) {
                for(int y = 0; y < grid.length; y++) {
                    if(grid[x][y] == blockedNumbers.get(i)) {
                        grid[x][y] = 0;
                    }
                }
            }
        }

        return grid;

    }

    //first pattern
    public static ArrayList<int[][]> firstPattern(int[][] grid) {
        int[][] lowestNumber = {{0}};
        ArrayList<Integer> location = new ArrayList<>();
        ArrayList<int[][]> finalValue = new ArrayList<>();

        int counter = 0;

        //check if pattern works
        outerloop:
        for(int x = grid.length-1; x >= 0; x--) {

            for(int y = 0; y < grid.length; y++) {
                if(grid[x][y] != 0) {
                    lowestNumber[0][0] = grid[x][y];
                    location.add(lowestNumber[0][0]);
                    break outerloop;
                }
            }
        }

        //block that particular space
       grid = blockNumbersOnGrid(grid, location);

        //add to final array
        finalValue.add(lowestNumber);
        finalValue.add(grid);

        return finalValue;

    }

    //second pattern
    public static ArrayList<int[][]> secondPattern(int[][] grid) {

    }

}
