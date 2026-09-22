import java.util.Stack;

class StockSpanner {

    Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});

        return span;
    }
}

public class Main {

    public static void main(String[] args) {

        StockSpanner stock = new StockSpanner();

        System.out.println(stock.next(100)); // 1
        System.out.println(stock.next(80));  // 1
        System.out.println(stock.next(60));  // 1
        System.out.println(stock.next(70));  // 2
        System.out.println(stock.next(60));  // 1
        System.out.println(stock.next(75));  // 4
        System.out.println(stock.next(85));  // 6
    }
}