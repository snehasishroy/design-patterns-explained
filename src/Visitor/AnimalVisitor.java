package Visitor;

public interface AnimalVisitor<T> {
    T visit(Cow cow);

    T visit(Dog dog);
}
