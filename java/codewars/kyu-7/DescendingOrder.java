import java.util.*;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    //Your code
    String str = Integer.toString(num); 
    //^did it this way because integers are primitives, cant be invoked methods at
    String[] arr = str.split("");
    Arrays.sort(arr, Collections.reverseOrder());
    return Integer.valueOf(String.join("", arr));
  }
}

/*
Tests
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class DescendingOrderTest {

    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(1, DescendingOrder.sortDesc(1));
    }

    @Test
    public void test_03() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    public void test_04() {
        assertEquals(2110, DescendingOrder.sortDesc(1021));
    }

    @Test
    public void test_05() {
        assertEquals(987654321, DescendingOrder.sortDesc(123495678));
    }
}
 */
