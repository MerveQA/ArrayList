package j16_ArrayList.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(5, 4, 6, 2, 1));
        System.out.println(hillNum(arr));
    }

    public static int hillNum(ArrayList<Integer> a) {

        int sayi = 0;
        for (int i = 1; i < a.size() - 1; i++) {
            if (a.get(i) < a.get(i - 1) && a.get(i) > a.get(i + 1)) {
                sayi = a.get(i);
            }
        }
        return sayi;
    }
}
