import java.util.Scanner;

public class number_trangle {

    public int possibal_trangle(int arr[],int n){
        int ct=0;

        for(int i=0; i<n; i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]>=arr[k]){
                        ct++;
                    }
                }
            }
        }
        return ct++;
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
        number_trangle nt=new number_trangle();
        int ans=nt.possibal_trangle(arr, n);

        System.out.println("number of trangle is:"+ans);
    }
}
