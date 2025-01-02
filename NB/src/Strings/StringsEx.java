package Strings;

//String immutable but not StringBuilder or

public class StringsEx {
    public static void main(String[] args) {

        String name = "awjeoqie";
        String n2 = name.concat("asdwew");
        System.out.println(name + "   " + n2);
        //literal - immutable
        String n3 = new String("good");
        n3.concat("b");
        System.out.println(n3);
        //String Buffer - mutable
        StringBuffer n4 = new StringBuffer("hello");
        n4.append("affd");
        System.out.println(n4);

        // String Builder -mutable

        String e1="apple";
        String e2="apple";
        String e3 ="Apple";
        System.out.println(e1==e2);//boolean
        System.out.println(e1.equals(e2));//boolean
        System.out.println(e1.compareTo(e2)); // integer value
        System.out.println(e1.equalsIgnoreCase(e3));// doesn't check capital
        System.out.println("xxxxxxxxxx");
        String e4 = new String("apple");
        String e5 = new String("apple");
        System.out.println(e4==e5);//boolean
        System.out.println(e4.equals(e5));//boolean
        System.out.println(e4.compareTo(e5)); // integer value
        System.out.println(e4.equalsIgnoreCase(e5));// doesn't check capital
        // Same for Buffer and Builder below cases
        System.out.println("xxxxxxxxxx");
        StringBuffer q4 = new StringBuffer("apple");
        StringBuffer q5 = new StringBuffer("apple");
        System.out.println(q4==q5);//boolean
        System.out.println(q4.equals(q5));//boolean
        System.out.println(q4.compareTo(q5)); // integer value
        //System.out.println(q4.equalsIgnoreCase(q5));// doesn't check capital

    }


    }

