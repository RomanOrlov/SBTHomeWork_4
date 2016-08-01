package ru.sbt.orlov.homework;

import java.util.Arrays;

import static ru.sbt.orlov.homework.CollectionUtils.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("must be true " + containsAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10),Arrays.asList(1,2,3,4,5,6,7)));
        System.out.println("must be true " + containsAny(Arrays.asList(1,2,3,4,5,6,7),Arrays.asList(1,2,3,4,5,6,7)));
        System.out.println("must be false " + containsAny(Arrays.asList(1,2,3,4,5,6,7),Arrays.asList(8,9,10)));
        System.out.println(range(Arrays.asList(1,2,3,4,5,6,7), 1, 7));
    }
}
