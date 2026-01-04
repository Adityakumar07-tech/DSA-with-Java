import java.util.Scanner;

public class ExitElementIndex {
    // FindAllindex -> this will print all the index of target element
    static void findAllindx(int[] arr , int index , int target){
        if(index == arr.length){
            return ;
        }

        if(arr[index]==target){
            System.out.print(index + " ");
        }

          findAllindx(arr,index+1,target);
    }


    // FindFirstIndex -> this will return the target first index int the array
     public static int Findfirstindex(int[] arr, int index, int x){
        if(index == arr.length){
            return -1;
        }

        if(arr[index]==x){
            return index;
        }

        return  Findfirstindex(arr , index+1 , x);
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

//        int existance = Findfirstindex(arr , 0 , x);
//        System.out.println(" first index of " + x + " in array is " + existance);

        findAllindx(arr,0, x);

    }
}
