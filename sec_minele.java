import java.util.Scanner;
public class sec_minele {

    public int sec_ele(int arr[],int n){
        int min=arr[0];
        int sec_min=arr[1];
        for(int i=2; i<n; i++){
            if(arr[i]<min){
                sec_min=min;
                min=arr[i];

            }else if(arr[i]<sec_min && arr[i]!=min){
                sec_min=arr[i];
            }
        }
        System.out.println("min element = "+min);
        return sec_min;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of n :=");
       int n=sc.nextInt();
       int arr[]=new int[n];
       
       System.out.println("enter the value of n size array ="+n);
       for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
       }

       sec_minele se=new sec_minele();
       int ans=se.sec_ele(arr,n);
       System.out.println("sec min element ="+ans);
    }
    
}
