import java.util.Scanner;

public class avg_array_elememt {

    public static String average(int arr[], int N)
    {
       float sum=0;
       for(int i=0;i<N;i++){
           sum+=arr[i];
         
       }
       float f=sum/N;
       return String.format("%.2f",f);
       
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

        String s=average(arr, n);

        System.out.println("averages of array :="+s);
    }
    
}
