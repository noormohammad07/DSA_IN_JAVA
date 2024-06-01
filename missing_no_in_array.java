import java.util.Scanner;

public class missing_no_in_array {
    
    public static int miss_no(int arr[],int n){
        int i=0;
        int sum=0;
        while(i<n-1){
            sum+=arr[i];
            i++;
        }

        int ans=(n*(n+1))/2;
        return ans-sum;

    } 


     public static void printarr(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n :=");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0; i<n-1;i++){
        System.out.println("enter the value of array:=");
        arr[i]=sc.nextInt();
        }

      int res=miss_no(arr, n);

      System.out.println("missing no is:="+res);

        
    }
      
    
}


