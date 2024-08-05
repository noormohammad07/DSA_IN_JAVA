package array;
import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of num :=");
                 int num=sc.nextInt();
                 int n=num;
                int sum=0;
                while(num>0){
                    int last=num%10;
                     sum=sum*10+last;
                     num=num/10;
                }
                if(n==sum){
                   System.out.println("true");
                }else{
                    System.out.println("false");
                }
            }
        }

