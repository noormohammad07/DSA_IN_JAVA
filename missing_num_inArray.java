import java.util.Scanner;
public class missing_num_inArray {

// missing number from range 1 to n .....
    public int miss_num(int arr[],int n){
        // 1 number is missing of this ordre.
       int sum=n*(n+1)/2;

        for(int num:arr){
        sum=sum-num;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n =");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the value of array =");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
       
        missing_num_inArray ms=new missing_num_inArray();
        int ans=ms.miss_num(arr, n);
        System.out.println("missing num ="+ans);
    }
}
