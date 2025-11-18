package ua.opnu;

public class GenericThreeTuple<T, V, S> {

    // Використовуємо механізм композиції: кортеж з двох елементів є частиною цього класу
    public final GenericTwoTuple<T, V> twoTuple;
    public final S three;

    public GenericThreeTuple(T first, V second, S three) {
        this.twoTuple = new GenericTwoTuple<>(first, second);
        this.three = three;
    }

    @Override
    public String toString() {
        // Виводимо, "розпаковуючи" внутрішній кортеж для красивого вигляду
        return "(" + twoTuple.first + ", " + twoTuple.second + ", " + three + ")";
    }
}