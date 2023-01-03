package com.odebar.jUnitLearn.part2;

import java.lang.reflect.*;

class VerifyDemo {
    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException,
            InvocationTargetException {
        @SuppressWarnings("rawtypes")
        Class<?> clazz = Class.forName("com.odebar.jUnitLearn.part2.Pupil");

        Pupil pupil = new Pupil();

        for (Method method : clazz.getMethods()) {
            Verify v = method.getAnnotation(com.odebar.jUnitLearn.part2.Verify.class);
            if (v != null) {
                Object result = method.invoke(pupil);
                if ((Boolean) result == true) {
                    System.out.println(method.getName() + " passed.");
                } else {
                    System.out.println(method.getName() + " failed.");
                }
            }
        }
    }
}
