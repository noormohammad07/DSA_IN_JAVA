import java.util.Scanner;

public class sawp {
    public static void swap_uing_variable(int a,int b){
        int temp=a;
        a=b;
        b=temp;
       // System.out.println("a :="+a+" ,b :="+b);
    }

    public static void swap_without_uing_variable(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
       // System.out.println("a :="+a+" ,b :="+b);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of variable a,b :=");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a :="+a+" ,b :="+b);

        //swap_uing_variable(a, b);
        
        swap_without_uing_variable(a, b);
        System.out.println("a :="+a+" ,b :="+b);
    }
}
