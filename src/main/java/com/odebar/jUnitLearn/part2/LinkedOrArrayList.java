package com.odebar.jUnitLearn.part2;

import java.util.List;

public class LinkedOrArrayList {

    public static void remove(List<String> list, String elem){
        System.out.print(list.getClass().getSimpleName() + " :\t");
        long start = System.nanoTime();
        list.remove(elem);
        long stop = System.nanoTime();
        System.out.println("took " + (stop - start) + " nanos");
    }
}
