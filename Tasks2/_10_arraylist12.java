package j16_ArrayList.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1, 5, 22, 10, 20, 14, 8, 25, 30, 28));
        int min = 20;
        int max = 30;

        System.out.println(rangeBtw(arr,min,max));


    }

    public static int rangeBtw(ArrayList<Integer> a, int b, int c) {

        int count = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= 20 && a.get(i) <= 30) {
                count++;
            }
        }

        return count;
    }
}