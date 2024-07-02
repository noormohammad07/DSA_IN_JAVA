import java.util.Scanner;
public class factorial {

    public static int fac(int n ){

        int ct=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
               if(i!=n/i){
                  ct=ct+2;
                System.out.println(i+"  "+(n/i));
               }else{
                ct++;
                System.out.println(i);
               }
            }
        }
        return ct;
    }

    public static int fat(int n ){

        int ct=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
              //  System.out.println(i);
               ct++;
            }
        }
        return ct;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of N :=");
        int n=sc.nextInt();
        int ans=fac(n);
        int ans2=fat(n);
        System.out.println(ans);
        System.out.println(ans2);
    }
    
}
