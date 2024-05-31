import java.util.Scanner;
public class wave_array {

    public static void printarr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }

    public static void wave(int arr[],int n){
        int i=0;
        while(i<n-1){
            if(arr[i]<arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i+=2;
            }
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

        printarr(arr, n);
        wave(arr, n);
        System.out.print("wave array");
        printarr(arr, n);

        

    }
}
