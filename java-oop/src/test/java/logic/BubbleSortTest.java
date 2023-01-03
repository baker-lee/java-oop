package logic;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블정렬 - 리스트를 넣으면 정렬된 결과를 보여줌")
    @Test
    public void given_List_WhenExecuting_ThenReturnSortedList(){
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        List<Integer> actual = bubbleSort.sort(List.of(3, 2, 4, 5, 1));

        assertEquals(List.of(3, 2, 1, 4, 5), actual);
    }
}