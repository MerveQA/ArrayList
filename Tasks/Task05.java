package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task05 {
    public static void main(String[] args) {

        // 2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        // listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        // Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
        // Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]


        String[][] s = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};

        copyPrint(s);


    }

    private static void copyPrint(String[][] s) {

        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                list.add(s[i][j]);
            }

        }

        Collections.sort(list);
        System.out.println(list);
    }
}
