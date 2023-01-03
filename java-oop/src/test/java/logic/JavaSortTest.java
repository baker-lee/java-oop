package logic;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaSortTest {

    @DisplayName("Java정렬 - 리스트를 넣으면 정렬된 결과를 보여줌")
    @Test
    void given_List_WhenExecuting_ThenReturnSortedList(){
        JavaSort<Integer> javaSort = new JavaSort<>();

        List<Integer> actual = javaSort.sort(List.of(3, 2, 4, 5, 1));

        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}