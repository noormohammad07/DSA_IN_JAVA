import java.util.Scanner;

public class move_zero_to_end {

    public static void move_zero(int arr[]){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                 index++;
            }
        }
        for(int i=index;i<arr.length;i++){
            arr[i]=0;
        }

        for(int x:arr){
            System.out.print(x+"\t");
        }
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

      move_zero(arr);
    }
    
}
