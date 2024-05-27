import java.util.Scanner;

public class slection_sort {

    public static void sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int min=arr[i];
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of n :=");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.println("enter the value of array :=");
       for(int i=0; i<n;i++){
        arr[i]=sc.nextInt();
       }
        // int arr[]={5,7,3,1,9,4,2};

        sort(arr, n);
        for(int s:arr){
        System.out.print(s+" ");
      }
    }
    
}
