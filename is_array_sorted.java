import java.util.Scanner;
public class is_array_sorted {
    
    public static boolean is_sorted(int arr[],int n)
    {
        boolean b=true;
        int i=1;
        while(i<n){
            if(arr[i-1]>arr[i]){
                b=false;
            }
            i++;
        }
        return b;
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

        boolean ans=is_sorted(arr, n);
        if(ans==true){
            System.out.println("1");
        }else{
            System.out.println("0");
        }


    }
    
}
