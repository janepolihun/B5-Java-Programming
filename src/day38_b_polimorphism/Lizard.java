package day38_b_polimorphism;


public class Lizard extends Reptile {
    String skinColor;

    @Override
    public void eat() {
        System.out.println("LIZARD is eating.....");
    }
}