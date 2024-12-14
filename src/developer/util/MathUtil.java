package developer.util;

public class MathUtil {
    public static int sum(int ...values){
        int sum = 0;
        for (var value:values) {
            sum += value;
        }
        return sum;
    }
}
