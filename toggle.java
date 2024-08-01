package string;
import java.util.Scanner;
public class toggle {

    public static void toggl(char arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=65&&arr[i]<=90){
                 arr[i]=(char) (arr[i]+32);
            }else{
                arr[i]=(char) (arr[i]-32);
            }
        }
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of String :=");
        String st=sc.nextLine();
         
        char arr[]=st.toCharArray();
      
        toggl(arr);
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
