// Leetcode - 735

import java.util.*;

class LeetCode735 {
    public static int[] Collision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            // Collision can happen only when:
            // stack top is positive and current asteroid is negative
            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {

                if (stack.peek() < -asteroid) {
                    // Top asteroid is smaller
                    stack.pop();
                    continue;
                }

                else if (stack.peek() == -asteroid) {
                    // Both have same size
                    stack.pop();
                }

                destroyed = true;
                break;
            }

            // Current asteroid survives
            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        int[] result = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] asteroids = {5, 10, -5};

        int[] result = Collision(asteroids);

        System.out.println(Arrays.toString(result));
    }
}
