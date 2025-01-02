package oops;

public class CE2 {
    public CE2(){
        this("apple");//constructor calling
    }
    public CE2(String name){
        this("banana", "carrot");
        System.out.println(name+" ");
    }
    public CE2(String name, String name1){
        this("duck","egg", "carrot");
        System.out.println(name+" "+name1);
    }
    public CE2(String name, String name1, String name2)
    {
        System.out.println(name+" "+name1+" "+name2);
    }
    public static void main(String[] args)
    {
        CE2 ex = new CE2();// object creation, calling the constructor
    }
}
