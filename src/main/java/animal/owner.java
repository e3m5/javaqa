package animal;

import java.util.ArrayList;
import java.util.List;

public class owner {
    public static void main(String[] args) {
        animal dog = new animal("dog");

        dog.speak();

        food paroowa = new food("parówka", 50000);
        food trutka = new food("trutka", 50000);
        food marchewa = new food("marchewka", 10000);
        food smaczek = new food("smaczek", 5000);

        List<food> jedzonko = new ArrayList<>();

        jedzonko.add(paroowa);
        jedzonko.add(trutka);
        jedzonko.add(marchewa);
        jedzonko.add(smaczek);

        // streamy  ->                     lambdy
//        jedzonko.stream().forEach(s -> dog.feed(s));

//        for (food : jedzonko) {
//            if (isPoison(food)) {
//                System.out.println("Fuj, sam to zjedz!");
//            } else {
//                dog.feed(food);
//            }
//        }

        dog.feed(jedzonko);
    }



}




