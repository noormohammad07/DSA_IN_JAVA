import java.util.Scanner;

public class insertion_sort {

    public static void printarr(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void sort(int arr[],int n){
        int key=0;
        int j=0;
        for(int i=1;i<n;i++){
            key=arr[i];
            j=i-1;

            while(key<arr[j]&&j>=0){
                 arr[j+1]=arr[j];
                 j--;
            }
            arr[j+1]=key;


        }

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

      
        
        sort(arr, n);
         printarr(arr, n);

}
}
