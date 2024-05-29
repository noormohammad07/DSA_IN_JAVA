import java.util.Scanner;
public class k_apper_in_array {
    public static int num(int a[], int n, int k)
    {
         //Your code here
         int ct=0;
         for(int i=0;i<n; i++){
             int num=a[i];
             while(num!=0){
                 int ans=num%10;
                 if(ans==k){
                     ct++;
                 }
                 num/=10;
             }
         }
         return ct;
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

        System.out.println("enter the value of k :=");
        int k=sc.nextInt();

        int ans=num(arr, n, k);
        System.out.println("count :="+ans);
    }
    
}
