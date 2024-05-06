import java.util.Scanner;

public class find_index {

    public static void findIndex(int arr[], int n, int key) 
    { 
        //code here.
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
       // boolean flag=false;
        for(int i=0;i<n;i++){
            
            if(arr[i]==key){
                ans[1]=i;
                if(ans[0]==-1){
                  
                  ans[0]=i;
                }
              
            }
             
         
        }
        printarr(ans, 2);
     
    }

    public static void printarr(int arr[],int n){
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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

       System.out.println("enter the value of key :=");
        int key=sc.nextInt();  

        printarr(arr, n);

        System.out.println("first index  ,"+"last index");
        findIndex(arr, n, key);

        
    }
      
    
}
