package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static j16_ArrayList.Tasks.Task12_POJO.calculatePrice;


public class Task12_Manav {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */


        Task12_POJO elma = new Task12_POJO(20, 10);
        Task12_POJO armut = new Task12_POJO(10, 15);
        Task12_POJO uzum = new Task12_POJO(15, 18);
        Task12_POJO kivi = new Task12_POJO(10, 30);
        Task12_POJO kiraz = new Task12_POJO(20, 40);

        ArrayList<Task12_POJO> manavList = new ArrayList<>(List.of(elma, armut, uzum, kivi, kiraz));


        System.out.print("Choose a product from the grocery store : ");
        String product = scan.next();
        System.out.print("Please enter how many kilos you want   : ");
        int kg = scan.nextInt();


        int toplamFiyat =0;

        switch (product) {
            case "elma":
                toplamFiyat = calculatePrice(elma, kg);
                break;
            case "armut":
                toplamFiyat = calculatePrice(armut, kg);
                break;
            case "uzum":
                toplamFiyat = calculatePrice(uzum, kg);
                break;
            case "kivi":
                toplamFiyat = calculatePrice(kivi, kg);
                break;
            case "kiraz":
                toplamFiyat = calculatePrice(kiraz, kg);
                break;
        }


        String answer = "Y";
        while (answer.equalsIgnoreCase("Y")) {
            System.out.print("Would you like to add another. Please enter -Y-  or  -N- ");
            answer = scan.next();

            if (!answer.equalsIgnoreCase("Y")) {
                System.out.println(toplamFiyat);
                break;
            } else {

                System.out.print("Choose a product from the grocery store : ");
                String productAdd = scan.next();
                System.out.println();
                System.out.print("Please enter how many kilos you want   : ");
                int kgAdd = scan.nextInt();

                switch (productAdd) {
                    case "elma":
                        toplamFiyat+=calculatePrice(elma,kgAdd);
                        break;
                    case "armut":
                        toplamFiyat+=calculatePrice(armut,kgAdd);
                        break;
                    case "uzum":
                        toplamFiyat+=calculatePrice(uzum,kgAdd);
                        break;
                    case "kivi":
                        toplamFiyat+=calculatePrice(kivi,kgAdd);
                        break;
                    case "kiraz":
                        toplamFiyat+=calculatePrice(kiraz,kgAdd);
                        break;
                }


            }

        }


    }


}

