package IO_Handling;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class BufferedReaderEX {
    public static void main(String args[]) throws IOException {
        FileReader file = new FileReader("/Users/khyathi/Documents/Practise.txt");
        //USUALLY read works for one corrector at a time so read in a loop is better
        BufferedReader fil = new BufferedReader(file);
        String value = fil.readLine();
        while(value !=null) {
            System.out.println(value);
            value=fil.readLine();
        }
// prints everything as it is in file
        // cant get int decimals etc because its char stream


    }
}
