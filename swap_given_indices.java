import java.util.Scanner;

public class swap_given_indices {
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

    //  swap method 

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int arr[]=array_input();

        printarr(arr);

        System.out.println("enter the swaping a,b index :=");
        int a=sc.nextInt();
        int b=sc.nextInt();

        swap(arr, a, b);
        printarr(arr);
    }
}
