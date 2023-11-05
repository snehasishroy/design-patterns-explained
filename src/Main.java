import Visitor.*;

public class Main {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal dog = new Dog();
        AnimalVisitor<Integer> legsVisitor = new LegsVisitor();
        AnimalVisitor<String> speakVisitor = new SpeakVisitor();

        System.out.println(cow.accept(legsVisitor));
        System.out.println(cow.accept(speakVisitor));
        System.out.println(dog.accept(legsVisitor));
        System.out.println(dog.accept(speakVisitor));
    }
}