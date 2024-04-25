import java.util.Scanner;
public class reverse_array {
    public void rev_array(int []arr,int a,int b){
        while(a<b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }

    public void print_array(int[]arr,int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the size of the array :-"); 
       int n=sc.nextInt();
       int a=0;
       int arr[]=new int[n];

       for(int i=0; i<n; i++){
        System.out.println("enter the array element at index :-"+i);
        arr[i]=sc.nextInt();
       }

       // craeting the obj of this class
          reverse_array rs=new reverse_array();
    
        // print the array befour reverse.
        rs.print_array(arr, n);  

        // call the reverse function by using this class object
        // becouse  these function are not static..
        rs.rev_array(arr, a, n-1);

        // call print array function after the reverse the array
        rs.print_array(arr, n);

    }
}
