public class sumOfSubsetOfArray {
    static void subsetSum(int[] a, int n , int index, int currSum){
        if(index>=n){
            System.out.println(currSum);
            return;
        }
        // curr index + sum
        subsetSum(a,n,index+1,currSum+a[index]); // inculde


        // curr ans

        subsetSum(a,n,index+1,currSum); // excludive
    }

   public static void main(String[] args) {
  int[] a = {2,4,5,};
  subsetSum(a,a.length,0,0);
    }
}
