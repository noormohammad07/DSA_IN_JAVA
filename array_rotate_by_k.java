import java.util.Scanner;
public class array_rotate_by_k {

    //  print array method.......
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
//   array reverse method..............
    public static void rev(int arr[],int st,int ed){
       
        while (st<ed) {
            int temp=arr[st];
            arr[st]=arr[ed];
            arr[ed]=temp;
            st++;
            ed--;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=array_input();
       int n=arr.length;
        System.out.println("enter the value of k :=");
        int k=sc.nextInt();

        k=k%n;

      printarr(arr);  

      rev(arr, 0, n-1);
      rev(arr, 0, k-1);
      rev(arr, k, n-1);

      printarr(arr);
    }
    
}
