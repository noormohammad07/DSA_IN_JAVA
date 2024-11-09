import java.util.Scanner;

public class check_array_sorted {

    public static boolean is_array_sorted(int arr[]){
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]>arr[i+1]){
                System.out.println(i+1+" index");
                return false;
             }
        }
        return true;
    }
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
       System.out.println("enter the size of array");
       int n=sc.nextInt();
      int arr[]=new int[n];

      for(int i=0;i<n;i++){
         System.out.println("enter the element at index ="+i);
         arr[i]=sc.nextInt();
      }

      System.out.println("is array sorted :="+is_array_sorted(arr));

    }
    
}
