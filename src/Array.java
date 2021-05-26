import java.util.Collections;
import java.util.Scanner;

public class Array {

    Scanner scanner = new Scanner(System.in);

    public int[] getIntegers(int number) {
        int[] array = new int[number];
        for(int i=0; i<array.length; i++) {
            System.out.println("Enter element at index " + i);
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public double getAvg(int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            sum+=array[i];
        }
        return (double) sum / (double) array.length;
    }

    public void printArray(int[] arrray) {
        for(int i=0; i<arrray.length; i++) {
            System.out.println("Element at index " + i + ": " + arrray[i]);
        }
    }
    public void sortArrayAsc(int[] array) {
        java.util.Arrays.sort(array);

        for (int i=0; i<array.length; i++) {
            System.out.println("Sorted ascending: \n" + array[i]);
        }
    }
    public void sortArrayDesc() {
//        implementing autoboxing and unboxing
        System.out.println("Enter desired size of an array: ");
        int x = scanner.nextInt();

        Integer[] array = new Integer[Integer.valueOf(x)];

        for(int i=0; i<array.length; i++) {
            System.out.println("Enter number at index " + i);
            array[i] = scanner.nextInt();
        }

        java.util.Arrays.sort(array, Collections.reverseOrder());
        System.out.println(java.util.Arrays.toString(array));
    }
}



