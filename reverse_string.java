import java.util.Scanner;

public class reverse_string {

    public void rev(char []arrs){
        int l=arrs.length;
        for(int i=l-1; i>=0;i--){
            System.out.print(arrs[i]);
        }
        System.out.println();
    }
   public static void main(String[] args) {
    reverse_string rv=new reverse_string();
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the string = ");
    String str=sc.nextLine();
    char []arrs=str.toCharArray();
     rv.rev(arrs);
   }
}
