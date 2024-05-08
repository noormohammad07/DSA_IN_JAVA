import java.util.Scanner;
public class count_smaller {

    public int countOfElements(int []arr,int n,int x)
    {
        // code here
        int ct=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                ct++;
            }
        }
        return ct;
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
        System.out.println("enter the value of x :=");
        int x=sc.nextInt();
        
        count_smaller cs=new count_smaller();
       
        System.out.println((cs.countOfElements(arr, n, x)));
    }
}
