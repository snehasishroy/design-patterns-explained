package Visitor;

public class Cow implements Animal {
    @Override
    public <T> T accept(AnimalVisitor<T> visitor) {
        return visitor.visit(this);
    }
}
