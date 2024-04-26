import java.util.Scanner;
public class zero_shiftig_in_last {
    
    public void zero_sift(int arr[]){

        int n=arr.length;
        int j=0;
        for(int i=0; i<n; i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }

    public void printarr(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array :=");
        int n=sc.nextInt();

        int arr[]=new int[n];
         
        System.out.println("enter the array :=");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
         
        zero_shiftig_in_last zs=new zero_shiftig_in_last();

        zs.zero_sift(arr);
        zs.printarr(arr, n);

    }
    
}
