import java.util.*;
public class IsPrime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = 2;

        while (div<n){
            if(n%div == 0){
                System.out.println("Number is not prime");
                break;
            }
            else {
                div = div+1;
            }
        }
        System.out.println("Number is prime");


    }
}
