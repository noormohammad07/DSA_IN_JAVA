import java.util.Scanner;
public class immedate_smaller {
  
    public static void immed_small(int arr[],int n){
        int index=1;

        for(int i=0;i<=n;i++){
            if(index==n){
                arr[i]=-1;
                break;
            }
            if(arr[i]>arr[index]){
                arr[i]=arr[index];
            }else{
                arr[i]=-1;
            }
            index++;
        }
    }

    //print array function

    public static void print_arr(int arr[],int n){
        

        for(int i=0;i<n;i++){
            System.out.print("  "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of n :=");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            System.out.println("enter the value of array :=");
            arr[i]=sc.nextInt();
        }

        immed_small(arr, n);
        print_arr(arr, n);
    }
}
