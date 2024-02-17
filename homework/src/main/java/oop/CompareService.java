package oop;

public interface CompareService<T> {
    boolean isGreaterThan(T other);

    boolean isLessThan(T other);

    Class<T> getType();
}
