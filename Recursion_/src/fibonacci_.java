public class fibonacci_ {
    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

     public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            int ans = fibonacci(n);
            System.out.println(ans);
        }
    }
}
