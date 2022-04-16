import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        PredicateTest <Integer> newIntPredicate = new PredicateTest <>();
        var IntArray = List.of(1,2,3,4,5);
        ArrayList <Integer> newList = newIntPredicate.sortList(IntArray, (i) -> i<3, (i) -> i*3);
        System.out.println(newList);
        var StringArray = List.of ("Man", "Woman", "Goblin");
        PredicateTest <String> newStringPredicate = new PredicateTest<>();
        ArrayList <String> newStringList = newStringPredicate.sortList(StringArray, (i) -> i.length()>3, (i) -> i +
                " says \"Yo-Ho-Ho!\"");
        System.out.println(newStringList);
    }
}