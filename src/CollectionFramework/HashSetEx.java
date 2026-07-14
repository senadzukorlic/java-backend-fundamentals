package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");

        hs.remove("D");

        Iterator<String> iterator = hs.iterator();


        while (iterator.hasNext())
            System.out.print(iterator.next() + ", ");

        System.out.println();
    }

}
