package com.javalearnings.collections.lists;

public class TestClass {
    public static void main(String[] args) {
        List arrayList = new CustomList();
        arrayList.add("A");
        arrayList.add("B");
        System.out.println(arrayList.size());
        arrayList.remove("A");
        System.out.println(arrayList.size());
    }
}
