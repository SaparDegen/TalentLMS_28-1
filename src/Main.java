import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayInt = {61, 21, 99, 37, 78, 90, 37, 88, 71, 78, 6, 16, 93, 52, 28, 62, 9, 10, 70, 61};

        Object[] arrayIntNew = Arrays.stream(arrayInt).filter(x -> x % 2 == 0).map(x -> x * x).toArray();
        System.out.println(Arrays.toString(arrayIntNew));

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        Integer maxInt = Arrays.stream(arrayInt).filter(x -> x % 2 == 0).map(x -> x * x).max(comparator).get();
        System.out.println(maxInt);
    }
}