import java.util.Scanner;
public class missing_num_in_array {

    public static int missing_num(int arr[],int n){
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
        }
        int total=(n*(n+1))/2;
        int ans=total-sum;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n-1];

        System.out.println("enter the value of array at index :=");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }

        int ans=missing_num(arr, n);

        System.out.println("missing no is :="+ans);
    }
}
