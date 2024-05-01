import java.util.Scanner;
public class array_rotation {
    public void printarr(int arr[],int n){
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
       System.out.println();
    }

    public void left_rotate(int arr[],int d){
        array_rotation ar=new array_rotation();
        int n=arr.length;
        if(d==0){
            return;
        }
        d=d%n;
        ar.reverse_array(arr, 0, d-1);
        ar.reverse_array(arr, d, n-1);
        ar.reverse_array(arr, 0, n-1);
        
    }

    public void reverse_array(int arr[],int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n :=");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n;i++){
        System.out.println("enter the value of array:=");
        arr[i]=sc.nextInt();
        }
        
        System.out.println("enter the rotating index :=");
        int d=sc.nextInt();
       
        array_rotation ar=new array_rotation();
        System.out.println("print the array befour rotation :=");
        ar.printarr(arr, n);

        ar.left_rotate(arr, d);
        
        System.out.println("print the array after rotation :=");
        ar.printarr(arr, n);


    }
    
}
