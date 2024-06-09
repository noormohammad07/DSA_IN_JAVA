import java.util.Scanner;
import java.util.Stack;
public class reverse_string_using_stack {

    public static String reverse(String s){
            Stack<Character> st=new Stack<>();
        int l=s.length();
        for (int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            st.push(ch);
        }
      
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of String :=");
        String s=sc.nextLine();
        String ans=reverse(s);
        System.out.println("ans :="+ans);
    }
}
