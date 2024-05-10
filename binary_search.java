import java.util.Scanner;

public class binary_search {
    public static int binarysearch(int arr[], int n, int k) {
        // code here
       
        int st=0;
        int ed=n-1;
       while(st<=ed){
           int mid=(st+ed)/2;
           if(arr[mid]==k){
               return mid;
           }else if(arr[mid]<k){
               st=mid+1;
               
           }else{
               ed=mid-1;
           }
           
       }
       return -1;
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

        System.out.println("enter the value of k :=");
        int k=sc.nextInt();
        
        int ans=binarysearch(arr, n, k);

        System.out.println("element present at index"+ans);
    }
}
