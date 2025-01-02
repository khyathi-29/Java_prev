package java8;

@FunctionalInterface
interface calculator{
    public void add(int a, int b);
}


public class addition implements calculator{
    public static void main(String[] args){
        calculator cal = new calculator(){
            @Override
            public void add(int a, int b){
                System.out.println("add is "+(a+b));
            }
        };
        cal.add(20,30);
    }

    @Override
    public void add(int a, int b) {
        System.out.println("add is "+(a+b));
    }
}
