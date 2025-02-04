package standart.classes;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int [] numbers = {
            1,3,2,5,4,6,7,8,9
        };
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 7));

        int [] result = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(result));

        int [] result2 = Arrays.copyOfRange(numbers, 3,9);
        System.out.println(Arrays.toString(result2));
    }
}
