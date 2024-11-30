package src.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;







public class SortingAlgorithmsTest {
    
public void testQuicksort() {
        List<Integer> list = Arrays.asList(5, 3, 8, 1, 2);
        SortingAlgorithms.quicksort(list);
        assertEquals(Arrays.asList(1, 2, 3, 5, 8), list);
    }










}
