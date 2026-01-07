import java.util.ArrayList;

public class subsequenceOfString {
    // Method 2 -> ->
    static void printSSQ(String s , String currAns){
      // base case
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);

        // curr char --> choose to be a part of currAns
        printSSQ(remString , currAns + curr); // add curr

        printSSQ(remString , currAns); // do not add curr

    }

    // method 1 -> -> ->
static ArrayList<String> getSSQ(String s){
    ArrayList<String> ans = new ArrayList<>();

    // base case
    if(s.length() == 0){
        ans.add("");
        return ans;
    }
    // recursive relations
    char curr = s.charAt(0) ; // a

    ArrayList<String> smallAns = getSSQ(s.substring(1));

    //  ans = [ "bc", "b", "c". "", "abc", "ab", "ac","a"]
    for(String ss : smallAns){
        ans.add(ss);
        ans.add(curr + ss);
    }
    return ans ;

}

   public  static void main(String[] args) {

     ArrayList<String> ans = getSSQ("abc");
//     for(String ss : ans){
//         System.out.println(ss);
//     }

       printSSQ("abc" , "");

    }
}
