public class Nbits {
    static void generateStrings(int n, StringBuilder current) {

    if (current.length() == n) {
        System.out.println(current);
        return;
    }

    current.append('0');
    generateStrings(n, current);
    current.deleteCharAt(current.length() - 1);

    current.append('1');
    generateStrings(n, current);
    current.deleteCharAt(current.length() - 1);
}

    public static void main(String[] args) {
        int n = 3;
        StringBuilder current = new StringBuilder();
        generateStrings(n, current);
    }
}
