package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task12_BaskaCzum {
    public static void main(String[] args) {

        //Manav Sorusu
        Scanner scan = new Scanner(System.in);
        ArrayList<String> manavList = new ArrayList<>(List.of("00 - Elma" , "01 - Armut" , "02 - Üzüm" , "03 - Kiraz" , "04 - Patates"));
        ArrayList<Double> manavFiyat = new ArrayList<>(List.of(1.0, 2.50 , 3.50 , 4.50, 5.50));
        double sepet = 0;
        char karar;
        do {
            System.out.println("Java Manavına hoşgeldiniz. Ürün listemiz aşağıdadır.");
            System.out.println(manavList);
            System.out.println("hangi meyveden alacaksınız");
            int meyveKarar = scan.nextInt();
            System.out.println(manavList.get(meyveKarar)+" meyvesinden Kaç kilo alacaksınız ? ");
            double kilo = scan.nextDouble();
            sepet+=kilo*manavFiyat.get(meyveKarar);
            System.out.println("Alışverişe devam etmek ister misiniz ?   <E>vet   -   <H>ayır");
            karar = scan.next().toUpperCase().charAt(0);

        }while(karar=='E');
        System.out.println("toplam sepet tutarınız = " + sepet);
    }
}
