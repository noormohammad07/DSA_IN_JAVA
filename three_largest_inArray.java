import java.util.Scanner;
public class three_largest_inArray {

    public void three_largest(int arr[],int n){
        int first=0,sec=0,thrd=0;

        for(int i=0; i<n; i++){
            if(arr[i]>first){
               thrd=sec;
               sec=first;
               first=arr[i];
            }else if(arr[i]>sec){
                thrd=sec;
                sec=arr[i];
            }else if(arr[i]>first){
                first=arr[i];
            }
        }
        System.out.println("three largest element of Array ="+first+" "+sec+" "+thrd);
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n");
    int n=sc.nextInt();

    int arr[]=new int[n];
    System.out.println("enter the value of array :=");
    for(int i=0;i<n; i++) {
      arr[i]=sc.nextInt();
    }

    three_largest_inArray lr=new three_largest_inArray();
    lr.three_largest(arr, n);


   } 
}
