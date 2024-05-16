import java.util.Scanner;
public class cyclic_rotate_by_1 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter the value of n :=");
      int n=sc.nextInt();
      int arr[]=new int[n];

      System.out.println("enter the value of array :=");
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }

      int temp=arr[0];
      int after=0;
      // pre define value of 0th index 
      arr[0]=arr[n-1];

      for(int i=1;i<n;i++){
        after=arr[i];
        arr[i]=temp;
        temp=after;
      }

      System.out.println("Array after  cyclic rotation :=");
      for(int i=0;i<n;i++){
       System.out.println(arr[i]+" ");
      }
    }
}
