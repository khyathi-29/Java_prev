package Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args){
        TreeSet al = new TreeSet(new Myorder());

        al.add("sjheir");
        al.add("sjheir");
        al.add("ghdywte");
   ;     System.out.println(al);
    }
}
class Myorder implements Comparator{
    @Override
    public int compare(Object o1, Object o2){
        return -((String) o1).compareTo((String) o2);
    }
}
