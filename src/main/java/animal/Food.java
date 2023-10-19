package animal;

import java.security.PublicKey;

public class Food {
    String foodType;

    int quantity;

    long calories;


    //alt+insert=constructor

    public Food(String foodType, long calories) {
        this.foodType = foodType;
        this.calories = calories;
    }
}
