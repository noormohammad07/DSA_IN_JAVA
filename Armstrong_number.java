import java.util.Scanner;
public class Armstrong_number {
    public static boolean is_Armstrong(int num){
       int n=num;
       int sum=0;
       while(num>0){
        int last=num%10;
        sum=sum+(last*last*last);
        num=num/10;
       }
       
       if(n==sum){
        return true;
       }else{
        return false;
       }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num :=");
        int num=sc.nextInt();

        boolean ans=is_Armstrong(num);

        System.out.println("Number is Armstrong :="+ans);

    }
    
}
