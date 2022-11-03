package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {


    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    0-1-1-2-3-5-8-13-21-34....
    */


    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);
        System.out.print("N Sayısını Girin:");
        int n = scan.nextInt();

        ArrayList<Integer> fibo = new ArrayList<Integer>();
        fibo.add(0);
        fibo.add(1);


        for (int i = 2; i < n; i++)//Döngü 2 den başlıyor çünkü ilk 2 terim 0 ve 1 her zaman yazılacak
        {
            fibo.add(fibo.get(i - 2) + fibo.get(i - 1));

        }
        System.out.println(fibo);

    }
}
