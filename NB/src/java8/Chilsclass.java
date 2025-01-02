package java8;
//lambda expression can be used on only functional interface
public class Chilsclass{
     public static void main(String[] args){

         FunctionalInterfaceEX A = (name)->System.out.println("The name is "+name);
         A.name("Khyathi");//lambda expression

     }

}
/*public class Chilsclass implements FunctionalInterfaceEX{
    @Override
    public void name(String name) {
        System.out.println("Name is "+ name);
    }
    public static void main(String[] args){
        Chilsclass a = new Chilsclass();
        a.name("abcd");
    }
}*/
