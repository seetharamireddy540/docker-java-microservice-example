package com.ram.reflection;

public class ReflectionApp {
    static Object object = new Object() {
        public void m() {

        }
    };

    public static void main(String[] args) {

        System.out.println(object.getClass().getEnclosingClass());
    }
}
