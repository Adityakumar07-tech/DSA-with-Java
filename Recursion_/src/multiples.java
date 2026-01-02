import java.util.Scanner;

public class multiples {

    static void Multi(int n, int k){
        // base case
        if(k==1){
            System.out.println(n);
            return;
        }
        // small problem
        Multi(n,k-1);
        // self work
        System.out.println(n*k);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the multiple number");
        int n = sc.nextInt();
        System.out.println("Enter the multiple time ");
        int k = sc.nextInt();
        Multi(n,k);
        
        
    }
}
