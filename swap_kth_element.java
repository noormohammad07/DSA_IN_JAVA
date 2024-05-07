import java.util.Scanner;

public class swap_kth_element {

    public static void swapKth(int n, int k, int[] arr) {
        // code here
        int st=k-1;
        int ed=n-k;
     
            int temp=arr[st];
            arr[st]=arr[ed];
            arr[ed]=temp;
        
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

        for(int i=0; i<n;i++){
        System.out.println("enter the value of array:=");
        arr[i]=sc.nextInt();
        }

       System.out.println("enter the value of kth element :=");
        int kth=sc.nextInt();  

        System.out.println("array befour kth element swap :=");
        printarr(arr, n);
        swapKth(n, kth, arr);

        System.out.println("array after kth element swap :=");
        printarr(arr, n);
       
    }
    
}
