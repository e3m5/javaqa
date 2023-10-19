package animal;

public class Owner {
    public static void main(String[] args) {
        Animal tiger = new Animal("tiger");
        Animal koza = new Animal();
        koza.specie = "koza";

        tiger.speak();
        //tiger.feed("jajo");
        //tiger.feed("jajo",  2);
        Food jedzonko = new Food("jablka", 30090);

        tiger.feed(jedzonko);


    }





}
