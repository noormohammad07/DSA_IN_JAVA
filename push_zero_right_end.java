import java.util.Scanner;

public class push_zero_right_end {

    public static void pushZerosToEnd(int[] arr, int n) {
        // code here
        int j=0;
        
        for(int i=0; i<n; i++){
            if(arr[i] != 0)
                arr[j++] = arr[i];
        }   
        for(int i=j; i<n; i++){
            arr[i] = 0;
        }
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

        pushZerosToEnd(arr, n);
        for(int i=0;i<n;i++){
            System.out.println(" "+arr[i]);
        }

    }
}
