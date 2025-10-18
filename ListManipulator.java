import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListManipulator {
    public static void processAndFilter(List<Integer> numbers) {
        System.out.println("Original list: " + numbers);
        for (int i = numbers.size() - 1; i >= 0; i--) {
            //set breakpoint here
            if (numbers.get(i) % 2 == 0) {
                System.out.println("Attempted removal of: " + numbers.get(i));
                numbers.remove(i);
            }
        }
        System.out.println("Final list: " + numbers);
    }
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        processAndFilter(data);
    }
}