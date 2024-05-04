import java.util.Arrays;
import java.util.Scanner;

public class find_midian {

      public int find_median(int[] arr)
    {
        // Code here
        int n=arr.length;
        Arrays.sort(arr);
        int size=n/2;
        if(n%2!=0){
            return arr[size];
        }else{
            int ans=(arr[size]+arr[size-1])/2;
            return ans;
        }
    }

    public void print_array(int[]arr){
        int n=arr.length;
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
        find_midian fm=new find_midian();
        int ans=fm.find_median(arr);
        fm.print_array(arr);
        System.out.println("median of the array is :="+ans);
    }
}
