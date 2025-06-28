package Visitor;

public class LegsVisitor implements AnimalVisitor<Integer> {
    @Override
    public Integer visit(Cow cow) {
        return 4;
    }

    @Override
    public Integer visit(Dog dog) {
        return 4;
    }
}
