package ru.sbt.orlov.inclass;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl <T> implements CountMap<T>{
    private final Map<T,Integer> map = new HashMap<>();
    @Override
    public void add(T t) {
        add(t,1);
    }

    protected final void add(T t,int count) {
        map.put(t,map.getOrDefault(t,0)+count);
    }

    @Override
    public int getCount(T t) {
        Integer i = map.get(t);
        return i==null?-1:i;
    }

    @Override
    public int remove(T t) {
        Integer i =  map.remove(t);
        return i==null?-1:i;
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(CountMap<? extends T> countMap) {
        Map<? extends T,Integer> map = countMap.toMap();
        for (T t : map.keySet()) {
            add(t,map.get(t));
        }
    }

    @Override
    public Map<T,Integer> toMap() {
        return map;
    }

    @Override
    public void toMap(Map<? super T, Integer> destination) {
        for (Map.Entry<T,Integer> entry : map.entrySet()) {
            T key = entry.getKey();
            destination.put(key,destination.getOrDefault(key,0)+map.get(key));
        }
    }
}