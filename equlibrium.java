import java.util.Scanner;

public class equlibrium {

    public static int equilibriumPoint(int arr[], int n) {

        long sum = 0;
      for(int i=0;i<n;i++){
          sum+=arr[i];
      }
      long leftsum = 0;
      long rightsum = sum;
      
      for(int i=0;i<n;i++){
          rightsum-=arr[i];
          if(leftsum == rightsum) return i+1;
          leftsum+=arr[i];
      }
      return -1;
     
  }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of n :=");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the value of array :=");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        } 

        int ans=equilibriumPoint(arr, n);
        System.out.println("equlebrium index :="+ans);
    }
}
