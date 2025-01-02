package Collections;
import java.util.HashSet;
public class Hashset {
    public static void main(String[] args){
        HashSet al = new HashSet();
        //Hahset<Integer> al = new Hashset<Omteger>{}
        al.add(123);
        al.add("sjheir");
        al.add(12.34);
        al.add(123);
        al.add("sjheir");
        al.add(12.34);
        System.out.println(al);
    }
}
