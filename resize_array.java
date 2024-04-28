import java.util.Scanner;
public class resize_array {

    public void resizearr(int arr[],int b){
        int temp[]=new int[b];
        int n=arr.length;
        for(int i=0;i<n;i++){
          temp[i]=arr[i];
        }
    }
    public void printarr(int []arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array :-");
      int n=sc.nextInt();
      int arr[]=new int[n];
       
      System.out.println("enter the element of an array :="+n);
      for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
      }
     
      System.out.println("how much capacity of array you want to increase");
      int cap=sc.nextInt();

     System.out.println("length of the array befour change:= "+arr.length);
     
     resize_array rs=new resize_array();
     rs.printarr(arr);
     rs.resizearr(arr, cap);
     
     System.out.println("length of the array after change :="+arr.length);
     System.out.println("enter the element of an array :="+cap);
      for(int i=0; i<cap; i++){
        arr[i]=sc.nextInt();
      }
      rs.printarr(arr);

   }
    
}
