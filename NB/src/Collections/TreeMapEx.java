package Collections;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapEx {
    public static void main(String[] args){
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
        tm.put(100,"appe");
        tm.put(1010,"appee");
        tm.put(10,"appeee");
        tm.put(1,"appeeee");
        tm.put(00,"app");
        tm.put(2,"ap");
        tm.put(25,"a");
        System.out.println(tm);
        System.out.println(tm.get(2));
        Set<Integer> s =tm.keySet();
        for(Integer i:s)
        {
            System.out.print(i+" "+tm.get(i)+"  ");
        }


    }
}
