import java.util.Scanner;
public class even_odd_count_in_array {

    public static void  even_odd(int arr[],int n){
        int a[]=new int[2];

        int even=0;
        int odd=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            } else{
                odd++;  
            }
        }
        a[0]=odd;
        a[1]=even;

        System.out.println("print odd,even count :=");
        for(int i=0;i<2;i++){
            System.out.print(a[i]+" ");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n :=");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("enter the value of array :=");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        even_odd(arr, n);

         
    }
}
