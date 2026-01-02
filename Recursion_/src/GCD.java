import java.util.Scanner;

public class GCD {
    static int gcd_(int x , int y ){
        if(y==0){
            return x;
        }
        return gcd_(y,x%y);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd_(x,y));

    }
}
