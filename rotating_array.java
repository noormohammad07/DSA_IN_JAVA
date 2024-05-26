import java.util.Scanner;
public class rotating_array {

    public static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int arr[],int st,int ed){
        while(st<ed){
            int temp=arr[st];
            arr[st]=arr[ed];
            arr[ed]=temp;
            st++;
            ed--;
        }
    } 
    public static void leftRotate(int[] arr, int n, int d) {
       // code here
       d=d%n;
       print(arr, n);
       reverse(arr,0,d-1);
       print(arr, n);
       reverse(arr,d,n-1);
       print(arr, n);
       reverse(arr,0,n-1);
       print(arr, n);
       
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n :=");
        int n=sc.nextInt();
        System.out.println("enter the value of d :=");
        int d=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the value of array :=");
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt(); 
        }

        leftRotate(arr, n, d);
        
    }
    
}
