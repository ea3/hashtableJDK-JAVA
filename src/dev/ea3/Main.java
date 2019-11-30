package dev.ea3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 1233);
        Employee johnDoe = new Employee("John", "Doe", 4433);
        Employee marySmith = new Employee("Mary", "Smith", 1256733);
        Employee mikeWilson = new Employee("Mike", "Wilson", 2121);
        Employee billEnd = new Employee("Bill", "End", 445678);

        Map<String, Employee>  hashmap = new HashMap<String, Employee>();
        hashmap.put("Jones", janeJones);
        hashmap.put("Doe", johnDoe);
        hashmap.put("Smith", marySmith);
        hashmap.put("Wilson", mikeWilson);
        hashmap.put("End", billEnd);

        hashmap.putIfAbsent("Doe",mikeWilson);

        System.out.println(hashmap.getOrDefault("lio",mikeWilson));
        System.out.println(hashmap.containsKey("Doe"));
        System.out.println(hashmap.containsValue(janeJones));

//        Iterator <Employee> iterator = hashmap.values().iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        hashmap.forEach((k,v) -> System.out.println("Key = " + k + ", Employee = " + v) );
    }
}
