import java.util.ArrayList;
import java.util.List;

public class KidsCandies1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = findMax(candies);
        List<Boolean> out = new ArrayList<>();
        for (int kid : candies ) {
            if (kid + extraCandies >= max) {
                out.add(true);
            } else {
                out.add(false);
            }
        }

        return out;
   }

    public int findMax(int[] arr) {
        // Initialize max with the first element of the array
        int max = arr[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Update max if the current element is greater
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
