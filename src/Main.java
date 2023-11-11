import Strategy.BubbleSort;
import Strategy.MergeSort;
import Strategy.OrderedList;
import Visitor.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testStrategy();
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