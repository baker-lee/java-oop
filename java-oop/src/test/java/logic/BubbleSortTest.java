package logic;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void given_List_WhenExecuting_ThenReturnSortedList(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

        assertEquals(List.of(3, 2, 1, 4, 5), actual);
    }
}