import java.util.Arrays;
import java.util.ArrayList;
public class Runner {
    public static void main(String[] args){
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));
        for(int i = 0; i < numList.size() - 2; i++){
            numList.set(i, numList.get(i + 1) + numList.get(i + 2));
        }
        System.out.println(numList);
    }
}
