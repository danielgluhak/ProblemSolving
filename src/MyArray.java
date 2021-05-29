import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MyArray {

    Scanner scanner = new Scanner(System.in);

    public int[] getArray(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element at index " + i);
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public double getAvg(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }

    public void printArray(int[] arrray) {
        for (int i = 0; i < arrray.length; i++) {
            System.out.println("Element at index " + i + ": " + arrray[i]);
//            or
//            System.out.println("Printed array: " + Arrays.toString(arrray));
        }
    }

    public void sortArrayAsc(int[] array) {
        java.util.Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Sorted ascending: \n" + array[i]);
        }
    }

    public Integer[] sortArrayDesc() {
//        implementing autoboxing and unboxing
        System.out.println("Enter desired size of an array: ");
        int x = scanner.nextInt();

        Integer[] array = new Integer[Integer.valueOf(x)];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number at index " + i);
            array[i] = scanner.nextInt();
        }

        java.util.Arrays.sort(array, Collections.reverseOrder());
//        System.out.println(java.util.Arrays.toString(array));
        return array;
    }

    public int[] sortArrDesc(int[] array) {
        int[] sortedArr = new int[array.length];
        int start = 0;
        for (int i = 0; i < array.length; i++) {
            sortedArr[i] = array[i];
        }
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArr.length - 1; i++) {
                if (sortedArr[i] < sortedArr[i + 1]) {
                    start = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = start;
                }
            }
        }
        return sortedArr;
    }

    public int getMinValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]<min) {
              min=array[i];
            }
        }
        return min;
    }

    public int getMaxValue(int[] array) {
        int max = array[0];
        for (int i=0; i<array.length; i++) {
            if(array[i]>max) {
                max=array[i];
            }
        }
        return max;
    }

}



