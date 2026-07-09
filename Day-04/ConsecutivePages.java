
// REAL-LIFE EXAMPLE

// Imagine you have 10 books on a shelf and want to know which 3 consecutive books have the highest total no. of pages
// Instead of counting all pages for every group from scratch, you count the first 3 books
// Remove the first books pages and the next book's pages
// Continue sliding the window
// This is the sliding window technique

public class ConsecutivePages{
    public static void main(String[] args){
        int[] books = {210, 480, 563, 170, 250, 700, 640, 255, 550, 420};
        int k = 3;

        int sum = 0;
        int starting = 0;
        int ending = 0;

        for(int i=0; i<k; i++){
            sum += books[i];
        }

        int maxSum = sum;

        for(int i=k; i<books.length; i++){
            sum += books[i];
            sum -= books[i-k];

            if(maxSum < sum){
                maxSum = sum;
                starting = i-k+1;
                ending = i;
            }
        }

        System.out.println(maxSum);
        
        for(int i=starting; i<=ending; i++){
            System.out.print(books[i] + " ");
        }
    }
}

