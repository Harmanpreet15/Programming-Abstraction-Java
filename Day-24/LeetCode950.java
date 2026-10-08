import java.util.*;

public class LeetCode950 {

    public static int[] deckRevealedIncreasing(int[] deck) {

        Arrays.sort(deck);

        java.util.Queue<Integer> q = new java.util.LinkedList<>();

        // Store indexes in the queue
        for (int i = 0; i < deck.length; i++) {
            q.add(i);
        }

        int[] result = new int[deck.length];

        for (int card : deck) {

            // Put the smallest card at the current index
            int index = q.remove();
            result[index] = card;

            // Move the next index to the back
            if (!q.isEmpty()) {
                q.add(q.remove());
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] deck = {17, 13, 11, 2, 3, 5, 7};

        int[] result = deckRevealedIncreasing(deck);

        System.out.println(Arrays.toString(result));
    }
}