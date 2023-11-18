import ChainOfResponsibility.*;
import Prototype.Car;
import Strategy.BubbleSort;
import Strategy.MergeSort;
import Strategy.OrderedList;
import Visitor.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testChainOfResponsibility();
    }

    public static void testChainOfResponsibility() {
        Employee validEmployee = new Employee(1, "Snehasish", "Roy", 100, 100, 20);
        Validator validatorChain = new EmployeeIdValidator()
                .setNextValidator(new AgeValidator()
                        .setNextValidator(new NameValidator()));
        System.out.println(validatorChain.isValid(validEmployee));

        Employee invalidEmployee = new Employee(1, "Snehasish", "Roy", 100, 100, 10);
        System.out.println(validatorChain.isValid(invalidEmployee));
    }

    public static void testPrototype() {
        List<Integer> mileage = new ArrayList<>();
        mileage.add(10);
        mileage.add(20);
        Car originalCar = new Car("bentley", mileage);
        Car shallowClone = originalCar.clone();
        Car deepClone = new Car(originalCar);

        List<Integer> clonedMileage = shallowClone.getMileage();
        System.out.println(shallowClone.getName() + " " + clonedMileage);
        mileage.set(0, 50);
        System.out.println(clonedMileage.get(0).equals(50));

        System.out.println(deepClone.getMileage().get(0).equals(10));
    }

    public static void testStrategy() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();
        MergeSort<Integer> mergeSort = new MergeSort<>();
        OrderedList<Integer> orderedList1 = new OrderedList<>(list, bubbleSort);
        orderedList1.sort();
        OrderedList<Integer> orderedList2 = new OrderedList<>(list, mergeSort);
        orderedList2.sort();
    }

    public static void testVisitor() {
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