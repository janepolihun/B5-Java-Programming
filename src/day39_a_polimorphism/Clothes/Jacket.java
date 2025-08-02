package day39_a_polimorphism.Clothes;
// CONCRETE Class
public class Jacket extends Clothes implements HasHood {

    @Override
    public void wearClothes() {
        System.out.println("Wearing Jacket...");
    }

    @Override
    public void putOnHoody() {
        System.out.println("Putting on hoody...");
    }
}
