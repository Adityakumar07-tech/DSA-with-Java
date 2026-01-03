import java.util.Scanner;

public class ElementExistOrNpt {
    static int CheckElementExistence(int[] arr, int index , int x){
        if(index == arr.length){
            return -1;
        }

        if(arr[index]==x){
            return 1;
        }

        return  CheckElementExistence(arr , index+1 , x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Element ");
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element for Check Exist or not in array = ");
        int x = sc.nextInt();

        int existance = CheckElementExistence(arr , 0 , x);
        if (existance == 1){
            System.out.println("Element " + x + " Exist in the array ");
        }
        else
            System.out.println("Element " + x + " not exist ");
    }
}
