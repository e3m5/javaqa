package animal;

import java.util.List;

public class animal {
    String specie;
    char gender;
    int age;
    boolean isAlive = true;
    boolean isHungry = true;
    int caloriestTofull;

    long duzaLiczba;
    float liczbaZmiennoprzecinkowa;
    double liczbaZmiennoprzecinkowaZDwomaMiejscamiPoPrzecinku;

    long caloriesCounter = 0L;

    public animal(String specie) {
        this.specie = specie;
    }

    public void speak() {
        System.out.println("My name is " + specie);
    }

    // alt + inster -> dodaje konctruktor

    public void feed(String food) {
        System.out.println(food);
    }

    public void feed(String food, int amount) {
        System.out.println(food + amount);
    }

    // sout  - > skrót do System
    public void feed(food food) {
//        if (food.foodType.equals("trutka")) {
//            System.out.println("Zeżarłem trutkę. Umieram sobie.");
//            isAlive = false;
//        }

        /*
         ! - operator negacji - odwraca zmienną logiczną
        */

        if (!isAlive) {
            System.out.println("Leże i nie żyje.");
        } else {
            System.out.println("Jem sobie : "
                    + food.foodType + " która ma " + food.calories + " kalorii.");
            caloriesCounter += food.calories;
            System.out.println("Dziś zjadłem " + caloriesCounter + " kalorii.");
        }
    }

    public void feed(List<food> foods) {
        for (food f : foods) {
            if (isPoison(f)) {
                System.out.println("Fuj, sam to zjedz!");
            } else {
                feed(f);
            }
        }
    }

    /**
     * Check if given food is poisonous
     *
     * @param food - Food instance
     * @return True if given food is poison
     */
    private static boolean isPoison(food food) {
        return food.foodType.equals("trutka");
    }
}