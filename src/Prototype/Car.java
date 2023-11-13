package Prototype;

import java.util.List;

public class Car implements Cloneable {
    private final String name;

    private final List<Integer> mileage;

    public Car(String name, List<Integer> mileage) {
        this.name = name;
        this.mileage = mileage;
    }

    public Car(Car existing) {
        this.name = existing.name;
        this.mileage = List.copyOf(existing.getMileage());
    }

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMileage() {
        return mileage;
    }
}
