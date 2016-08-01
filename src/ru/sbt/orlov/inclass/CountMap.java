package ru.sbt.orlov.inclass;

import java.util.Map;

public interface CountMap<T> {

    /**
     * Добавляет элемент t в этот контейнер
     * @param t добавляемый элемент
     */
    void add(T t);

    /**
     * Возвращает количество добавлений данного элемента
     * @param t элемент
     * @return Количество добавление
     */
    int getCount(T t);

    /** Удаляет элемент и контейнера и возвращает количество его добавлений(до удаления)
     * @param t удаляемый элемент
     * @return количество его добавлений
     */
    int remove(T t);

    /**
     * @return Количество разных элементов
     */
    int size();

    /** Добавить все элементы из countMap в текущий контейнер,
     * при совпадении ключей происходит суммирование значений
     * @param countMap Source
     */
    void addAll(CountMap<? extends T> countMap);

    /**
     * Возвращает java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
     * @return Map
     */
    Map<T,Integer> toMap();

    /**
     * Тоже самое что и toMap() только добавляем в destination
     * @param destination Map куда будут записанны значений
     */
    void toMap(Map<? super T,Integer> destination);

}
