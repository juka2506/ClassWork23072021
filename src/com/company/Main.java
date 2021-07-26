package com.company;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Bobby");
        names.add("Dave");
        names.add("Barry");
        names.add("Larry");

        Object[] theNames = names.toArray();
        /*System.out.println(theNames[0]);
        System.out.println(names.size());
        System.out.println(names.contains("David"));

        for (String name: names) {
            System.out.println(name);
        }

        Set<Integer> nam = new TreeSet<>();
        nam.add(4);
        nam.add(2);
        nam.add(1);

        for (int name : nam) {
            System.out.println(name);
        }*/
        Set<Integer> nums = new LinkedHashSet<>();
        nums.add(4);
        nums.add(8);
        nums.add(3);

        for (int num : nums) {
            System.out.println(num);
        }

    }
}
