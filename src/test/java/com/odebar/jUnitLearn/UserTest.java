package com.odebar.jUnitLearn;

import org.junit.*;


public class UserTest {

    static User kolya = new User("Kolya", 24);

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("in setUpBeforeClass()");
        kolya.setAge(25);
    }
    @Before
    public void setUp() {
        System.out.println("in setUp() ");
    }

    @Test
    public void test1() {
        System.out.println("in test1()");
        System.out.println(kolya.getAge());
    }

    @Test
    public void test2() {
        System.out.println("in test2()");
        System.out.println(kolya.getAge());
    }

    @After
    public void tearDown() {
        System.out.println("in tearDown()");
        //kolya.setAge(24);
        System.out.println(kolya.getAge());
    }

    @AfterClass
    public static void tearDownAfterClass(){
        kolya.setAge(24);
        System.out.println("in tearDownAfterClass()");
    }
}
