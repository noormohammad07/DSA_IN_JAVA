import java.util.Scanner;
public class sum_of_natural_no {

    public static int sum(int n){
        int ans=n*(n+1)/2;
        return ans;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("enter the value of n :=");
       int n=sc.nextInt();

       int ans=sum(n);
       System.out.println("sum of "+n+" natural no :="+ans);
    }
    
}
