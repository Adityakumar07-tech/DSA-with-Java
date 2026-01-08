public class frogjump {
    // frog jump either one wall or two which is decide by cost of jumping which is difference of height of wall

    static int best(int[] h, int n, int index){
        if(index==n-1) return 0;

        int op1 = (Math.abs(h[index] - h[index+1])) + best(h, n, index+1);
        if(index==n-2) return op1;
        int op2 = Math.abs(h[index] - h[index+2]) + best(h, n, index+2);

        return Math.min(op1 , op2);
    }
   public static void main(String[] args) {
          int[] h = {10, 30 , 40, 20 };  // height of wall
       System.out.println(best(h,h.length,0));
    }
}