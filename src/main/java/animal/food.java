package animal;

public class food {
    String foodType;
    long calories;

    //konstruktor - wywoływane gdy użyjemy słowa\
    //kluczowego 'new'
    // left alt + insert
    public food(String foodType, long calories) {
        this.foodType = foodType;
        this.calories = calories;
    }
}