public class Arrayrecursion {

    // this method traverse the array using recursion

    static void printarray(int[] arr , int index){
        int n = arr.length;
        if(index==n){ // base case
            return;
        }
        System.out.println(arr[index]); // self work
        printarray(arr , index+1); // this is recursive work
    }

   public static void main(String[] args) {
       int[] arr = {1,4,5,7,8};
       printarray(arr,0);
    }
}
