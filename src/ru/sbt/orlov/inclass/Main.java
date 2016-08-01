package ru.sbt.orlov.inclass;

public class Main {
    public static void main(String[] args) {
        CountMapImpl<Integer> countMap = new CountMapImpl<>();
        countMap.add(1);
        countMap.add(1);
        countMap.add(1);
        System.out.println(countMap.getCount(1));
        System.out.println(countMap.remove(1));
        System.out.println(countMap.size());
    }
}
