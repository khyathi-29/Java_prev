package IO_Handling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileEX {
    public static void main(String args[]) throws IOException {
        File fil = new File("/Users/khyathi/Documents/Practise.txt");
        /*System.out.println(file.exists());
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println("File is created");*/
        FileWriter file = new FileWriter(fil);
        file.write(1234);// it cant read int values just reads ASCii values
        file.write("goof \n.morning");
        char ch[] = {'a', 'b','c','d'};
        file.write(ch);
        file.flush();// needs to be called so that any remaining data needs to be pushed
        file.close();
        //file.write(true); cannot write boolean values



    }
}
