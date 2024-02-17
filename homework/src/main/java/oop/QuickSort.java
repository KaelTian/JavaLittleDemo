package oop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    int partition(int arr[], int low, int high, boolean isDesc) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (matchComparedCase(arr[j], pivot, isDesc)) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = pivot;
        arr[high] = temp;
        return i + 1;
    }

    private boolean matchComparedCase(int left, int right, boolean isDesc) {
        return isDesc ? (left > right) : (left < right);
    }

    private void quickSort(int arr[], int low, int high, boolean isDesc) {
        if (low < high) {
            int pi = partition(arr, low, high, isDesc);
            quickSort(arr, low, pi - 1, isDesc);
            quickSort(arr, pi + 1, high, isDesc);
        }
    }

    public void sort(int arr[], boolean isDesc) {
        quickSort(arr, 0, arr.length - 1, isDesc);
    }

    public <T extends CompareService> List<T> sort(List<T> list, boolean isDesc) {
        if (list == null || list.isEmpty()) return list;
        Class<T> clazz = list.stream().findFirst().get().getType();
        T[] arr = list.toArray(generateGenericArray(clazz, 0));
        quickSort(arr, 0, arr.length - 1, isDesc);
        return Arrays.asList(arr);
    }

    @SuppressWarnings("unchecked")
    private <T extends CompareService> T[] generateGenericArray(Class<T> type, int size) {
        T[] array = (T[]) Array.newInstance(type, size);
        return array;
    }

    private <T extends CompareService> void quickSort(T arr[], int low, int high, boolean isDesc) {
        if (low < high) {
            int pi = partition(arr, low, high, isDesc);
            quickSort(arr, low, pi - 1, isDesc);
            quickSort(arr, pi + 1, high, isDesc);
        }
    }

    private <T extends CompareService> int partition(T arr[], int low, int high, boolean isDesc) {
        T pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (matchComparedCase(arr[j], pivot, isDesc)) {
                i++;
                T temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        T temp = arr[i + 1];
        arr[i + 1] = pivot;
        arr[high] = temp;
        return i + 1;
    }

    private <T extends CompareService> boolean matchComparedCase(T left, T right, boolean isDesc) {
        return isDesc ? (left.isGreaterThan(right)) : (left.isLessThan(right));
    }

}
