package Homework;

import java.util.Arrays;
import java.util.List;

public class test {

    String test = "test";
    String[] arr = test.split("");

    public static void main(String[] args)
    {
        List<String> firstList = Arrays.asList("A","A","B");
        List<String> secondList = Arrays.asList("H","G", "F", "H", "K", "I", "M");

        Node firstRootNode = createNode(firstList);
    }

    public static  Node createNode(List<String> nodeList)
    {
        Node rootNode = new Node(nodeList.get(0));

        for(int i=1; i<nodeList.size(); i+=2)
        {


        }
        constructNode(rootNode, nodeList.get(1), nodeList.get(2));
        System.out.println(rootNode.getInfo());
        return rootNode;
    }

    public static void constructNode(Node parentNode, String leftChild, String rightChild)
    {
        if(leftChild != null) {
            parentNode.setLeftChild(new Node(leftChild));
        }

        if (rightChild != null) {
            parentNode.setRightChild(new Node(rightChild));
        }

    }


}

