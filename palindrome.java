import java.util.Scanner;
public class Main
{
    public static int isPalindrome(String s) {
        // code here
        int n=s.length();
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return 0;
            }
        }
        return 1;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
		System.out.println("enter the String :=");
		String s=sc.nextLine();
		int ans=isPalindrome(s);
		System.out.println("ans :="+ans);
	}
}
