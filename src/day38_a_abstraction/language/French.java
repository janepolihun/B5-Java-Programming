package day38_a_abstraction.language;

public class French implements Language {

    @Override
    public void sayHi() {
        System.out.println("Bonjour!");
    }

    @Override
    public void sayBye() {
        System.out.println("Au Revoir!");
    }
}