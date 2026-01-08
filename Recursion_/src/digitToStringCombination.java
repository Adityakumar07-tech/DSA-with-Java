import java.util.*;

   public class digitToStringCombination {
    static void combination(String dig ,String Kp[], String res){
        if(dig.length() == 0){
            System.out.println(res + " ");
            return;
        }

        int currNum = dig.charAt(0) - '0'; //
        String currChoice = Kp[currNum]; // "abc"

        for (int i=0; i<currChoice.length(); i++){
            combination(dig.substring(1),Kp , res+currChoice.charAt(i));
        }
    }

    static void main(String[] args) {
      String dig ="23";
    // kp[7] = "pqrs"
      String[] Kp = { "" , "" , "abc", "def", "ghi", "jkl","mno","pqrs","tuv","wxyz" };
    //                 0   1      2     3      4       5      6     7     8       9


        combination(dig , Kp,"");

    }

}
