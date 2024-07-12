import java.util.Scanner;
public class Armstrong_num_in_given_range {
    
    public static boolean is_amstrong(int num){
        int originalNumber = num;
        int numberOfDigits = String.valueOf(num).length();
        int cube_sum = 0;
        
        while (num > 0) {
            int lastDigit = num % 10;
            cube_sum = cube_sum + (lastDigit*lastDigit*lastDigit);
            num = num / 10;
        }
    
        return originalNumber == cube_sum;
    }
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of range starting to ending :=");
        int r1=sc.nextInt();
        int r2=sc.nextInt();

        while(r1<r2){
             boolean ans=is_amstrong(r1);
             if(ans==true){
                System.out.println(r1+" ");
                
             }
             r1++;
        }
    }
}
