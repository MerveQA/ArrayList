package j16_ArrayList.Tasks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {

   ArrayList<String> arr = new ArrayList<String>(List.of("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        System.out.println(" Terse cevrilmiş : "+rotateList(arr));


    }

    public static ArrayList<String> rotateList (ArrayList<String> a){
        ArrayList <String> tersArr = new ArrayList<String>();
        for (int i= a.size()-1; i>=0; i--){
            tersArr.add(a.get(i));

        }


        return tersArr;
    }
}

