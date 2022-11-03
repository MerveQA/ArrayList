package j16_ArrayList.Tasks;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OdevTask01 {
    public static void main(String[] args) {

        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */

        Scanner scan = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<String>
                (List.of("Monday", "Tuesday", "Wendesday", "Thursday", "Friday", "Saturday", "Sunday"));

        ArrayList<Integer> dailyEarnings = new ArrayList<Integer>();

        int i=0;

        while (i <= 7) {
            for ( i = 1; i <= 7; i++) {
                System.out.print(i + "st day daily earnings : ");
                int earn = scan.nextInt();

                dailyEarnings.add(earn);
            }
        }

        System.out.println("\nAvarege daily earnings : "+getOrtalamaKazanc(dailyEarnings));
        getOrtalamaninUstundeKazancGünleri(dailyEarnings,days);
        getOrtalamaninAltindaKazancGünleri(dailyEarnings,days);
    }

    private static void getOrtalamaninAltindaKazancGünleri(ArrayList<Integer> dailyEarnings, ArrayList<String> days) {
        for (int i = 0; i < dailyEarnings.size(); i++){
            if(dailyEarnings.get(i)<getOrtalamaKazanc(dailyEarnings)){
                System.out.print("\nDays below average daily earnings : "+days.get(i)+" ");
            }
        }
    }

    private static void getOrtalamaninUstundeKazancGünleri(ArrayList<Integer> dailyEarnings,ArrayList<String> days) {
        for (int i = 0; i < dailyEarnings.size(); i++){
            if(dailyEarnings.get(i)>getOrtalamaKazanc(dailyEarnings)){
                System.out.print("\nDays above average daily earnings : "+days.get(i)+" ");
            }
        }
        System.out.println();
    }

    private static double getOrtalamaKazanc(ArrayList<Integer> a) {
        int toplamOrt =0;
        for(int i = 0; i<a.size(); i++) {
            toplamOrt+=a.get(i);
        }
        toplamOrt=toplamOrt/7;

        return toplamOrt;
    }
}



