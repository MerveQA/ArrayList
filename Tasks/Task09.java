package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));

        int kareToplam = 0;
        int kar =0;
        for (int i = 0; i < numbers.size(); i++) {
            kareToplam+= numbers.get(i)*numbers.get(i)* numbers.get(i);
            kar+=Math.pow(numbers.get(i),3);
        }
        System.out.println("Kareler toplamı : "+kareToplam);
        System.out.println("kar : "+kar);
    }
}

