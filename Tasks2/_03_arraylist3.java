package j16_ArrayList.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
    ArrayList<String> arr = new ArrayList<String>(List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));
        System.out.println(getLength(arr));
    }
    public static ArrayList<Integer> getLength(ArrayList<String> a) {

        ArrayList<Integer> son = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
          son.add(a.get(i).length())  ;
        }
        return son;
    }
}