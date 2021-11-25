package Lab100;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionFramework {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Strin");
        list.add("Strin1");
        list.add("Strin2");
        list.add("Strin3");
        list.add("Strin4");

        for ( String s: list){
            System.out.println(s);
        }
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(3));


    }

}
