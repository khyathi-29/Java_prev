package oops;

public class ConstructorEx {
    public ConstructorEx(String name){
        System.out.println(name); // passing parameters is known as parametrized constructor
    }
    public ConstructorEx(){
        System.out.println("I am a constructor");
    }
    public static void main(String[] args)
    {
        ConstructorEx ex = new ConstructorEx("Hi");// object creation, calling the constructor
    }
}
