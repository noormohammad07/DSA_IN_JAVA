import java .util.Scanner;
public class day_week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=0;
        int week=0;
        while(week<4){
            while(day<7){
                System.out.println("day++");
                day++;
            }
            week++;
        }

        System.out.println(week+"week"+"="+day+"days.");
    }
}
