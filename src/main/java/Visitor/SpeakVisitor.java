package Visitor;

public class SpeakVisitor implements AnimalVisitor<String> {
    @Override
    public String visit(Cow cow) {
        return "Moo";
    }

    @Override
    public String visit(Dog dog) {
        return "Bark";
    }
}
