package j16_ArrayList.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1,2,3,4,5));
        System.out.println("Toplam : "+getSum(arr));

    }

    public static int   getSum(ArrayList<Integer> a) {
        int sum = 0;
        for(int i=0; i<a.size(); i++){
            sum+=a.get(i);
        }

        return sum;
    }
}
