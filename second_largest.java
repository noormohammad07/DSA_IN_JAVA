// time complexity for sec largest=O(n),space complexity O(1)
import java.util.Scanner;
public class second_largest {

    public void print_sec_largest(int arr[],int n){
        int first,second;
        first=second=Integer.MIN_VALUE;

        if(n<2){
            System.out.println("invalid input :");
            return;
        }

        for(int i=0;i<n;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
        }
        if(second==Integer.MIN_VALUE){
            System.out.println("in this array no second largest element present :=");
        }else{
            System.out.println("second largest element ="+second);
        }
        
    }
   public static <print_sec_largest> void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of n =");
    int n=sc.nextInt();

    int arr[]=new int[n];
    for(int i=0;i<n;i++){
    System.out.println("enter the array elementat index"+i);
    arr[i]=sc.nextInt();
    }
    second_largest sl=new second_largest();

    sl.print_sec_largest(arr, n);

   } 
}
