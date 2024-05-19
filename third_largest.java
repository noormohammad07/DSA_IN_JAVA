import java.util.Arrays;
import java.util.Scanner;
public class third_largest {

    public static int  optimised(int arr[],int n){
      Arrays.sort(arr);
      int lst3=n-3;
	   
	   if(n>=3){
	       return arr[lst3];
	   }else{
	       return -1;
	   }
    }

    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
           
        } 
    }

    public static int brout_force(int arr[],int n){
        int temp=0;
        int first=0;
        int sec=0;
        int thrd=0;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                temp=first;
                first=arr[i];
                thrd=sec;
                sec=temp;
            }else if(arr[i]<first && arr[i]>sec){
                thrd=sec;
                sec=arr[i];
            }else{
                thrd=arr[i];
            }
        }
        return thrd;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n :=");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter the value in array at index :"+i);
            arr[i]=sc.nextInt();
        }

        // int ans=brout_force(arr, n);
        // System.out.println("third largest :="+ans);

        print(arr, n);
        int ans=optimised(arr, n);
        System.out.println("third largest :="+ans);
    }

    
}
