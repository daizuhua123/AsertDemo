import java.util.*;
public class PairTest3 {
    public static void main(String[] argv) {
    	LinkedList l = new LinkedList();
        l.add(new Object());
        l.add("Hello");
        l.add("zhangsan");
        ListIterator li = l.listIterator(0);
        while (li.hasNext())
            System.out.println(li.next());
        if (l.indexOf("Hello") < 0)   
            System.err.println("Lookup does not work");
        else
            System.err.println("Lookup works");
       
   }
}
