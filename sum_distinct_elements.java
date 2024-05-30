import java.util.Arrays;
import java.util.Scanner;
public class sum_distinct_elements {

    public static int findSum(int arr[], int n) {
        // code here
        Arrays.sort(arr);
    int sum=arr[0];
    for(int i=0;i<n-1;i++){
        if(arr[i]<arr[i+1]){
            sum+=arr[i+1];
        }
    }
    return sum;
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

        int ans=findSum(arr, n);
        System.out.println("ans :="+ans);
    }
}
