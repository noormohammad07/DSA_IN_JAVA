import java.util.Scanner;
public class prime_seriese {

    public static int fact(int n,int i){
        int ct=0;
        for(int j=1;j*j<=i;j++){
            if(i%j==0){
                if(j!=i/j){
                    ct=ct+2;
                }else{
                    ct++;
                }
            }
        }
        return ct;
    } 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of N:=");
        int n=sc.nextInt();
        int no_of_prime=0;
        for(int i=1;i<n;i++){
            int ct=fact(n,i);
            if(ct==2){
                no_of_prime++;
                System.out.print(""+i+" ");
            }
            
        }
        System.out.println();
        System.out.println("total no of prime no :="+no_of_prime);
        
    }
    
}
