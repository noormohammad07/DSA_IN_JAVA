import java.util.HashSet;
import java.util.Scanner;

public class remove_dupicate {

    public static int remove_dup_ele(int arr[],int n,int arrr[],int m){
        HashSet<Integer> set=new HashSet<>();

        for(int i=0; i<n;i++){
            set.add(arr[i]);
         } 

         for(int i=0; i<m;i++){
            set.add(arrr[i]);
         }  

        int c=set.size();
        return c;
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

        System.out.println("enter the value of m:=");
        int m=sc.nextInt();
        
        int arrr[]=new int[m];

        for(int i=0; i<m;i++){
           System.out.println("enter the value of array:=");
           arrr[i]=sc.nextInt();
        } 

        int ans=remove_dup_ele(arr, n, arrr, m);

        System.out.println("No of same  element :="+ans);
    }
}
