package j16_ArrayList.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>(List.of("Orange", "Kiwi", "Peach", "Banana", "Orange"));

        System.out.println("Orange count : "+getCount(arr, "Orange"));
        System.out.println("Kiwi count : "+getCount(arr, "Kiwi"));
        System.out.println("Peach count "+getCount(arr, "Peach"));
        System.out.println("Banana count "+getCount(arr, "Peach"));


    }

    public static int getCount(ArrayList<String> a, String b) {
        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equalsIgnoreCase(b)) {
                count++;
            }
        }

        return count;
    }
}
