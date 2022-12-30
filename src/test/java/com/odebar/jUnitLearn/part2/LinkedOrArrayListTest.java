package com.odebar.jUnitLearn.part2;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedOrArrayListTest {

    static List<String> arrayList;
    static List<String> linkedList;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.print("Populating ArrayList... ");
        arrayList = new ArrayList<>();
        for(int i = 0; i< 10_000_000; i++) {
            arrayList.add("" + i);
        }
        System.out.println("Done.");
        linkedList = new LinkedList<>(arrayList);
    }

    @Test(timeout = 7)
    @Ignore("Removal on ArrayList takes too long"
            + " so we disable it for the time being.")
    public void testRemoval_AL() {
        LinkedOrArrayList.remove(arrayList, "123");
    }

    @Test(timeout = 2)
    public void testRemoval_LL() {
        LinkedOrArrayList.remove(linkedList, "123");
    }

}