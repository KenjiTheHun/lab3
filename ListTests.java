import static org.junit.Assert.*;
import java.util.*;
import org.junit.*;

public class ListTests {
    @Test
    public void testFilter() {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("pear");
        list.add("orange");
        List<String> result = ListExamples.filter(list, (String s) -> {return s.contains("p");});
        assertArrayEquals(new String[] {"apple", "pear"}, result.toArray());
    }

    @Test
    public void testMerge() {
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("1","3","5"));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("2","4","6"));

        assertArrayEquals(new String[] {"1","2","3","4","5","6"}, ListExamples.merge(arr1, arr2).toArray());
    }
}