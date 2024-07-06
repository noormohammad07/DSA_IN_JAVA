import java.util.Scanner;
public class variable_datatype {
    public static void main(String[] args) {
        
        //  creating a variable...
        // Integer type.....
        // initialise by 150.....

        int ram=150;

        //  take input the data by keybord ....
        //  import the Scanner library 

        //   creating object 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of key :=");
        int key=sc.nextInt();


        //print the data stored in both variable ...

        System.out.print("ram value :="+ram+"   "+"key value :="+key);
        
    }
}
