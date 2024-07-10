import java.util.Scanner;
public class pair_sum_in_array {

      //  print array method ......................
      public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //   array input method ................
    public static int [] array_input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n :=");
        int n=sc.nextInt();
        int arr[]=new int [n];

        for(int i=0;i<n;i++){
            System.out.println("enter the value of array at index :=");
            arr[i]=sc.nextInt();
        }

        return arr;
    }

    public static boolean pair_sum(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                 if(arr[i]+arr[j]==k){
                    return true;
                 }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=array_input();
        printarr(arr);

        System.out.println("enter the value of k :=");
         int k=sc.nextInt();
       
         boolean ans=pair_sum(arr, k);
         System.out.println("ans :="+ans);
    }
}
