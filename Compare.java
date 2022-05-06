import java.util.Arrays;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

class Pair {
    int x, y = 0;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Main {
    public static void main(String[] args) {
        Pair[] arr = new Pair[6];
        // Arr of Object
        for (int i = 1; i <= 6; i++)
            arr[i - 1] = new Pair(i, 2 * i);

        for (Pair val : arr)
            System.out.println(val.x + " " + val.y);

        System.out.println("\nAfter Sort: ");

        ArrayList<Integer,Integer> arrlist= new ArrayList<Integer, Integer>(Arrays.asList(arr));
        Collections.sort(arrlist);

        for (ArrayList val : arrlist)
            System.out.println(val);
    }
}