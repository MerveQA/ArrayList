package j16_ArrayList.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>(List.of("yellow" , "red" , "blue" , "red" , "blue"));
        System.out.println(changeInArraylist(arr,"blue","yellow"));

    }

    public static ArrayList<String> changeInArraylist(ArrayList<String> a, String s1, String s2) {
        Collections.replaceAll(a,s1,s2);

        return a;
    }
}
