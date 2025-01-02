package IO_Handling;

import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
    public static void main(String args[]) throws IOException {
        FileWriter fi = new FileWriter("/Users/khyathi/Documents/Practise.txt");
        /*System.out.println(file.exists());
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println("File is created");*/
        BufferedWriter file = new BufferedWriter(fi);
        file.write(1234);// it cant read int values just reads ASCii values
        file.write("goof \n.morning");
        file.newLine();// this is different from filewriter
        char ch[] = {'a', 'b','c','d'};
        file.write(ch);
        file.flush();// needs to be called so that any remaining data needs to be pushed
        file.close();
        //file.write(true); cannot write boolean values



    }
}

