import java.util.Scanner;

public class sumOfArrayElement {
    static int sumElement(int[] arr , int index){
        if(index == arr.length -1){
            return arr[index];
        }
        return arr[index]+sumElement(arr , index+1);
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
        int sum = sumElement(arr,0);
        System.out.println("Sum of all element of Array is = " + sum);
    }
}
