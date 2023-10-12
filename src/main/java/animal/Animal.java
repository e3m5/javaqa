package animal;


public class Animal {
    String specie;
    int age;
    long hairCount;
    boolean isAlive;
    char gender;
    float weight;


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

}