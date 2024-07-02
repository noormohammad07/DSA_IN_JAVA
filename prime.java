import java.util.Scanner;
public class prime {

    public static boolean prim(int n){

        int ct=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i!=n/i){
                    ct=ct+2;
                }else{
                    ct++;
                }
            }
        }
        if(ct==2){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) {
        // check no is prime or not 
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of n :=");
        int n=sc.nextInt();

        boolean ans=prim(n);

        System.out.println("Ans :="+ans);

    }
}
