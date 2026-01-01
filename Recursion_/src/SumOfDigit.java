import java.util.Scanner;

public class SumOfDigit {
    static int sumOfDigit(int n){
        if(n>=0 && n<=9){
            return n;
        }
        return sumOfDigit(n/10) + (n%10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit what you want i will give you sum of every digit in your digit = ");
        int n = sc.nextInt();
        System.out.print("your Answer is ready = ");
        System.out.print(sumOfDigit(n));
    }
}
