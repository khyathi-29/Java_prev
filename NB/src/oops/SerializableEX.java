package oops;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableEX {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("/Users/khyathi/Documents/Practise.txt");
        Employee emp = new Employee("khyathi","india",5678,5000);
        ObjectOutputStream obj = new ObjectOutputStream(file);
        obj.writeObject(emp);


    }
}
