import java.util.Arrays;
import java.util.Scanner;

//function for binery search. 

public class basic {
    public int bsearch(int arr[],int s) {
        Arrays.sort(arr);
        int n=arr.length;
        int f=0;
        int l=n;
        while(f<=l){
            int m=(f+l)/2;
            if(arr[m]==s){
                return m;
            }else if(arr[m]>s){
                l=m-1;
            }else{
                f=m+1;
            }
        }
        return -1; 
    }

 // function for printing array.    
     public void printarr(int[]arr){
        int n=arr.length;
       
        for(int i=0; i<n; i++){
            System.out.println("arr"+i+"="+arr[i]);
        }
        System.out.println();
     }

     // main methord for calling every function.
    public static void main(String[] args) {
       
        basic cl=new basic();
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int n=arr.length;
        for(int i=0; i<n; i++){
        System.out.print("arr"+i+"=");
           arr[i]=sc.nextInt();
        }
        System.out.println("array print befour sort ");
        cl.printarr(arr);
        System.out.println("array print after sort ");
        Arrays.sort(arr);
        cl.printarr(arr);
        System.out.println("enter search element =");
        int s=sc.nextInt();
        int ans=cl.bsearch(arr,s);
        if(ans>=0){
        System.out.println("at index ="+ans);
        }else{
            System.out.println("Element are not present in array");
        }
    }
}