package IO_Handling;

import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class PrintWriterEx {
    public static void main(String args[]) throws IOException {
        PrintWriter file = new PrintWriter("/Users/khyathi/Documents/Practise.txt");


        file.println(1234);// it cant read int values just reads ASCii values
        file.println("goof \n.morning");
        file.println();// this is different from filewriter
        char ch[] = {'a', 'b','c','d'};
        file.println(ch);
        file.println(true);
        file.flush();// needs to be called so that any remaining data needs to be pushed
        file.close();
        //file.write(true); cannot write boolean values



    }
}
