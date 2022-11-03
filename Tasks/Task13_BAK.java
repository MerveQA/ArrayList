package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task13_BAK {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {


        int[] arr2 = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};

        List<Integer> listSayi = new ArrayList<>();
        int baslama = 0;

        for (int i = 0; i < arr2.length; ) {
            int sayac = 0;
            int toplam = 0;
            for (int j = i; j <= ((i + baslama) < arr2.length - 1 ? i + baslama : arr2.length - 1); j++) {
                toplam += arr2[j];
                sayac++;
            }
            listSayi.add(toplam);
            baslama++;
            i += sayac;
        }

        System.out.println(listSayi);

    }
}

