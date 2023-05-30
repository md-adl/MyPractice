import java.util.*;
public class isLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = sc.nextInt();
        if(year %100 ==0 && year%400==0){
            System.out.println("You entered year is Leap Year");
        }
        else if (year %100!=0 && year %4==0)
        {
            System.out.println(" You entered year is Leap Year");
        }else
        {
            System.out.println("You Entered Year is Not a Leap Year");
        }
    }
}
