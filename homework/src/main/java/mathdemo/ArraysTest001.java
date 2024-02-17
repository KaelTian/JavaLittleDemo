package mathdemo;

import java.util.Arrays;

/**
 * @author 田赛
 * @version 1.0
 */
public class ArraysTest001 {
    public static void main(String[] args) {
        Integer[] integers = {1, 20, 33, 67, 90, 101};

        System.out.println(Arrays.toString(integers));

        Arrays.sort(integers);
    }
}
