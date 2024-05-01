import java.util.Scanner;
public class rotate_ayyay_by_k {

    public void rotate_array(int arr[],int n,int k){
        int mod=k%n;

        for(int i=0;i<n;++i){
            
            System.out.print(arr[(i+mod)%n]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array :=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("enter the araay element at index:="+i);
            arr[i]=sc.nextInt();

        }
        System.out.println("enter the value of kth position of rotation :=");
        int k=sc.nextInt();
        rotate_ayyay_by_k ak=new rotate_ayyay_by_k();
        ak.rotate_array(arr, n, k);

    }
}
