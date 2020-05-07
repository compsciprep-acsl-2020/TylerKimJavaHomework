package Homework;

import java.util.ArrayList;
import java.util.Collections;

public class Tree {
    public static void main(String args[]) {
        String testInput = "AAB, HGFHKIM";
        String[] arr = testInput.split(", ");
        String reference = arr[0];
        String biggerTree = arr[1];

        ArrayList<String> referenceArrayList = convertArrToArrayList(reference.split(""));
        ArrayList<String> biggerTreeArrayList = convertArrToArrayList(biggerTree.split(""));


        System.out.println(referenceArrayList);
    }

    //convert array to arraylist
    public static ArrayList<String> convertArrToArrayList(String[] arr) {
        ArrayList<String> output = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            output.add(arr[i]);
        }

        return output;
    }

    //root node
    public class RootNode {
        public Node greaterChildNode;
        public Node lesserChildNode;
    }

    //regular node
    public class Node {

        public Node parentNode;
        public Node greaterChildNode;
        public Node lesserChildNode;

    }

    //find which value has greater ASCII value
    public static int relativeValueOfChildNode(char parent, char child) {
        int asciiParent = (int) parent;
        int asciiChild = (int) child;


        if(asciiParent > asciiChild) {
            return 0;

        } else if(asciiParent < asciiChild) {
            return 1;

        } else {
            return 0;
        }
    }

    //set up root node
    public RootNode RootNodeFinder(char[] charArr) {

        //root node
        RootNode rootNode = new RootNode();

        if((int) charArr[1] > (int) charArr[0]) {

            rootNode.greaterChildNode = new Node();

        } else {

            rootNode.lesserChildNode = new Node();

        }

        if(rootNode.lesserChildNode == null) {
            for(int i = 2; i < charArr.length; i++) {

                if((int) charArr[i] < (int) charArr[0]) {
                    rootNode.lesserChildNode = new Node();
                }

            }

        } else {
            for(int i = 2; i < charArr.length; i++) {

                if((int) charArr[i] < charArr[0]) {
                    rootNode.greaterChildNode = new Node();
                }

            }
        }

        return rootNode;
    }



    //form binary search tree
    public void formTree(String string) {
        char[] charArr = string.toCharArray();




        for(int i = 1; i < charArr.length; i++) {

            if((int) charArr[i] > (int) charArr[i-1]) {

                System.out.println("greater");

            } else {

                System.out.println("lesser");

            }

        }

    }

    //form component arraylist
    public static ArrayList<String> componentOfNodes(ArrayList<String> stringSet) {
        ArrayList<String> output = new ArrayList<>();

        //add root
        output.add(stringSet.get(0));
        stringSet.remove(0);

        int layerDifferentiator = 2;

        for(int i = 0; i < stringSet.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();

            for(int j = 0; j < layerDifferentiator; j++) {
                stringBuilder.append(stringSet.get(0));
                stringSet.remove(0);
                i++;
            }

            output.add(stringBuilder.toString());

            layerDifferentiator *= 2;

        }

        return output;
    }

}


