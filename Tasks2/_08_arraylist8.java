package j16_ArrayList.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(5, 3, 4, 6, 7));
        System.out.println(secondMax(arr));
    }

    public static int secondMax(ArrayList<Integer> a) {

        Collections.sort(a);
        a.remove(a.size() - 1);
        int max2 = a.get(a.size() - 1);


        return max2;
    }
}

