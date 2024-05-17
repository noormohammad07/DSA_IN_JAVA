import java.util.Scanner;
public class factor_optimised {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter the value of n :=");
      int n=sc.nextInt();

      int factor_ct=0;
      for(int i=1;i<Math.sqrt(n);i++){
        if(n%i==0){
            System.out.println("factor pair :="+i+" "+n/i);
             if(i!=n/i){
                 factor_ct+=2;
             }else{
                 factor_ct++;
             }
        }
       // System.out.println("no of factor :="+factor_ct);
      }
      System.out.println("no of factor :="+factor_ct);

    }
    
}
