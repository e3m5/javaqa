package animal;

public class Bird extends Animal {
    public Bird(String specie) {
        super(specie);
    }

    @Override
    public void move(int distance) {
        System.out.println("Jestem ptakiem. Latam!");
        super.move(distance);
      }
}

