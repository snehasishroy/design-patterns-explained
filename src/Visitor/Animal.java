package Visitor;

public interface Animal {
    <T> T accept(AnimalVisitor<T> visitor);
}
