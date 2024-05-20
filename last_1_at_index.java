import java.util.Scanner;
public class last_1_at_index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of string of 0,1 :=");
        String s=sc.nextLine();

        int n=s.length();
        int index=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                index=i;
            }
        }

        System.out.println("last 1 at index :="+index);
    }
}
