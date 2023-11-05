package Visitor;

public class Dog implements Animal {
    @Override
    public <T> T accept(AnimalVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
