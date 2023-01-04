package logic;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort <T extends Comparable<T>> implements Sort<T>{
    public List<T> sort(List<T> list) {
        List<T> output = new ArrayList<>(list);

        for(int i = output.size() -1; i > 0 ; i--){
            for(int j = 0; j <1; j++){
                if(output.get(i).compareTo(output.get(j + 1)) > 0){
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }

        return output;
    }
}