package oops;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileNotFoundException;

public class DeserialiazableEX {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("/Users/khyathi/Documents/Practise.txt");
        ObjectInputStream obj = new ObjectInputStream(file);
        Employee emp = (Employee)obj.readObject();

       System.out.println(emp);

    }
}
