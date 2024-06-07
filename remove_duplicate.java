import java.util.ArrayList;
import java.util.*;

public class remove_duplicate {

    public static String removeDups(String S) {
        // code here
           ArrayList<Character>a =new ArrayList<>();
         StringBuilder ans=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(!a.contains(S.charAt(i))){
                a.add(S.charAt(i));
                 ans.append(S.charAt(i));
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :=");
        String ans=sc.nextLine();
        String str=removeDups(ans);
        System.out.println("ans :="+str);
    }
    
}
