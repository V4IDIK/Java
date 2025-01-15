package lab;

import java.util.ArrayList;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(42);
        arr.add(10);
        arr.add(23);
        arr.add(5);

        System.out.println(arr);

        for (int i=0; i<arr.size()-1; i++) {
            for (int j=0; j<arr.size()-1-i; j++) {
                if (arr.get(j)>arr.get(j+1)) {
                    int x=arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, x);
                }
            }
        }

        System.out.println(arr);
    }
}

