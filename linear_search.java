import java.util.Scanner;
public class linear_search {

    public int L_serch(int arr[],int s,int n){
        int ans=0;
        for(int i=0;i<n;i++){
            if(arr[i]==s){
                return i;
            }
        }
        return ans;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of size of array :");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("enther the element in array at index :"+i);
        arr[i]=sc.nextInt();

    }
    System.out.println("enter the search element :=");
    int ser=sc.nextInt();

     linear_search ls=new linear_search();
     int result=ls.L_serch(arr, ser, n);

     if(result==0){
        System.out.println("element is not present in array :");
     }else{
        System.out.println("element is found in arry at index :"+result);
     }
   }    
    
}
