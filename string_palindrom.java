import java.util.Scanner;
public class string_palindrom {

    public boolean ispalindrom(String str){
        int st=0;
        int end=str.length()-1;
        char[]ch=str.toCharArray();

        while(st<end){
            if(ch[st]!=ch[end]){
                return false; 
            }
            st++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :=");
        String str=sc.nextLine();
        char[]ch=str.toCharArray();

        string_palindrom sp=new string_palindrom();

    boolean ans=sp.ispalindrom(str);
       System.out.println("is string pelindrom :="+ans);
    }
}
