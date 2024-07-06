import java.util.Scanner;
public class fibbonachi_series {

    public static void fibonachi(int n) {

    System.out.print("fibonchi series:=");
        int first=0;
        System.out.print(" "+first);
        int sec=1;
        for(int i=0;i<n;i++){
            int thir=first+sec;
            System.out.print(" "+thir);
            first=sec;
            sec=thir;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of n no of fibonachi series :=");
        int n=sc.nextInt();
          
        fibonachi(n);

    }
}
