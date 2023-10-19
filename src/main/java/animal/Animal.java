package animal;


public class Animal {
    String specie;
    int age;
    long hairCount;
    boolean isAlive=true;
    char gender;
    float weight;


    long caloriesCounter = 0L;

    public Animal() {
    }

    public Animal(String specie) {
        this.specie = specie;
    }

    public void speak() {
        specie = "tiger";
        System.out.println("hello i am " + specie);

    }
    public void feed (String food) {
        System.out.println("i eat " + food);
    }
    public void feed (String food,int count) {
        System.out.println("i eat " + count + " " + food);
    }



    public void feed(Food food){
        if (food.foodType.equals("trutka")){
            System.out.println("zjadlem trutke nie zyje");
            isAlive = false;
        }
        if(isAlive) {
            System.out.println("jem sobie: " + food.foodType
                    + " " + "które mają " + food.calories + " " + "kalorii.");
            caloriesCounter += food.calories;
            System.out.println("dziś zjadlem " + caloriesCounter + " " + "kalorii.");
        }else {
            System.out.println("leże i nie zyje");
        }


    }



}
