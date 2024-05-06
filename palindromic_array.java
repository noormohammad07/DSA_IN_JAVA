import java.util.Scanner;

public class palindromic_array {

// function for checking array is pelindromic or not :    
    public static int palinArray(int[] arr, int n)
           {
                  //add code here.
                 int flag=0;
                  for(int i=0; i<n;i++){
                      boolean check=palindrom(arr[i]);
                      if(check){
                          flag=1;
                      }else{
                          flag=0;
                          break;
                      }
                  }
                  if(flag==1){
                      return 1;
                  }else{
                      return 0;
                  }
           }
//function  for checking element is palindrom or not:           
    public static boolean palindrom(int num){
        int rev=0;
        int n=num;
        while(num>0){
            int last=num%10;
            rev=rev*10+last;
            num=num/10;
        }
        if(rev==n){
            return true;
        }else{
            return false;
        }
    }

//  Main method :=    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n :=");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n;i++){
        System.out.println("enter the value of array:=");
        arr[i]=sc.nextInt();
        }

        int ans=palinArray(arr, n);
        System.out.println("If array is pelindromic output 1 ,else 0 :=");
        System.out.println("out put ="+ans);
         
    }
    
}
