package oop;

import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 定义一个Person类(name,age,job),初始化Person对象数组,有3个person对象,并按照age从大到小进行排序,
 * */
public class Homework01 {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
//        int[] arr = new int[]{6, 8, 5, 3, 7, 2, 1, 133, 222, 567, 10, 33, 66, 77, 66, 4};
//        quickSort.sort(arr, false);
//        int[] arr1 = new int[]{6, 8, 5, 3, 7, 2, 1, 133, 222, 567, 10, 33, 66, 77, 66, 4};
//        quickSort.sort(arr1, true);

        List<Person> persons = new ArrayList<>();
        persons.add(new Person("kael tian", 33, "developer"));
        persons.add(new Person("abby zhang", 34, "BA"));
        persons.add(new Person("an ni", 23, "QA"));
        persons.add(new Person("孙悟空", 4000, "斗战胜佛"));
        persons.add(new Person("释迦牟尼", 30000, "如来"));
        List<Person> descSortedPersons = quickSort.sort(persons, true);
        List<Person> ascSortedPersons = quickSort.sort(persons, false);
    }
}

//abstract class GenericClass<T> {
//    private Class<T> type;
//
//    @SuppressWarnings("unchecked")
//    public GenericClass() {
//        Type superClass = getClass().getGenericSuperclass();
//        if (superClass instanceof ParameterizedType) {
//            ParameterizedType parameterizedType = (ParameterizedType) superClass;
//            Type[] typeArguments = parameterizedType.getActualTypeArguments();
//            if (typeArguments.length > 0 && typeArguments[0] instanceof Class) {
//                type = (Class<T>) typeArguments[0];
//            }
//        }
//    }
//
//    public Class<T> getType() {
//        return type;
//    }
//}

class Person extends GenericClass<Person> implements Comparable<Person>, CompareService<Person> {
    private String name;
    private Integer age;

    private String job;

    public Person() {
    }

    public Person(String name, Integer age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public int compareTo(Person other) {
        return this.age.compareTo(other.age);
    }

    @Override
    public boolean isGreaterThan(Person other) {
        return this.compareTo(other) > 0;
    }

    @Override
    public boolean isLessThan(Person other) {
        return this.compareTo(other) < 0;
    }

    @Override
    public Class<Person> getType() {
        return super.getType();
    }
}

//interface CompareService<T> {
//    boolean isGreaterThan(T other);
//
//    boolean isLessThan(T other);
//
//    Class<T> getType();
//}

//class QuickSort {
//    int partition(int arr[], int low, int high, boolean isDesc) {
//        int pivot = arr[high];
//        int i = (low - 1);
//        for (int j = low; j < high; j++) {
//            if (matchComparedCase(arr[j], pivot, isDesc)) {
//                i++;
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        int temp = arr[i + 1];
//        arr[i + 1] = pivot;
//        arr[high] = temp;
//        return i + 1;
//    }
//
//    private boolean matchComparedCase(int left, int right, boolean isDesc) {
//        return isDesc ? (left > right) : (left < right);
//    }
//
//    private void quickSort(int arr[], int low, int high, boolean isDesc) {
//        if (low < high) {
//            int pi = partition(arr, low, high, isDesc);
//            quickSort(arr, low, pi - 1, isDesc);
//            quickSort(arr, pi + 1, high, isDesc);
//        }
//    }
//
//    public void sort(int arr[], boolean isDesc) {
//        quickSort(arr, 0, arr.length - 1, isDesc);
//    }
//
//    public <T extends CompareService> List<T> sort(List<T> list, boolean isDesc) {
//        if (list == null || list.isEmpty()) return list;
//        Class<T> clazz = list.stream().findFirst().get().getType();
//        T[] arr = list.toArray(generateGenericArray(clazz, 0));
//        quickSort(arr, 0, arr.length - 1, isDesc);
//        return Arrays.asList(arr);
//    }
//
//    @SuppressWarnings("unchecked")
//    private <T extends CompareService> T[] generateGenericArray(Class<T> type, int size) {
//        T[] array = (T[]) Array.newInstance(type, size);
//        return array;
//    }
//
//    private <T extends CompareService> void quickSort(T arr[], int low, int high, boolean isDesc) {
//        if (low < high) {
//            int pi = partition(arr, low, high, isDesc);
//            quickSort(arr, low, pi - 1, isDesc);
//            quickSort(arr, pi + 1, high, isDesc);
//        }
//    }
//
//    private <T extends CompareService> int partition(T arr[], int low, int high, boolean isDesc) {
//        T pivot = arr[high];
//        int i = (low - 1);
//        for (int j = low; j < high; j++) {
//            if (matchComparedCase(arr[j], pivot, isDesc)) {
//                i++;
//                T temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        T temp = arr[i + 1];
//        arr[i + 1] = pivot;
//        arr[high] = temp;
//        return i + 1;
//    }
//
//    private <T extends CompareService> boolean matchComparedCase(T left, T right, boolean isDesc) {
//        return isDesc ? (left.isGreaterThan(right)) : (left.isLessThan(right));
//    }
//
//}
