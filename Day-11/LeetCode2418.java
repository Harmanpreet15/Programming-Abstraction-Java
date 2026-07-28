import java.util.Arrays;

public class LeetCode2418 {

    public static String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (heights[j] < heights[j + 1]) {

                    int temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;

                    String temp2 = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp2;
                }
            }
        }

        return names;
    }

    public static void main(String[] args) {

        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
}