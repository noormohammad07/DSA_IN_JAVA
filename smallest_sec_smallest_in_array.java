import java.util.Scanner;
public class smallest_sec_smallest_in_array {

    public int[] minAnd2ndMin(int a[], int n)  
    {
        int first=Integer.MAX_VALUE;
       int second=Integer.MAX_VALUE;
        
        int arr[]=new int[2];
        if(n<2){
            return new int[]{-1};
        }
       
        int ct=0;
        for(int i=0; i<n;i++){
            if(a[i]<first){
                second=first;
                first=a[i];
                ct++;
            }else if(a[i]<second&&a[i]!=first){
                second=a[i];
                ct++;
            }
         }
         if(ct==1){
             return new int[]{-1};
         }
         arr[0]=first;
         arr[1]= second;
        
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n :=");
        int n=sc.nextInt();
        System.out.println("enter the value of array :=");
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
      smallest_sec_smallest_in_array s=new smallest_sec_smallest_in_array();

        int ans[]=new int[2];
        ans=s.minAnd2ndMin(a,n);
        System.out.print("smallest,sec smallest :=");
        for(int i=0;i<2;i++){
            System.out.print(" "+ans[i]);
        }

        
    }
}
