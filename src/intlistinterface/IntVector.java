package intlistinterface;


import java.sql.SQLOutput;
import java.util.Arrays;

import static java.util.Arrays.*;

public class IntVector implements IntList {
    private int[] arr2;
    private int size;
    public IntVector() {
        arr2 = new int[20];
        size = 0;
    }
    @Override
    public void add(int number) {
        if (size == arr2.length) {
            int[] newArray = new int[(int) (arr2.length * 2)];
            System.out.println("The length of the old vector was: " + arr2.length);
            System.out.println("We're increasing the vector lenght " + newArray.length);


            for (int i = 0; i < arr2.length; i++)
            {
                System.out.println("The value of the new vector BEFORE is:" + newArray[i]);
                newArray[i] = arr2[i];
                System.out.println("The value of the new vector AFTER is:" + newArray[i]);
            }

            System.out.println("The lenght of the vector BEFORE is: " + arr2.length);
            arr2 = newArray;
            System.out.println("The lenght of the vector AFTER is: " + arr2.length);
        }
        else{
            System.out.println("There is an error in: " + number);
            arr2[size] = number;
        }
        size++;
    }
    @Override
    public int get(int i) {
        return 1;
    }
}

