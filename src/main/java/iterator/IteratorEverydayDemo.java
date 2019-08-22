package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEverydayDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");


      /*  Iterator<String> namesItr = names.iterator();

        while (namesItr.hasNext()) {
            String name = namesItr.next();
            System.out.println(name);
            namesItr.remove();
        }*/

        for (String name:names){
            System.out.println(name);
        }

        System.out.println("Names size: " + names.size());
    }
}
