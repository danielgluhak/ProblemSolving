import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyArray array = new MyArray();
        int[] myNerArray = array.getArray(3);

        System.out.println("Min value: " + array.getMinValue(myNerArray));
    }
}
