import java.util.Scanner;
public class print_prime {

    public static boolean is_prime(int n){
        
        if(n==0||n==1)
              return  false;


        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of n :=");
        int n=sc.nextInt();
        //fact(n);

        int ct=0;
        for(int i=1; i<=n;i++){
            if(is_prime(i)){
                System.out.println(" prime no:"+i);
            }
            if(n%i==0){
                System.out.println("                 "+" fact :="+i);
                // if(is_prime(n)){
                //     System.out.println(" prime no:"+i);
                // }

              
            }
        }
    
    }
}
