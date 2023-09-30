package intlistinterface;


import java.sql.SQLOutput;
import java.util.Arrays;

import static java.util.Arrays.*;

public class IntArrayList  implements IntList{
    private int[] arr;
    private int size;

    public IntArrayList() {
        arr = new int[10];
        size = 0;
    }

    public void add(int number) {
        if (size == arr.length) {
            int[] newarr = new int[(int) (arr.length * 1.5)];
            System.out.println("The length of the old array was: " + arr.length);
            System.out.println("We're increasing the array lenght " + newarr.length);


            for (int i = 0; i < arr.length; i++)
            {
                System.out.println("The value of the new array[" + i + "] BEFORE is:" + newarr[i]);
                newarr[i] = arr[i];

                System.out.println("The value of the new array [" + i + "] AFTER is:" + newarr[i]);
            }

            System.out.println("The lenght of the arr BEFORE is: " + arr.length);
            newarr[arr.length] = number;
            arr = newarr;
            System.out.println("The lenght of the arr AFTER is: " + arr.length);
        }
        else{
            System.out.println("There is an error in: " + number);
            arr[size] = number;
        }
      size++;

}

    @Override
    public int get(int j) {

        return arr[j];
    }
}

