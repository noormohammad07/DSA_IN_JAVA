import java.util.Scanner;
public class remove_even_integer_from_array {

    // creating remove even element by the array.
    public int[]remove_even(int arr[],int n){
        
        int odd_ct=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2!=0){
                odd_ct++;
            }
        }

        int []ans=new int[odd_ct];
        int idx=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2!=0){
                ans[idx]=arr[i];
                idx++;
            }
        }
        return ans;
    }

      //creatint print array method.
    public void print_arr(int arr[]){
        int n=arr.length;
        System.out.print("ans array =");
        for(int i=0; i<n; i++){
           // System.out.print("ans array =");
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // taking array by user input.
        System.out.println("enter the value of n :-");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            System.out.println("enter the element in array at idx="+i);
            arr[i]=sc.nextInt();
        }

        // creating the obj of this even remove class
        remove_even_integer_from_array ms=new remove_even_integer_from_array();
        // calling even remove function by using this class variable.
        int []result=ms.remove_even(arr,n);
        // calling print array function.
        ms.print_arr(result);
    }
}
