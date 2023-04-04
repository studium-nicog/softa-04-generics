package ohm.softa.a04.tests;

import ohm.softa.a04.CollectionsUtility;
import ohm.softa.a04.SimpleListImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollectionsUtilityTest {
    @Test
    void testSort() {
        SimpleListImpl<Integer> list = new SimpleListImpl<>();
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(1);

        CollectionsUtility.sort(list, (o1, o2) -> 0);

        int count = 0;
        for (Integer i : list) {
            count++;
            assertEquals(count, i);
        }
    }
}
