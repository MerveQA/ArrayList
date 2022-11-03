package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Objects;

import static J12_Loops.Tasks.Odev02.scan;

public class Task08_BAK {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        ArrayList<String> numbers = new ArrayList<String>();

        String sayi = "";

        while (true) {  // while dongusu bitimine kadar arraylistimizi olusturur
            System.out.print("Sayilari giriniz.Cikmak icin N tuslayiniz : ");
            sayi = scan.next();

            if (sayi.equals("N")) {
                break;
            } else {
                numbers.add(sayi);
            }
        }
        System.out.println("Sayi listesi : " + numbers);


        aboveDailyEarnings(numbers);
        System.out.println("\nAvarege is : " + avarege(numbers));


    }

    private static void aboveDailyEarnings(ArrayList<String> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (Integer.parseInt(numbers.get(i)) > avarege(numbers)) {
                System.out.print(numbers.get(i) + " ");
            }
        }

    }

    private static double avarege(ArrayList<String> numbers) {
        double avareg = 0;
        for (int i = 0; i < numbers.size(); i++) {
            avareg += Double.parseDouble(numbers.get(i));
        }

        avareg /= numbers.size();

        return avareg;
    }

}
