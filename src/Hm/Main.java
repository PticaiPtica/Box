package Hm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        CustumMutableClass classCustum = new CustumMutableClass(111);

        ImmutableClass classI = new ImmutableClass("ClassOne", list, classCustum);


        System.out.println(classI);
        System.out.println("ХэшКод до изменения classCustum " + classI.hashCode());
        classCustum.setValue(123);
        System.out.println("ХэшКод после изменения classCustum " + classI.hashCode());
        list.add(6);
        ImmutableClass classII = new ImmutableClass("ClassTwo", list, classCustum);
        System.out.println(classII);
        list.add(7);
        classCustum.setValue(456);
        ImmutableClass classIII = new ImmutableClass("ClassThree", list, classCustum);
        System.out.println(classIII);

        Map<ImmutableClass, Integer> map = new HashMap<>();
        map.put(classI, 11);
        map.put(classII, 22);
        map.put(classIII, 33);

        for (Map.Entry<ImmutableClass, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue())
            ;
        }


        System.out.println(map.containsValue(11));
        System.out.println(map.containsValue(22));
        System.out.println(map.containsValue(33));

        classCustum.setValue(9999);
        System.out.println(classCustum);

        System.out.println(map.containsValue(11));
        System.out.println(map.containsValue(22));
        System.out.println(map.containsValue(33));



        Box<String> stringBox = new Box<>(null);
        stringBox.set("Roman");
        System.out.println(stringBox.get());
        System.out.println(stringBox.isEmpty());
        stringBox.clear();
        System.out.println(stringBox);

        Box<Integer> integerBox = new Box<>(null);
        integerBox.set(456);
        System.out.println(integerBox.get());
        System.out.println(integerBox.isEmpty());
        integerBox.clear();
        System.out.println(integerBox.isEmpty());
        System.out.println(integerBox);
    }


}