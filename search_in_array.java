import java.util.Scanner;
public class search_in_array {

    public boolean ser_arry(int []arr,int s){
        int n= arr.length;
        boolean b=false;
        for(int i=0; i<n; i++){
            if(arr[i]==s){
               b=true;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of n :-");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("enter the element in array ="+n);
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("enter the search element :=");
        int scerch =sc.nextInt();
        search_in_array ob=new search_in_array();

        boolean ans=ob.ser_arry(arr, scerch);

         System.out.println(" is value present :="+ans);
    }
    
}
