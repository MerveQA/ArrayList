package j16_ArrayList.Tasks;
import java.util.List;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

import static J12_Loops.Tasks.Odev02.scan;
import static java.lang.Integer.MAX_VALUE;

public class OdevTask02 {
    public static void main(String[] args) {

        /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
         */

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> notlar = new ArrayList<Integer>();
     // List<Integer> notlar2 = new ArrayList<Integer>();


        int answer = 0;
        int top =0;

        while (answer != -1) {  // while dongusu bitimine kadar arraylistimizi olusturur

            System.out.println("Notu giriniz.\nCikmak icin -1 tuslayiniz ");
            answer = scan.nextInt();
             if (answer != -1) {
                notlar.add(answer);
                top+=answer;
            }
        }
        System.out.println("Not listesi     : "+notlar);
        System.out.println("Not ortalamasi  : "+(top/notlar.size()));

        int ortGCNogrnc =0;
        for (int i=0; i<notlar.size(); i++) {
            ortGCNogrnc+= notlar.get(i)> (top/notlar.size())? 1 : 0 ;
            }

        System.out.println("Ortalamayı gecen ogrencı sayısı : "+ortGCNogrnc);
        }



    }

