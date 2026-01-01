public class PToPowerQ {
//    static int pow(int p, int q){
//        if(q==0) return 1;
//        int smallAns = pow(p , q/2);
//        if(q%2==0){
//            return smallAns*smallAns;
//        }
//        return p*smallAns*smallAns;
//    }
    // time complexity of upper method is O(logq)
    static int Ppowerq(int p , int q){
        if(q==0){
            return 1;
        }
        return Ppowerq(p,q-1)*p;
    }
    // time complexity of upper method is O(q)

    public static void main(String[] args) {
        int p = 4;
        int q = 8;
        System.out.println(Ppowerq(p,q));
    }
}
