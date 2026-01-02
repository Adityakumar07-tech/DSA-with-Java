public class AlternateSeriesSum {
    static int serieSum(int n){
        if(n==1){
            return 1;
        }
        if(n%2==0){
            return serieSum(n-1)-n;
        }
        return serieSum(n-1)+n;
    }

    static void main() {
        int n = 10;
        System.out.println(serieSum(n));
    }
}
