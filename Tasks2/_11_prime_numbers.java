package j16_ArrayList.Tasks2;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("negatif olmayan bir n sayısı girin : ");
        int n = scan.nextInt();

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        int count = 0;

        for (int i = 3; i<= n; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {   // 5%2  5%3  5%4
                    count++;
                }
            }
            if ((count == 1)) {
                arr.add(i);
            }
            count=0;
        }
        System.out.println(arr);
    }
}
