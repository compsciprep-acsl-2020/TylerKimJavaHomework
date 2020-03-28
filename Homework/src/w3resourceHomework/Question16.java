package w3resourceHomework;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class Question16 {

    String input;

    public Question16(String input) {
        this.input = input;
    }

    public ArrayList<Byte> stringToByteArray() {
        ArrayList<Byte> byteArrayList = new ArrayList<>();
        byte[] b = input.getBytes();


        for(int i = 0; i < b.length; i++) {
            byteArrayList.add(b[i]);
        }


        return byteArrayList;
    }

}
