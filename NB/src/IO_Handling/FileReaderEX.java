package IO_Handling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEX {
    public static void main(String args[]) throws IOException {
        FileReader fil = new FileReader("/Users/khyathi/Documents/Practise.txt");
        //USUALLY read works for one charector at a time so read in a loop is better
        int value = fil.read();
        while(value !=-1) {
            System.out.println((char)value);
            value=fil.read();
        }



    }
}

