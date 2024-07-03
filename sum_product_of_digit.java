import java.util.Scanner;
import java.util.Arrays;
public class sum_product_of_digit {

    public static int [] rev(int arr[],int k ){
        int arrr[]=new int[k];
        int j=k-1;
        for(int i=0;i<k;i++){
            arrr[i]=arr[j];
            j--;
        }
        return arrr;
    }

    public static void printarr(int arr[],int k){
        
        for(int i=0;i<k;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of n :="); 
       int n=sc.nextInt();
       System.out.println("enter the count the number :=");
       int k=sc.nextInt();
       int arr[]=new int[k];
       int sum=0;
       int i=0;
       while(n>0){
        int last=n%10;
        arr[i]=last;
        sum=sum+last;
        n=n/10;
        i++;
       }
       System.out.println("sum of digit :="+sum);
       printarr(arr,k);
       System.out.println("after reverse :=\n");
       int ar[]=rev(arr, k);
       printarr(ar, k);
    }
    
}
