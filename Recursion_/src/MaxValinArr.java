public class MaxValinArr {
    static int printMax(int[] arr , int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int z = printMax(arr , index+1);
        if(arr[index] >z){  // compare two element on index and index+1 
            return arr[index];
        }
        return z;
    }

   public static void main(String[] args) {
        int[] arr = {2,4,6,7,19,34};
       int Max =  printMax(arr , 0);
       System.out.println(Max);
    }

}
