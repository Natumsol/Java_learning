package tool;

/**
 * Created by natumsol on 16/6/3.
 */
public class MathTools {
    public static int sum(int ...nums) {
        int sum = 0;
        for(int num : nums) {
            sum += num;
        }
        return sum;
    }
}
