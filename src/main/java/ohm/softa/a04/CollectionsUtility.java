package ohm.softa.a04;

import java.util.Comparator;

public abstract class CollectionsUtility {
    private CollectionsUtility() { }

    public static <T> SimpleList<T> sort(SimpleList<T> list, Comparator<T> cmp) {
        SimpleListImpl<T> result = new SimpleListImpl<>();

        // TODO
        // Merge-Sort

        return result;
    }
}
