import java.util.Scanner;

public class RmoveOccurence {
    static String removeA(String s , int index){
        // base case
        if(index==s.length()) {
            return "";
        }
            //  recursive work
            String smallAns = removeA(s,index+1);
            char currChar = s.charAt(index);

            // self work
            if(currChar!='A'){
                return currChar + smallAns;
            }
//            else if(currChar != 'a'){
//                return currChar + smallAns;
//            }
            else
                return smallAns;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sentence/Word/line ");
        String s = sc.nextLine();
        System.out.println("its only remove Capital ");
        System.out.println(removeA(s,0));
    }
}
