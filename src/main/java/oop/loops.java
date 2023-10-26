
package oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class loops {

    static String[] tablica; //deklaracja zmiennej

    static List<String> lista = new ArrayList<>();
    static List<String> lista2 = Arrays.asList("aa","bb");

    //psvm -> public static void main(String[] args) {
    public static void main(String[] args) {
        tablica = new String[3]; //inicjalizacja zmiennej tablica
        String str1 = "Ala ";
        String str2 = "ma ";
        String str3 = "kota";
        tablica[0] = str1;
        tablica[1] = str2;
        tablica[2] = str3;



        // pętla for(each) -> iteracja po wszystkich elementach zbioru
        for (String s : tablica) {
            // sout ->  System.out.println
            System.out.println(s);
        }

        for (int counter = 1; counter <= 10 ; counter++) {
            System.out.println("wow! " + counter);
        }

        // pętla while -> wykonywana dopóki warunek = true
        int counter = 1;
        // warunek -> counter <= 10
        //poki warunek jest prawdziwy,polecenie jest wykonywane
        while (counter < 10) {
            System.out.println("help! " + counter);
            counter++;  // inkrementacja -> ++ oznacza dodanie 1
            // counter++ oznacza to samo co: counter = counter + 1;
            //counter--; dekrementacja
        }
    }
}