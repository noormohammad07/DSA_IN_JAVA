import java.util.Scanner;

public class min_value_in_arr {

    public int min_ele(int arr[]){
        int n=arr.length;
        int min=arr[0];

        for(int i=0; i<n; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of n :=");
        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n; i++){
         System.out.println("enter the element at index at :-"+i);
         arr[i]=sc.nextInt();
        }

        min_value_in_arr mn=new min_value_in_arr();
        int ans=mn.min_ele(arr);

        System.out.println("minimum value of the array is :-"+ans);
    }
    
}
