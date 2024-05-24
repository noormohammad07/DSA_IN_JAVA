import java.util.Scanner;
public class game_with_no {

    public static void or(int arr[],int n){
       for(int i=0;i<n-1;i++){
        arr[i]=arr[i]^arr[i+1];
       }

    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the value of N :=");
    int n=sc.nextInt();

    int arr[]=new int [n];

    System.out.println("enter the value of array :=");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }

    or(arr, n);

    for(int i=0;i<n;i++){
        System.out.print(" "+arr[i]);
       }
   } 
}
