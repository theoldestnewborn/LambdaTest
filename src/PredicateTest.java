
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

class PredicateTest<T> {
    public ArrayList<T> sortList (List<T> list, Predicate<T> predicate , UnaryOperator <T> unary) {
        ArrayList <T> filteredList = new ArrayList<>();
        for (T t :list) {
            if (predicate.test(t)) {
                filteredList.add(unary.apply(t));
            }
        }
        return filteredList;
    }
}
