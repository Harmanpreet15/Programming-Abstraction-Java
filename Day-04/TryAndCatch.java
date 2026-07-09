// Write a program
// Commit a Exception
// Add try and catch
// Finally

// Add 2 try
// Add 2 catch


public class TryAndCatch {
    public static void main(String[] args){
        int a = 2;
        int b = 0;

        try{
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception : Cannot divided by 0");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Code executed successfully");
        }

    }
}


// JAR FILE
// WAR FILE