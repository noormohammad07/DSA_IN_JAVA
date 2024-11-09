import java.util.Scanner;

public class count_occurance_in_array {

    public static int count_ele_in_array(int arr[],int ele){
        int ct=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                  ct++;
            }
         }
         return ct;
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
      System.out.println("enter the counting element");
      int ele=sc.nextInt();

      System.out.println("count of the element is ="+count_ele_in_array(arr, ele));
       
      for(int x:arr){
        System.out.print(x+"\t");
      }
    }
    
}
